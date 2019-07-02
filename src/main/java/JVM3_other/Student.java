package JVM3_other;

import java.util.Set;

/**
 * Student representation
 */
public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Set<Course> courses;

    /**
     * Create student with fields
     *
     * @param firstName First name
     * @param lastName  Last Name
     * @param age       Age
     * @param courses   List of the courses
     */
    public Student(String firstName, String lastName, int age, Set<Course> courses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courses = courses;
    }

    /**
     * Get student first name
     *
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Get student last name
     *
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Get student age
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Get set of the courses
     *
     * @return set of courser
     * @see Course
     */
    public Set<Course> getCourses() {
        return courses;
    }
}

