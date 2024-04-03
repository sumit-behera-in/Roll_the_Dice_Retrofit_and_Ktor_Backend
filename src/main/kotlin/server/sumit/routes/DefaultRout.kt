package server.sumit.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import server.sumit.data.model.DeveloperInfo

fun Route.defaultRoute(){
    get {
        call.respond(
            HttpStatusCode.OK,
            DeveloperInfo()
        )
    }
}