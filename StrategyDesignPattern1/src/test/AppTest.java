package test;

public class AppTest {

	public static void main(String[] args) {
		
		TotalAmount total = new TotalAmount(new Deposite());
		/* total.setAtm(new WithDrawl()); */
		total.checkAmount(5000);

	}

}
