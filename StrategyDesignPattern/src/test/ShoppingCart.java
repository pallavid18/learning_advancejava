package test;

public class ShoppingCart{
	
//	private PaymentStrategy  paymentStrategy;
	private PaymentStrategy  paymentStrategy = null;
	
/*	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		
		this.paymentStrategy = paymentStrategy;
		
	} */
	
	public ShoppingCart(PaymentStrategy paymentStrategy) {
		
		this.paymentStrategy = paymentStrategy;
		
	}
	
	public void checkOut(int amount) {
		paymentStrategy.pay(amount);
	}

}
