package labkita.my.id.restfull.api.entity

import java.util.*
import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id

@Entity
@Table(name = "categories")
data class Category(
    @Id
    val id: String,

    @Column(name = "name")
    val name: String,

    @Column(name = "description")
    val description: String,

    @Column(name = "createdAt")
    val createdAt: Date,

    @Column(name = "updatedAt")
    val updatedAt: Date
)