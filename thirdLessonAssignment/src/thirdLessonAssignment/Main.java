package thirdLessonAssignment;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setId(1);
		student.setFirstName("Gülistan");
		student.setLastName("Ay");
		student.setEmail("gulistanayy@gmail.com");
		student.setPassword("123456");
		student.setCourses("Java - React Kampı");
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engin@demirog.com");
		instructor.setPassword("987654");
		instructor.setCourses("Python Kampı");
		instructor.setDescription("Yazılım geliştirmeye lisede \"yazılım\" bölümünde okurken başladım. Üniversite hayatıma ÖSS 2003 Türkiye ...");
		
		UserManager userManager = new UserManager();
		userManager.logIn(student);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student);
		
		userManager.logOut(student);
		
		System.out.println("----------------------------------------------------------");
		
		UserManager userManager2 = new UserManager();
		userManager2.logIn(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourse(instructor);
		
		instructorManager.addAssignment(instructor);
		
		userManager.logOut(instructor);
		
	}

}
