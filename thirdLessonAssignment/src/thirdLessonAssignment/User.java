package thirdLessonAssignment;

public class User {
	private int id;
	private String courses; 
	private String email;
	
	public User() {}

	public User(int id, String courses, String email) {
		this();
		this.id = id;
		this.courses = courses;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
