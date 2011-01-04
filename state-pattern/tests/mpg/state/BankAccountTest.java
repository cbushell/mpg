package mpg.state;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;


public class BankAccountTest {
	
	@Test
	public void shouldInitializeStateToInCreditWhenOpeningBalanceIsZero(){
		BankAccount account = new BankAccount(new Money(BigDecimal.ZERO));
		assertTrue(account.getState() instanceof InCredit);
	}

	@Test
	public void shouldInitializeStateToInCreditWhenOpeningBalanceIsGreaterThanZero(){
		BankAccount account = new BankAccount(new Money(BigDecimal.TEN));
		assertTrue(account.getState() instanceof InCredit);
	}

	@Test
	public void shouldInitializeStateToOverdrawnWhenOpeningBalanceIsLessThanZero(){
		BankAccount account = new BankAccount(new Money(BigDecimal.valueOf(-1)));
		assertTrue(account.getState() instanceof Overdrawn);
	}

}
