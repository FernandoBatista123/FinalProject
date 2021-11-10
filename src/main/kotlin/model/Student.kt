package model

import java.util.*

class Student(name: String?, id: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0
    private val students: MutableMap<String?, Student> = HashMap()
    private val courses: MutableList<Course> = ArrayList()
    private val approvedCourses: MutableMap<String?, Course?> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    fun enrollToCourse(course: Course?) {
        if (course != null)
            courses.add(course)
        println("Enrollment completed")
        }

        fun registerApprovedCourse(course: Course) {
            approvedCourses[course.id] = course
        }

        fun isCourseApproved(courseCode: String?): Boolean {
            return (approvedCourses.containsKey(courseCode))
        }

        fun isAttendingCourse(courseCode: String?): Boolean {
            return (approvedCourses.containsKey(courseCode))
        }

        override fun getApprovedCourses(): List<Course> {
            val listaCursos = mutableListOf<Course>()
            approvedCourses.values.forEach { course ->
                if (course != null) {
                    listaCursos.add(course)
                }
            }
            return listaCursos
        }

        override fun toString(): String {
            return "Student {" + super.toString() + "}"
        }
}
