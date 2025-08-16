public class Main {
    public static void main(String[] args) {


        StudentRegistry registry = new StudentRegistry();

        // Enroll students
        registry.enrollStudent("Harshit");
        registry.enrollStudent("Harshit");
        registry.enrollStudent("Harshit");
        registry.enrollStudent("Harshit");
        registry.enrollStudent("Ayush Patel");
        registry.enrollStudent("harsh");
        registry.enrollStudent("Harshit");
 
        // Register courses
        registry.registerCourse("Java 101");
        registry.registerCourse("Python 101");
        registry.registerCourse("Data Structures");

        // Assign grades
        registry.assignGrade("Ayush Patel", "Java 101", 90);
        registry.assignGrade("harsh", "Python 101", 85);
        registry.assignGrade("Harshit", "Data Structures", 95);

        // Print all enrolled students
        System.out.println("\n Enrolled Students:");
        for(String student : registry.getEnrolledStudents()) {
            System.out.println(student);
        }

        // Print all available courses
        System.out.println("\n Available Courses:");
        for(String course : registry.getAvailableCourses()) {
            System.out.println(course);
        }

        // Print student grades
        System.out.println("\n Grades:");
        for(String student : registry.getEnrolledStudents()) {
            for(String course : registry.getAvailableCourses()) {
                Integer grade = registry.getGrade(student, course);
                if(grade != null) {
                    System.out.println(student + " got " + grade + " in " + course);
                }
            }
        }
    }
}
