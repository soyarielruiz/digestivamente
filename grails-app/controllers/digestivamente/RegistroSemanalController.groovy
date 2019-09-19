package digestivamente

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class RegistroSemanalController {

    RegistroSemanalService registroSemanalService
    static String nombre = "Registros Semanales"

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond registroSemanalService.list(params), model:[registroSemanalCount: registroSemanalService.count()]
    }

    def show(Long id) {
        respond registroSemanalService.get(id)
    }

    def create() {
        respond new RegistroSemanal(params)
    }

    def save(RegistroSemanal registroSemanal) {
        if (registroSemanal == null) {
            notFound()
            return
        }

        try {
            registroSemanalService.save(registroSemanal)
        } catch (ValidationException e) {
            respond registroSemanal.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'registroSemanal.label', default: 'RegistroSemanal'), registroSemanal.id])
                redirect registroSemanal
            }
            '*' { respond registroSemanal, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond registroSemanalService.get(id)
    }

    def update(RegistroSemanal registroSemanal) {
        if (registroSemanal == null) {
            notFound()
            return
        }

        try {
            registroSemanalService.save(registroSemanal)
        } catch (ValidationException e) {
            respond registroSemanal.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'registroSemanal.label', default: 'RegistroSemanal'), registroSemanal.id])
                redirect registroSemanal
            }
            '*'{ respond registroSemanal, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        registroSemanalService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'registroSemanal.label', default: 'RegistroSemanal'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'registroSemanal.label', default: 'RegistroSemanal'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
