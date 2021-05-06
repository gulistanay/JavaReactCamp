package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) { //Burada base'in hesaplasını öğrenci için ezdik -  override ettik
		return tutar * 1.10;
	}
}
