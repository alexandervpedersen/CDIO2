package Game;

public class Account {
		
	private int balance;
	
	public int getBalance() {
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
		lolhe
	}

}
