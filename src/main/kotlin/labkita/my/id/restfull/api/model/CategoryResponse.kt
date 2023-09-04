package labkita.my.id.restfull.api.model

import java.util.Date

data class CategoryResponse (
    val id: String,
    val name: String,
    val description: String?,
    val createdAt: Date,
    val updatedAt: Date?
)