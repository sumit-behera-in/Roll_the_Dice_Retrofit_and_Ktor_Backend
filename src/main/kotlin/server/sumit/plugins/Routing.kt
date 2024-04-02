package server.sumit.plugins

import io.ktor.server.application.Application
import io.ktor.server.http.content.resources
import io.ktor.server.http.content.static
import io.ktor.server.routing.routing
import server.sumit.routes.randomRabbit

fun Application.configureRouting() {
    routing {

        randomRabbit()

        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
