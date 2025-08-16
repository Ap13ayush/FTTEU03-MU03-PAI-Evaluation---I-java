import java.util.*;

public class StudentRegistry {
    // To store enrolled students
    private List<String> students = new ArrayList<>();
    // To store unique course names
    private Set<String> courses = new HashSet<>();

    // To store student grades for courses
    // Structure: studentName -> (courseName -> grade)
    private Map<String, Map<String, Integer>> grades = new HashMap<>();

    // Enrolls a student (no duplicates)
    public void enrollStudent(String studentName) {
        if (!students.contains(studentName)) {
            students.add(studentName);
        }
    }

    // Returns all enrolled students
    public List<String> getEnrolledStudents() {
        return students;
    }
    // Registers a course (unique only)
    public void registerCourse(String courseName) {
        courses.add(courseName);
    }

    // Returns all available courses
    public Set<String> getAvailableCourses() {
        return courses;
    }

    // Assigns the grade for a student in a course
    public void assignGrade(String studentName, String courseName, int grade) {
        if (!grades.containsKey(studentName)) {
            grades.put(studentName, new HashMap<>());
        }
        grades.get(studentName).put(courseName, grade);
    }

    // Gets the grade for a student in a particular course
    public Integer getGrade(String studentName, String courseName) {
        if (grades.containsKey(studentName)) {
            return grades.get(studentName).get(courseName);
        }
        return null; // Or -1 to signify grade not assigned
    }
}
