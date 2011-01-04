package mpg.state;


// Concrete state
public class InCredit extends AccountState {
	
	public static final AccountState INSTANCE = new InCredit();
	
	
	@Override
	public void withdraw(BankAccount account, Money money) {
		Money newBalance = account.getBalance().subtract(money);
		account.setBalance(newBalance);
		
		if(account.getBalance().isLessThan(Money.ZERO)){
			changeState(account, Overdrawn.INSTANCE);
		}
	}

	@Override
	public void deposit(BankAccount account, Money money) {
		Money newBalance = account.getBalance().add(money);
		account.setBalance(newBalance);
		
		// No state change needed here
	}
	
}