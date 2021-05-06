package overriding;

public class Main {

	public static void main(String[] args) {
		BaseKrediManager[] krediManagers = new BaseKrediManager[] {new OgretmenKrediManager(), new TarimKrediManager(), new OgrenciKrediManager()}; //SAdece biriyle de �al��mak m�mk�n
		
		for(BaseKrediManager krediManager: krediManagers) {
			System.out.println(krediManager.hesapla(1000));
		}
	}

}
