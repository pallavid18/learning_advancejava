package test;

public class AppTest {

	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart(new PayPalPayment());
		
/*		//Pay using CreditCard
		cart.setPaymentStrategy(new CreditCardPayment());
		cart.checkOut(100);
		//Pay using PayPalPayment
	    cart.setPaymentStrategy(new PayPalPayment()); 
	    cart.checkOut(200);
	    //Pay using CryptoPayment
		cart.setPaymentStrategy(new CryptoPayment());
		
		*/
		cart.checkOut(300);
		 
		

	}

}
