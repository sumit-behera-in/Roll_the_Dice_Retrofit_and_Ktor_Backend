package server.sumit.routes

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import server.sumit.Constants.BASE_URL
import server.sumit.data.model.Dice

private val dice = listOf<Dice>(
    Dice(
        name = "1",
        description = "One",
        imageUrl = "$BASE_URL/static/dice/dice1.xml"
    ),
    Dice(
        name = "2",
        description = "Two",
        imageUrl = "$BASE_URL/static/dice/dice2.xml"
    ),
    Dice(
        name = "3",
        description = "Three",
        imageUrl = "$BASE_URL/static/dice/dice3.xml"
    ),
    Dice(
        name = "4",
        description = "Four",
        imageUrl = "$BASE_URL/static/dice/dice4.xml"
    ),
    Dice(
        name = "5",
        description = "Five",
        imageUrl = "$BASE_URL/static/dice/dice5.xml"
    ),
    Dice(
        name = "6",
        description = "Six",
        imageUrl = "$BASE_URL/static/dice/dice6.xml"
    )
)

fun Route.randomDice() {
    get(path ="/random") {
        call.respond(
            HttpStatusCode.OK,
            dice.random()
        )
    }
}