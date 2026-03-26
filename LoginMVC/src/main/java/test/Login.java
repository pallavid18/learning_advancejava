package test;

public class Login {
	public boolean check(String username , String password) {
		if(username.equals("admin") && password.equals("admin@123")) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
