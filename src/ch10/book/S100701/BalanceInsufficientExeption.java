package ch10.book.S100701;

public class BalanceInsufficientExeption extends Exception {
	public BalanceInsufficientExeption() {}
	public BalanceInsufficientExeption(String message) {
		super(message);
	}
}
