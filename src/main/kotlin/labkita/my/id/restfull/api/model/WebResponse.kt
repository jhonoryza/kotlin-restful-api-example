package labkita.my.id.restfull.api.model

data class WebResponse <T> (
    val code: Int,
    val message: String,
    val data: T
)