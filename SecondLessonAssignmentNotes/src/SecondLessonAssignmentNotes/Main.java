package SecondLessonAssignmentNotes;

public class Main {
	
/*
 * 
 * 
 	public static void main(String[] args) {
		sayiBulmaca();
	}
	public static void sayiBulmaca() {
		
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayý mevcuttur: " + aranacak);
		}else {
			mesajVer("Sayý mevcut deðildir: " + aranacak);
		}
	}
		
	public static void mesajVer(String mesaj) { //Parametreli method
		System.out.println(mesaj);

	} 
	
*
*
*/
	   	
		// 25.Video Notlarý
		
/*
 * 
 * 
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		
	}
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	public static int topla( int sayi1, int sayi2) {
		return sayi1+sayi2 ;
	}
	public static String sehirVer() {
		return "Ankara";
	}
*
*
*/
	
	
	//26.video
/*
 * 
 * 
	public static void main(String[] args) {
		
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
	}
	public static int topla2(int... sayilar) { //Nesneler için test edilebilirliði zayýf
		int toplam = 0;
		for(int sayi: sayilar ) {
			toplam+=sayi;
		}
		return toplam;
	}
 * 
 * 
 */
	
	
	//27-28. video
	
/*
 * 
 * 
 
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
	}
	
* 
* 
*/
	
	
	//30.Video
/*
* 
*  
	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int sonuc = dortIslem.Topla(3, 4);  //Classlarýn en temel özelliði ortak operasyonlarý tutmak.
		System.out.println(sonuc);
	}
* 
* 
*/  
	
	//31-32-33.Video

/*
* 
*  
	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3); 
	
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod()); //Ürün isminin ilk harfi ve id yi yanyana yazar. Burada: L1
		
		
	}
* 
* 
*/
	
	//35. video
	public static void main(String[] args) {

		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.Topla(2, 3));
		System.out.println(dortIslem.Topla(2, 3, 5));  //Method Overloading
	}
	
	
}
