package test;

public class PayPalPayment implements PaymentStrategy {
	
	@Override
	public void pay(int amount) {
		System.out.println("PayPalPayment Paid : "+amount +"  rs");
	}

}
