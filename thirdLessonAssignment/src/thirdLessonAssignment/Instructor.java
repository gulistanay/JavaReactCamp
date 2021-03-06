package thirdLessonAssignment;

public class Instructor extends User{
	private String firstName;
	private String lastName;
	private String password;
	private String description;
	
	public Instructor() {}

	public Instructor(String firstName, String lastName, String password, String description) {
		this();

		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.description = description;
	}
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
