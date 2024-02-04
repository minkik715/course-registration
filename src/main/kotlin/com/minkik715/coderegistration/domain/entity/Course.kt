package com.minkik715.coderegistration.domain.entity

import jakarta.persistence.*
import java.util.*

@Entity
class Course {
    @Id
    val id: String = UUID.randomUUID().toString()


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="course_spec_id")
    lateinit var courseSpec: CourseSpec

    @Enumerated(EnumType.STRING)
    lateinit var type: CourseType

    lateinit var tenantId: String

    lateinit var semester: Semester

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="professor_id")
    lateinit var professor: Professor

    var capacity: Int = 40

    var deleted = false
}