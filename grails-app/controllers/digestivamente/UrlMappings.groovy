package digestivamente

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/indexImage" , controller: "indexImage")
        "/index"(view:"/indexList")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
