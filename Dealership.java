package car_dealership;

public class Dealership {

	public static void main(String[] args) {
		
		Customer cust1 = new Customer();
		
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St. ");
		cust1.setCashOnHand(25000);
		
		
		Vehicle vehicle = new Vehicle("Honda","Accord",10000);
		
		
		
		Employee emp = new Employee();
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("BMW","M3",20000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
		
		
	
		
		/**
		 * 
		 * handelCustomer(Customer cust, boolean finance, Vehicle vehicle)
		 * if(finance == true)
		 * 		runCreditHistory(Customer cust, double doubleAmount)
		 * else if(vehicle.getPrice() <= cust.getCashOnHand()):
		 * 		processTransaction(Customer cust, Vehicle vehicle)
		 * else:
		 * 		tell customer to bring more money
		
		**/
	}

}
