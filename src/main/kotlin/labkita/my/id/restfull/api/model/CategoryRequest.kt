package labkita.my.id.restfull.api.model

import jakarta.validation.constraints.NotBlank

data class CategoryRequest(
    @field: NotBlank
    val name: String,
    val description: String?
)