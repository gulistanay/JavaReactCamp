package thirdLessonAssignment;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getEmail() + " hesab�yla giri� yap�ld�.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getEmail() + " hesab�ndan ��k�� yap�ld�.");
	}
}
