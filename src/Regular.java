
public class Regular extends Account{
	
	private String type = "Regular";
	
	public Regular(String name, double money) {
		super(name, money);
		super.type = this.type;
		accruedInterest();
	}
	
	public void makeWithdraw(double amount) {
		
		if (!isOverDrawn(amount)) {
			setBalance(getCurrentBalance() - amount);
			System.out.println("You have withdrawn $ " + amount);
			viewCurrentBalance();
		}
		else {
			System.out.println("Cannot process transaction. Balance overdrawn.");
			viewCurrentBalance();
		}

	}
	
	public boolean isOverDrawn(double amount) {
		if ( (getCurrentBalance() - amount) < 0)
			return true;
		else
			return false;
	}
	
	public void accruedInterest() {
		setInterest(0.005 * getCurrentBalance());
		double interest = getInterest();
	}
	
	
}
