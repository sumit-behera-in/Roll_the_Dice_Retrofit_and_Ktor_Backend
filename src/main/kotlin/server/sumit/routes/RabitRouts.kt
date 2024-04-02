package server.sumit.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import server.sumit.Constants.BASE_URL
import server.sumit.data.model.Rabbit

private val rabbits = listOf<Rabbit>(
    Rabbit(
        name = "1",
        description = "One",
        imageUrl = "$BASE_URL/static/rabbitsPhotos/dice1.jpg"
    ),
    Rabbit(
        name = "2",
        description = "Two",
        imageUrl = "$BASE_URL/static/rabbitsPhotos/dice2.jpg"
    ),
    Rabbit(
        name = "3",
        description = "Three",
        imageUrl = "$BASE_URL/static/rabbitsPhotos/dice3.jpg"
    ),
    Rabbit(
        name = "4",
        description = "Four",
        imageUrl = "$BASE_URL/static/rabbitsPhotos/dice4.jpg"
    ),
    Rabbit(
        name = "5",
        description = "Five",
        imageUrl = "$BASE_URL/static/rabbitsPhotos/dice5.jpg"
    ),
    Rabbit(
        name = "6",
        description = "Six",
        imageUrl = "$BASE_URL/static/rabbitsPhotos/dice6.jpg"
    )
)

fun Route.randomRabbit() {
    get(path = "/random-rabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabbits.random()
        )
    }
}