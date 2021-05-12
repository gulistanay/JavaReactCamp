package fourthLessonAssignment;

import java.time.LocalDate;
import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Gülistan", "Ay", LocalDate.of(2000, 9, 14), "32678126386"));
		//System.out.println();
		
	}

}
