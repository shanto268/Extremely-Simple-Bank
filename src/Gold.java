
public class Gold extends Account{
	
	private String type = "Gold";
	
	public Gold(String name, double money) {
		super(name, money);
		super.type = this.type;
		accruedInterest();
	}

	public void accruedInterest() {
		setInterest(0.006 * getCurrentBalance());
		double interest = getInterest() - 100.0;
	}
	
}
