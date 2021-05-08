package interfaces;

public class CustomerManager {
	
	private Logger[] loggers;   		//Dependecy Injection Tasar�m Deseni
	 									//B�ylelikle sadece interface e ba�l�y�z, loglamaya ise gev�ek ba�l�l�k s�z konusu
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	//loosly - tightly coupled
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		
		Utils.runLoggers(loggers, customer.getFirstName());
		
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
		Utils.runLoggers(loggers, customer.getLastName());
		
	}
}
