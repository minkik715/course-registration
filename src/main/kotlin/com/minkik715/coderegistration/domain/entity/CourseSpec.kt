package com.minkik715.coderegistration.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class CourseSpec {

    @Id
    val id: String = UUID.randomUUID().toString()

    lateinit var name: String

    lateinit var tenantId: String

    val createdAt: Long = System.currentTimeMillis()

    var deleted = false

}