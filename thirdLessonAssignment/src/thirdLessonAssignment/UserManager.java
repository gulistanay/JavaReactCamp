package thirdLessonAssignment;

public class UserManager {
	public void logIn(User user) {
		System.out.println(user.getEmail() + " hesabýyla giriþ yapýldý.");
	}
	
	public void logOut(User user) {
		System.out.println(user.getEmail() + " hesabýndan çýkýþ yapýldý.");
	}
}
