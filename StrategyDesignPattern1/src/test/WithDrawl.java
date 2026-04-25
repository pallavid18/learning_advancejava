package test;

public class WithDrawl implements Atm{
	
	@Override
	public void pay(int amount) {
		System.out.println("Withdrawl Amount : "+amount +"  rs");
	}
	

}
