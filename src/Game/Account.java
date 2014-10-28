package Game;

public class Account {
		
	private int balance;
	
	public int getBalance() {
		if (balance < 0)
			balance = 0;
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void addBalance(int add) {
		this.balance = this.balance + add;
	}
	
	public String toString() {
		return ("Current balance: " + getBalance());
	}

}
