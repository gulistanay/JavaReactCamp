package SecondLessonAssignment;

public class ProductServices {
	public void goToCourse(Product product) {
		System.out.println("Kurs program�n� g�r�nt�l�yorsunuz: " + product.courseName);
	}
	
	public void skipToNextLesson(Product product2) {
		System.out.println("Kurs ilerleme durumunuz: %" + product2.courseStatus + " Sonraki derse ge�mek i�in l�tfen %100 tamamlay�n.");
	}
	
	public void logIn(User user) {
		System.out.println(user.name + " olarak giri� yapt�n�z.");
	}
}
