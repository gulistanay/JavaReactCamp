package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) { //Burada base'in hesaplas�n� ��renci i�in ezdik -  override ettik
		return tutar * 1.10;
	}
}
