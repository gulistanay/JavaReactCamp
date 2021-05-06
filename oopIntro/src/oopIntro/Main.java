package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Lenovo V14", 15000, "16 GB Ram",10 ); //Örnek oluþturma, referans oluþturma, instance

		
		Product product2 = new Product(); 
		product2.setId(2);
		product2.setName("Lenovo V15");
		product2.setDetail("16 Gb Ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());

		
		
		
//		
//		Product product3 = new Product(); 
//		
//		
//		
//		Product[] products = {product1, product2, product3};
//		
//		//products arrayindeki her bir product ý gez. Veri türü Product
//		//Veri türü - Takma isim - Array
//		for(Product product : products) {
//			System.out.println(product.name);
//		}
//		
//		System.out.println(products.length);
//		
//		
//		Category category1 = new Category();
//		category1.id = 1;
//		category1.name = "Bilgisayar";
//		
//		Category category2 = new Category();
//		category2.id = 2;
//		category2.name = "Ev/Bahçe";
//		
//		//Veri tipi - takma isim
//		ProductManager productManager = new ProductManager();
//		productManager.addToCart(product1); //Metot bir dataya ihtiyaç duyuyorsa bu parantezin içine datayý koyup yollayabiliyoruz. Buna parametre deniyor.
//		
//		productManager.addToCart(product2);
//		
//		productManager.addToCart(product3);
//
//		
//		
	}

}



