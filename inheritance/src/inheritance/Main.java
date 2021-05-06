package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer gulistan = new IndividualCustomer();
		gulistan.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
//		customerManager.add(hepsiBurada);
//		customerManager.add(gulistan);
//		customerManager.add(abc);
				
		Customer[] customers = {gulistan, abc, hepsiBurada};
		
		customerManager.addMultiple(customers);
		
	}

}
