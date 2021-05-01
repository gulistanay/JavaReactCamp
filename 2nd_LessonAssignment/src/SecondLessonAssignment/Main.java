package SecondLessonAssignment;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Java + React Kursu", "Engin Demiroð", 35, " " );
		Product product2 = new Product(2, "Programlamaya Giriþ Ýçin Temel Kurs","Engin Demiroð", 0, "Python, Java, C# gibi tüm programlama dilleri için temel ...");
		Product product3 = new Product(3, "C# + Angular Kursu", "Engin Demiroð", 22, " " );
	
		Product[] products = {product1, product2, product3};

		for(Product product : products) {
			System.out.println(product.courseName);
		}
		
		System.out.println("------------------------");
		
		ProductServices productServices = new ProductServices();
		productServices.goToCourse(product1);
		
		ProductServices productServices2 = new ProductServices();
		productServices2.skipToNextLesson(product1);
		
		//Kurslar özellik nesneleri, kursa týklama iþlemiyle kurs programýnýn açýlmasý iþ yapan class
		//Profil bilgileri özellik nesneleri, profili düzenle iþ yapan method
		
		
		System.out.println("------------------------");

		
		User user1 = new User(1, "Gülistan Ay", "gulistanayy@gmail.com", "123456");
		User user2 = new User(2, "Engin Demiroð", "engin@demirog.com", "qwerty" );
		
		User[] users = {user1, user2};
		
		for (User user : users) {
			System.out.println(user.name);
		}
		
		System.out.println("------------------------");

		
		ProductServices user = new ProductServices();
		user.logIn(user1);
		
		
	}

}
