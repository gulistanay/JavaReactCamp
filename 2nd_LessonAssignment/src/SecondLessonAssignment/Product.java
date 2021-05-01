package SecondLessonAssignment;

public class Product {

	public Product() {}
	
	
	int courseId;
	String courseName;
	String courseInstructor;
	int courseStatus;
	String courseDesc;


	
	public Product (int courseId, String courseName,String courseInstructor, int courseStatus, String courseDesc) 
	{
		this();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.courseStatus = courseStatus;
		this.courseDesc = courseDesc;
	}

}