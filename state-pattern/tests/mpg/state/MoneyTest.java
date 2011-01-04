package mpg.state;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import mpg.state.Money;

import org.junit.Test;


public class MoneyTest {

	@Test
	public void shouldIndicateValueIsLessThanTarget(){
		Money money1 = new Money(BigDecimal.ZERO);
		Money money2 = new Money(BigDecimal.ONE);
		
		assertTrue(money1.isLessThan(money2));
	}
	
	@Test
	public void shouldIndicateAmountIsGreaterThanTarget(){
		Money money1 = new Money(BigDecimal.ONE);
		Money money2 = new Money(BigDecimal.ZERO);
		
		assertTrue(money1.isGreaterThan(money2));
	}

	@Test
	public void shouldIndicateAmountIsEqualToTarget(){
		Money money1 = new Money(BigDecimal.ZERO);
		Money money2 = new Money(BigDecimal.ZERO);
		
		assertTrue(money1.equals(money2));
	}
	
	@Test
	public void shouldSubtractOneAmountFromTheOther(){
		Money money1 = new Money(new BigDecimal("9.89"));
		Money money2 = new Money(new BigDecimal("1.89"));
		
		Money result = money1.subtract(money2);
		assertTrue(new BigDecimal("8.00").equals(result.getAmount()));
	}

	@Test
	public void shouldAddOneAmountFromTheOther(){
		Money money1 = new Money(new BigDecimal("9.89"));
		Money money2 = new Money(new BigDecimal("2.11"));
		
		Money result = money1.add(money2);
		assertTrue(new BigDecimal("12.00").equals(result.getAmount()));
	}
	
}
