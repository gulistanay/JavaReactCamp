package SecondLessonAssignment;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Java + React Kursu", "Engin Demiro�", 35, " " );
		Product product2 = new Product(2, "Programlamaya Giri� ��in Temel Kurs","Engin Demiro�", 0, "Python, Java, C# gibi t�m programlama dilleri i�in temel ...");
		Product product3 = new Product(3, "C# + Angular Kursu", "Engin Demiro�", 22, " " );
	
		Product[] products = {product1, product2, product3};

		for(Product product : products) {
			System.out.println(product.courseName);
		}
		
		System.out.println("------------------------");
		
		ProductServices productServices = new ProductServices();
		productServices.goToCourse(product1);
		
		ProductServices productServices2 = new ProductServices();
		productServices2.skipToNextLesson(product1);
		
		//Kurslar �zellik nesneleri, kursa t�klama i�lemiyle kurs program�n�n a��lmas� i� yapan class
		//Profil bilgileri �zellik nesneleri, profili d�zenle i� yapan method
		
		
		System.out.println("------------------------");

		
		User user1 = new User(1, "G�listan Ay", "gulistanayy@gmail.com", "123456");
		User user2 = new User(2, "Engin Demiro�", "engin@demirog.com", "qwerty" );
		
		User[] users = {user1, user2};
		
		for (User user : users) {
			System.out.println(user.name);
		}
		
		System.out.println("------------------------");

		
		ProductServices user = new ProductServices();
		user.logIn(user1);
		
		
	}

}
