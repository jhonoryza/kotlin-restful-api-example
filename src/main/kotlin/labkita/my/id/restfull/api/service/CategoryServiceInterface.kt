package labkita.my.id.restfull.api.service

import labkita.my.id.restfull.api.model.CategoryRequest
import labkita.my.id.restfull.api.model.CategoryResponse

interface CategoryServiceInterface {
    fun store(categoryRequest: CategoryRequest): CategoryResponse
}