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
        imageUrl = "$BASE_URL/static/dice/Dice1.svg"
    ),
    Dice(
        name = "2",
        description = "Two",
        imageUrl = "$BASE_URL/static/dice/Dice2.svg"
    ),
    Dice(
        name = "3",
        description = "Three",
        imageUrl = "$BASE_URL/static/dice/Dice3.svg"
    ),
    Dice(
        name = "4",
        description = "Four",
        imageUrl = "$BASE_URL/static/dice/Dice4.svg"
    ),
    Dice(
        name = "5",
        description = "Five",
        imageUrl = "$BASE_URL/static/dice/Dice5.svg"
    ),
    Dice(
        name = "6",
        description = "Six",
        imageUrl = "$BASE_URL/static/dice/Dice6.svg"
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