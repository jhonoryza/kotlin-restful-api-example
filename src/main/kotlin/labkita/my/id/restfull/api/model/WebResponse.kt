package labkita.my.id.restfull.api.model

data class WebResponse(
    val code: Int,
    val message: String,
    val data: CategoryResponse
)