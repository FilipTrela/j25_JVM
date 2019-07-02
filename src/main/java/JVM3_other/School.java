package JVM3_other;

import java.util.List;
import java.util.Set;

/**
 * Interface to implement when we want to open a new IT school
 */
public interface School {
    /**
     * Add new student to the list of students based on student object
     *
     * @param student object
     * @see Student
     */
    void addStudent(Student student);

    /**
     * Add new student to the list of student based on single params
     *
     * @param firstName First name
     * @param lastName  Last name
     * @param age       Age
     * @param courses   Set of courses
     * @see Course
     */
    void addStudent(String firstName, String lastName, int age, Set<Course> courses);

    /**
     * Get student by first name and last name
     *
     * @param firstName First name
     * @param lastName  Last name
     * @return Student
     */
    Student getStudentByFirstNameAndLastName(String firstName, String lastName);

    /**
     * Get list of students by course
     *
     * @param course Type of course
     * @return List of students
     */
    List<Student> getStudentsByCourse(Course course);
}
