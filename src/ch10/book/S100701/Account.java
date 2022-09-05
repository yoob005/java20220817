package ch10.book.S100701;

public class Account {
	public long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficientExeption{
		if(balance < money) {
			throw new BalanceInsufficientExeption("잔고부족:" + (money-balance)+"모자람");
		}
		balance -= money;
	}
}
