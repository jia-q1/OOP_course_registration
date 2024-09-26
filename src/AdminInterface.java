
public interface AdminInterface {
	    void deleteCourse(String courseId);
	    void editCourse(String courseId, String newInstructor, int newMaxStudents, String newLocation);	   
	    void displayCourse(String courseid);
	    void registerStudent(String studentName, String courseId);
	    void viewAllCourses();
	    void viewFullCourses();
	    void writeFullCoursesToFile();
	    void viewStudentsInCourse(String courseId);
	    void viewCoursesOfStudent(String studentName);
	    void sortCoursesByCurrentStudents();
		void createCourse(String coursename, String courseid, int maxcoursestudents, String instructorN, int sectionnum,
				String courseloc);
}

