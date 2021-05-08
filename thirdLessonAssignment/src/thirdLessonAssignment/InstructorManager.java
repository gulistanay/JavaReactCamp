package thirdLessonAssignment;

public class InstructorManager extends UserManager{

	public void addCourse(User user) {
		System.out.println("Kurs baþarýyla eklendi: " + user.getCourses());
	}
	public void addAssignment(User user) {
		System.out.println(user.getCourses() + "na ödev eklendi.");
	}
}
