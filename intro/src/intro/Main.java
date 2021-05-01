package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "Ýnternet Þubeye Gir";
		System.out.println(internetSubeButonu);
		
		double dolarDun = 8.18;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		
		
		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";
		String kredi7 = "Kültür Bakanlýðý Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler = {
				"Hýzlý Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"Kültür Bakanlýðý Kredisi"
				
		};
		
		System.out.println("--------------------------");
		
		//Foreach - Krediler dizisindeki elemanlarý tek tek dolaþýr
		for (String kredi: krediler) {
			System.out.println(kredi);
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		System.out.println("--------------------------");
		
		int sayi1 = 10;  // Deðer Tip olduðu için deðer atamasý yapýlýr ve baðlantý kopar.
		int sayi2 = 20;  //Bu nedenle sonuç eski deðerde yani 20 de kalýr.
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		 int[] sayilar1 = {1,2,3,4,5}; //Diziler ise referans tiptir. Deðeri deðil adresi tutarlar.
		 int[] sayilar2 = {10,20,30,40,50}; //Güncellenmiþ deðeri verir.
		 sayilar1 = sayilar2;
		 sayilar2[0] = 100;
		 System.out.println(sayilar1[0]);
		 
		 //Deðer Tipler: int, float, double, boolean, byte, enum
		 //Referans Tipler: Diziler, classlar, abstract classlar, interface
		 //String ise istisnai durumdur. Primitive tiptir, arkaplanda char array olarak tutulur. Referans tip olmasýna raðmen arkaplanda deðer tip gibi çalýþýr.
		 
		 String sehir1 = "Ankara";
		 String sehir2 = "Ýstanbul";
		 sehir1 =sehir2;
		 sehir2 = "Ýzmir";
		 System.out.println(sehir1);  //Ekrana Ýstanbul yazar.
		 
	}

}
