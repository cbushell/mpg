package mpg.state;


//Concrete state
public class Overdrawn extends AccountState {

	public static final AccountState INSTANCE = new Overdrawn();
	
	
	@Override
	public void withdraw(BankAccount account, Money money) {
		Money newBalance = account.getBalance().subtract(money);
		account.setBalance(newBalance);
		
		// No state change needed here. Assumes endless overdraft...
	}

	@Override
	public void deposit(BankAccount account, Money money) {
		Money newBalance = account.getBalance().add(money);
		account.setBalance(newBalance);
		
		if(account.getBalance().isLessThan(Money.ZERO)){
			account.changeState(Overdrawn.INSTANCE);
		}
		else{
			account.changeState(InCredit.INSTANCE);
		}
	}

}