package digestivamente

import grails.validation.ValidationException

import static org.springframework.http.HttpStatus.*

class IndexImageController {

    static String nombre = "IndexImage"

    def index() {
        render(view: '/indexImage')
    }

    def redirect() {
        redirect(url:"/index")
    }

}