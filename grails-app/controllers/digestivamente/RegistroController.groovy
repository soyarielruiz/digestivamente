package digestivamente

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*
import java.time.format.DateTimeFormatter
import java.time.LocalDateTime

class RegistroController {

    RegistroService registroService
    static String nombre = "Registros Individuales"

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond registroService.list(params), model:[registroCount: registroService.count()]
    }

    def show(Long id) {
        respond registroService.get(id)
    }

    def create() {
        respond new Registro(params)
    }

    def save(Registro registro) {
        if (registro == null) {
            notFound()
            return
        }
        //Adding local time
        registro.hora = LocalDateTime.now()

        try {
            registroService.save(registro)
        } catch (ValidationException e) {
            respond registro.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'registro.label', default: 'Registro'), registro.id])
                redirect registro
            }
            '*' { respond registro, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond registroService.get(id)
    }

    def update(Registro registro) {
        if (registro == null) {
            notFound()
            return
        }

        //Adding local time
        registro.hora = LocalDateTime.now()

        try {
            registroService.save(registro)
        } catch (ValidationException e) {
            respond registro.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'registro.label', default: 'Registro'), registro.id])
                redirect registro
            }
            '*'{ respond registro, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        registroService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'registro.label', default: 'Registro'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'registro.label', default: 'Registro'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
