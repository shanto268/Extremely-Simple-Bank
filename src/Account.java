
public class Account {

	private String name;
	private double currentBalance;
	private double withdrawnAmount;
	private double depositAmount;
	private double interest;
	public String type;
	
	public String getName() {
		return this.name;
	}
	
	public Account(String name, double money) {
		this.name = name;
		this.depositAmount = money;
		this.currentBalance = this.depositAmount;
	}

	public void makeWithdraw(double amount) {
		setBalance(getCurrentBalance() - amount);
		System.out.println("You have withdrawn $ " + amount);
		viewCurrentBalance();
	}
	
	public void makeDeposit(double amount) {
		setBalance(getCurrentBalance() + amount);
		System.out.println("You have deposited $ " + amount);
		viewCurrentBalance();
	}
	
	public void viewCurrentBalance() {
		System.out.println("Your current balance is $ " + this.currentBalance);
	}
	
	public double getCurrentBalance() {
		return this.currentBalance;
	}
	
	public void setBalance(double money) {
		this.currentBalance = money;
	}
	
	public double getInterest() {
		return this.interest;
	}
	
	public void setInterest(double money) {
		this.interest = money;
	}
}
