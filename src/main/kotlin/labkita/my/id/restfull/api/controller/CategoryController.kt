package labkita.my.id.restfull.api.controller

import labkita.my.id.restfull.api.model.CategoryRequest
import labkita.my.id.restfull.api.model.WebResponse
import labkita.my.id.restfull.api.service.CategoryService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CategoryController(private val categoryService: CategoryService) {
    @PostMapping(
        value = ["/api/categories"],
        consumes = ["application/json"],
        produces = ["application/json"]
    )
    fun store(@RequestBody categoryRequest: CategoryRequest): WebResponse {
        val data = categoryService.store(categoryRequest)

        return WebResponse(
            code = 201,
            message = "ok",
            data = data
        )
    }
}