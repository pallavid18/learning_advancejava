package test;

public class TotalAmount {
	
	private Atm atm = null;

//	public void setAtm(Atm atm) {
//		this.atm = atm;
//	}
	
	public TotalAmount(Atm atm) {
		
		this.atm=atm;
		
	}
	
	public void checkAmount(int amount) {
		atm.pay(amount);
	}

}
