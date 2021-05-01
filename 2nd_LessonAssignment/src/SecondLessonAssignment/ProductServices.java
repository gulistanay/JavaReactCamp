package SecondLessonAssignment;

public class ProductServices {
	public void goToCourse(Product product) {
		System.out.println("Kurs programýný görüntülüyorsunuz: " + product.courseName);
	}
	
	public void skipToNextLesson(Product product2) {
		System.out.println("Kurs ilerleme durumunuz: %" + product2.courseStatus + " Sonraki derse geçmek için lütfen %100 tamamlayýn.");
	}
	
	public void logIn(User user) {
		System.out.println(user.name + " olarak giriþ yaptýnýz.");
	}
}
