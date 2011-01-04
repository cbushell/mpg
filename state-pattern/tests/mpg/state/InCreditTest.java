package mpg.state;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;


public class InCreditTest {

	@Test
	public void shouldWithdrawAmountFromAcount(){
		BankAccount account = new BankAccount(new Money(BigDecimal.TEN));
		account.withdraw(new Money(BigDecimal.ONE));
		
		assertEquals(BigDecimal.valueOf(9), account.getBalance().getAmount());
	}

	@Test
	public void shouldChangeStateToInCreditWhenBalanceIsZeroAfterWithdrawl(){
		BankAccount account = new BankAccount(new Money(BigDecimal.TEN));
		account.withdraw(new Money(BigDecimal.TEN));
		
		assertTrue(account.getState() instanceof InCredit);
	}

	@Test
	public void shouldChangeStateToInCreditWhenBalanceIsPositiveAfterWithdrawl(){
		BankAccount account = new BankAccount(new Money(BigDecimal.TEN));
		account.withdraw(new Money(BigDecimal.ONE));
		
		assertTrue(account.getState() instanceof InCredit);
	}

	@Test
	public void shouldChangeStateToOverdrawnWhenBalanceIsNegativeAfterWithdrawl(){
		BankAccount account = new BankAccount(new Money(BigDecimal.ONE));
		account.withdraw(new Money(BigDecimal.TEN));
		
		assertTrue(account.getState() instanceof Overdrawn);
	}

	@Test
	public void shouldDepositAmountIntoAcount(){
		BankAccount account = new BankAccount(new Money(BigDecimal.ZERO));
		account.deposit(new Money(BigDecimal.TEN));
		
		assertEquals(BigDecimal.TEN, account.getBalance().getAmount());
	}
	
	@Test
	public void shouldChangeStateToInCreditWhenBalanceIsPositiveAfterDeposit(){
		BankAccount account = new BankAccount(Money.ZERO);
		account.deposit(new Money(BigDecimal.TEN));
		
		assertTrue(account.getState() instanceof InCredit);
	}

}
