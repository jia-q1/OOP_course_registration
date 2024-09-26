import java.util.ArrayList;

public class user {
	protected String username;
	protected String password;
	protected String fname;
	protected String lname;
	
	public user(String username, String password, String fname, String lname) {
        this.username = username;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void viewAllCourses(ArrayList<courses> courses) {
		
	}

	public void viewAvailableCourses(ArrayList<courses> courses) {
		
	}

	public void registerInCourse(String courseId, ArrayList<courses> courses) {
		
	}

	public void createCourse(String coursename, String courseid, int maxcoursestudents, String instructorN,
			int sectionnum, String courseloc) {
		
	}
	
	public void editCourse(String courseId, String newInstructor, int newMaxStudents, String newLocation) {
    	
    }
	
}
