package com.minkik715.coderegistration.domain.entity

import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import java.util.UUID

@Entity
class StudentRegCourse {

    @Id
    val id = UUID.randomUUID().toString()

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    lateinit var student: Student

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    lateinit var course: Course
}