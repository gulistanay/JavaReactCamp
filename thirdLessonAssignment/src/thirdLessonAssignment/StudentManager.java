package thirdLessonAssignment;

public class StudentManager extends UserManager{
	public void joinCourse(Student student) {
		System.out.println("Kursa kayıt oldunuz: " + student.getCourses());
	}
}
