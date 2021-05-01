package FirstLessonAssignmentNotes;

import java.util.Iterator;

public class FirstAssignmentNotes {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println("Eleman Sayýsý: " + mesaj.length());
		System.out.println("5.Eleman: " + mesaj.charAt(4)); //4.indise sahip karakteri yazar.
		System.out.println(mesaj.concat("Yaþasýn!")); //Concatenation iþlemi.
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A")); // A ile baþlýyor mu? True veya false döndürür.
		System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu? True veya false döndürür.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // srcBegin - srcEnd - ilgili dizi adý - dstBegin
		System.out.println(karakterler); // 0 ile 5 arasýndaki karakterleri ekrana yazar. Bu örnekte "Bugün" çýktýsý alýnýr.
		System.out.println(mesaj.indexOf('a')); // a'nýn bulunduðu konumu verir. Bu örnek için: 7.
		
		
		String yeniMesaj = mesaj.replace(' ', '-'); // oldChar - newChar ; Burada boþluklarý - ile deðiþtirme iþlemi yapýldý.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 4)); //2-4 arasý indexe sahip karakterler yazdýrýlýr. Burada: gü
		
		for(String kelime: mesaj.split(" ")) {  //kelime kelime alt alta yazar.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //Küçük harf
		System.out.println(mesaj.toUpperCase()); //Büyük harfe çevirir
		System.out.println(mesaj.trim()); // Baþýndaki ve sonundaki boþluklar silinir.
		
		

	}

}
