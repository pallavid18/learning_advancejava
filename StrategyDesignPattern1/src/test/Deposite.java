package test;

public class Deposite implements Atm  {
	
	@Override
	public void pay(int amount) {
		System.out.println("Deposite Amount : "+amount +"  rs");
	}
	

}
