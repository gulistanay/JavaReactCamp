package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {  //Override edilmesini önlemek için "final" keywordunu kullanabiliriz.. public final double hesapla(double tutar) ... .. şeklinde
		return tutar * 1.18;
	}
	
}
