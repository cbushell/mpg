package mpg.state;

// Context
public class BankAccount {

	private Money balance;

	private AccountState state;

	public BankAccount(Money balance) {
		this.balance = balance;
		this.state = balance.isLessThan(Money.ZERO) ? Overdrawn.INSTANCE : InCredit.INSTANCE;
	}

	public void deposit(Money money) {
		state.deposit(this, money);
	}

	public void withdraw(Money money) {
		state.withdraw(this, money);
	}

	// Package scope so available to Concrete state
	void changeState(AccountState state) {
		this.state = state;
	}

	// Package scope so available to Concrete state
	void setBalance(Money balance) {
		this.balance = balance;
	}

	// Package scope so available to Concrete state
	Money getBalance() {
		return balance;
	}

	// Package scope so available to Concrete state
	AccountState getState() {
		return state;
	}

}