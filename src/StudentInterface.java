import java.util.ArrayList;

public interface StudentInterface {
	void viewAllCourses(ArrayList<courses> courses);
    void viewAvailableCourses(ArrayList<courses> courses);
    void registerInCourse(String courseId, ArrayList<courses> courses);
    void withdrawFromCourse(String courseId);
    void viewRegisteredCourses();
}
