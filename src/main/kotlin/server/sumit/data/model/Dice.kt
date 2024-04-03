package server.sumit.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Dice(
    val name: String,
    val description: String,
    val imageUrl: String,
)
