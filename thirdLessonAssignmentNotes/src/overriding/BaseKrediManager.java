package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {  //Override edilmesini �nlemek i�in "final" keywordunu kullanabiliriz.. public final double hesapla(double tutar) ... .. �eklinde
		return tutar * 1.18;
	}
	
}
