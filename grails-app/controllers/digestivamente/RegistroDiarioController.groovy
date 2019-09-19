package digestivamente

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class RegistroDiarioController {

    RegistroDiarioService registroDiarioService
    static String nombre = "Registros Diarios"

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond registroDiarioService.list(params), model:[registroDiarioCount: registroDiarioService.count()]
    }

    def show(Long id) {
        respond registroDiarioService.get(id)
    }

    def create() {
        respond new RegistroDiario(params)
    }

    def save(RegistroDiario registroDiario) {
        if (registroDiario == null) {
            notFound()
            return
        }

        try {
            registroDiarioService.save(registroDiario)
        } catch (ValidationException e) {
            respond registroDiario.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'registroDiario.label', default: 'RegistroDiario'), registroDiario.id])
                redirect registroDiario
            }
            '*' { respond registroDiario, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond registroDiarioService.get(id)
    }

    def update(RegistroDiario registroDiario) {
        if (registroDiario == null) {
            notFound()
            return
        }

        try {
            registroDiarioService.save(registroDiario)
        } catch (ValidationException e) {
            respond registroDiario.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'registroDiario.label', default: 'RegistroDiario'), registroDiario.id])
                redirect registroDiario
            }
            '*'{ respond registroDiario, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        registroDiarioService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'registroDiario.label', default: 'RegistroDiario'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'registroDiario.label', default: 'RegistroDiario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
