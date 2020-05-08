import java.util.ArrayList;

public class Atm {
	
	public static void info(Account a) {
		System.out.println("Bank Name: " + a.getName());
		System.out.println("Account type: " + a.type);
		System.out.println("Balance: " + a.getCurrentBalance());
		System.out.println("Interest: " + a.getInterest());


	}
	
	public static void main(String[] args) {
		Account bank1;
		Account bank2;
		
		bank1 = new Regular("Bank Of America", 1732.55);
		bank2 = new Gold("Amex", 183350.0);
		ArrayList<Account> accounts = new ArrayList<Account>();
		accounts.add(bank1);
		accounts.add(bank2);
		
		for (int i=0;i<accounts.size();i++) {
			info(accounts.get(i));
			System.out.println();
		}
		
		
	}
	
	

}
