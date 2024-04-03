package server.sumit.data.model

import kotlinx.serialization.Serializable

@Serializable
data class DeveloperInfo(
    val name : String = "Sumit Behera",
    val github : String = "https://github.com/sumitbehera1508",
    val linkedIn : String = "https://www.linkedin.com/in/sumit-behera-24a52b258/",
    val email : String = "s1508b@gmail.com",
    val mobile : String = "+917064825505"
)
