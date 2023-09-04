package labkita.my.id.restfull.api.repository

import labkita.my.id.restfull.api.entity.Category
import org.springframework.data.jpa.repository.JpaRepository

interface CategoryRepository : JpaRepository <Category, String> {
}