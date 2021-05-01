package SecondLessonAssignment;

public class User {

	public User() {}  //Constructor
	
	int id;
	String name;
	String email;
	String password;
	
	public User(int id, String name, String email, String password) {
		//this();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}
}
