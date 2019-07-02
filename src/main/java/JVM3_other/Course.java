package JVM3_other;

/**
 * Course type
 */
public enum Course {
    BACKEND_DEVELOPER("Backend Developer"),
    FRONTEND_DEVELOPER("Frontend Developer"),
    AI_ENGINEER("AI Engineer"),
    DEV_OPS("Dev ops");

    private String courseName;

    /**
     * Create new course type
     *
     * @param courseName course name
     */
    Course(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Get course type name
     *
     * @return course name
     */
    public String getCourseName() {
        return courseName;
    }
}

