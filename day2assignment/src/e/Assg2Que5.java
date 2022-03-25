package e;


public class Assg2Que5 {

	public static void main(String[] args) {
		Employee employee=new
				CommissionEmployee(121, "amit", 2.1, 2000000);
		@SuppressWarnings("unused")
		Invoice invoice=new Invoice("A123", "Electronic23W", 20, 3000);
		
		PaymentProcessingSystem.processPayment(employee);
	}
}
