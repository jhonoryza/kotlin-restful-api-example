package labkita.my.id.restfull.api.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "categories")
data class Category(
    @Id
    val id: String,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "description")
    val description: String?,

    @Column(name = "createdAt", nullable = false)
    val createdAt: Date,

    @Column(name = "updatedAt")
    val updatedAt: Date?
)