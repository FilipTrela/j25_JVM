package JVM3_other;

import java.util.List;
import java.util.Set;

/**
 * javadoc src/pl/sda/jvm/javadoc/* -d javadoc
 * <p>
 * Software Development Academy School implementation
 */
public class SDAcademySchool implements School {
    @Override
    public void addStudent(Student student) {
    }

    @Override
    public void addStudent(String firstName, String lastName, int age, Set<Course> courses) {
    }

    @Override
    public Student getStudentByFirstNameAndLastName(String firstName, String lastName) {
        return null;
    }

    @Override
    public List<Student> getStudentsByCourse(Course course) {
        return null;
    }
}
