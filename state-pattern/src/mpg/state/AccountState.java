package mpg.state;


// State
public abstract class AccountState {

	public abstract void deposit(BankAccount bankAccount, Money money);
	
	public abstract void withdraw(BankAccount bankAccount, Money money);

	public void changeState(BankAccount bankAccount, AccountState state) {
		bankAccount.changeState(state);
	}
	
}