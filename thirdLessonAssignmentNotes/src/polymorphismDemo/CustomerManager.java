package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger; //Field-attribute
	
	public CustomerManager(BaseLogger logger) {  
		this.logger = logger;
	}
	public void add() {
		System.out.println("Müþteri eklendi.");
		this.logger.log("log mesajý");
	}
}
