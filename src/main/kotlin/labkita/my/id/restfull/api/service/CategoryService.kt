package labkita.my.id.restfull.api.service

import labkita.my.id.restfull.api.entity.Category
import labkita.my.id.restfull.api.model.CategoryRequest
import labkita.my.id.restfull.api.model.CategoryResponse
import labkita.my.id.restfull.api.repository.CategoryRepository
import org.springframework.stereotype.Service
import java.util.Date
import java.util.UUID

@Service
class CategoryService(private val categoryRepository: CategoryRepository) : CategoryServiceInterface {
    override fun store(categoryRequest: CategoryRequest): CategoryResponse {
        val category = Category(
            id = UUID.randomUUID().toString(),
            name = categoryRequest.name,
            description = categoryRequest.description,
            createdAt = Date(),
            updatedAt = null
        )

        categoryRepository.save(category)

        return CategoryResponse(
            id = category.id,
            name = category.name,
            description = category.description,
            createdAt = category.createdAt,
            updatedAt = category.updatedAt
        );
    }
}