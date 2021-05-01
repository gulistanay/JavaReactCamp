package FirstLessonAssignmentNotes;

import java.util.Iterator;

public class FirstAssignmentNotes {

	public static void main(String[] args) {
		
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println("Eleman Say�s�: " + mesaj.length());
		System.out.println("5.Eleman: " + mesaj.charAt(4)); //4.indise sahip karakteri yazar.
		System.out.println(mesaj.concat("Ya�as�n!")); //Concatenation i�lemi.
		System.out.println(mesaj);
		System.out.println(mesaj.startsWith("A")); // A ile ba�l�yor mu? True veya false d�nd�r�r.
		System.out.println(mesaj.endsWith(".")); // . ile bitiyor mu? True veya false d�nd�r�r.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // srcBegin - srcEnd - ilgili dizi ad� - dstBegin
		System.out.println(karakterler); // 0 ile 5 aras�ndaki karakterleri ekrana yazar. Bu �rnekte "Bug�n" ��kt�s� al�n�r.
		System.out.println(mesaj.indexOf('a')); // a'n�n bulundu�u konumu verir. Bu �rnek i�in: 7.
		
		
		String yeniMesaj = mesaj.replace(' ', '-'); // oldChar - newChar ; Burada bo�luklar� - ile de�i�tirme i�lemi yap�ld�.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 4)); //2-4 aras� indexe sahip karakterler yazd�r�l�r. Burada: g�
		
		for(String kelime: mesaj.split(" ")) {  //kelime kelime alt alta yazar.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //K���k harf
		System.out.println(mesaj.toUpperCase()); //B�y�k harfe �evirir
		System.out.println(mesaj.trim()); // Ba��ndaki ve sonundaki bo�luklar silinir.
		
		

	}

}
