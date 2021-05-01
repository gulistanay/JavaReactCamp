package intro;

public class Main {

	public static void main(String[] args) {
		
		String internetSubeButonu = "�nternet �ubeye Gir";
		System.out.println(internetSubeButonu);
		
		double dolarDun = 8.18;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		
		if (dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar e�ittir resmi");
		}
		
		
		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "�ift�i Kredisi";
		String kredi5 = "Msb Kredisi";
		String kredi6 = "Meb Kredisi";
		String kredi7 = "K�lt�r Bakanl��� Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		String[] krediler = {
				"H�zl� Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"K�lt�r Bakanl��� Kredisi"
				
		};
		
		System.out.println("--------------------------");
		
		//Foreach - Krediler dizisindeki elemanlar� tek tek dola��r
		for (String kredi: krediler) {
			System.out.println(kredi);
		}
		
		System.out.println("--------------------------");
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		System.out.println("--------------------------");
		
		int sayi1 = 10;  // De�er Tip oldu�u i�in de�er atamas� yap�l�r ve ba�lant� kopar.
		int sayi2 = 20;  //Bu nedenle sonu� eski de�erde yani 20 de kal�r.
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		 int[] sayilar1 = {1,2,3,4,5}; //Diziler ise referans tiptir. De�eri de�il adresi tutarlar.
		 int[] sayilar2 = {10,20,30,40,50}; //G�ncellenmi� de�eri verir.
		 sayilar1 = sayilar2;
		 sayilar2[0] = 100;
		 System.out.println(sayilar1[0]);
		 
		 //De�er Tipler: int, float, double, boolean, byte, enum
		 //Referans Tipler: Diziler, classlar, abstract classlar, interface
		 //String ise istisnai durumdur. Primitive tiptir, arkaplanda char array olarak tutulur. Referans tip olmas�na ra�men arkaplanda de�er tip gibi �al���r.
		 
		 String sehir1 = "Ankara";
		 String sehir2 = "�stanbul";
		 sehir1 =sehir2;
		 sehir2 = "�zmir";
		 System.out.println(sehir1);  //Ekrana �stanbul yazar.
		 
	}

}
