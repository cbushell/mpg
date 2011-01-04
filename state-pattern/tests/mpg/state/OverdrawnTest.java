package mpg.state;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;


public class OverdrawnTest {

	@Test
	public void shouldDepositAmountIntoAcount(){
		BankAccount account = new BankAccount(new Money(BigDecimal.valueOf(-1)));
		account.deposit(new Money(BigDecimal.TEN));
		
		assertEquals(BigDecimal.valueOf(9), account.getBalance().getAmount());
	}

	@Test
	public void shouldChangeStateToInCreditWhenBalanceIsZeroAfterDeposit(){
		BankAccount account = new BankAccount(new Money(BigDecimal.valueOf(-1)));
		account.deposit(new Money(BigDecimal.ONE));
		
		assertTrue(account.getState() instanceof InCredit);
	}

	@Test
	public void shouldChangeStateToInCreditWhenBalanceIsPositiveAfterDeposit(){
		BankAccount account = new BankAccount(new Money(BigDecimal.valueOf(-1)));
		account.deposit(new Money(BigDecimal.TEN));
		
		assertTrue(account.getState() instanceof InCredit);
	}
	
	@Test
	public void shouldChangeStateToOverdrawnWhenBalanceIsNegativeAfterDeposit(){
		BankAccount account = new BankAccount(new Money(BigDecimal.valueOf(-1)));
		account.deposit(new Money(BigDecimal.ZERO));
		
		assertTrue(account.getState() instanceof Overdrawn);
	}
	
	@Test
	public void shouldWithdrawAmountFromAcount(){
		BankAccount account = new BankAccount(new Money(BigDecimal.valueOf(-1)));
		account.withdraw(new Money(BigDecimal.TEN));
		
		assertEquals(BigDecimal.valueOf(-11), account.getBalance().getAmount());
	}

	@Test
	public void shouldChangeStateToOverdrawnWhenBalanceIsNegativeAfterWithdrawl(){
		BankAccount account = new BankAccount(new Money(BigDecimal.valueOf(-1)));
		account.withdraw(new Money(BigDecimal.TEN));
		
		assertTrue(account.getState() instanceof Overdrawn);
	}

}
