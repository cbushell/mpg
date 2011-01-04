package mpg.state;

import java.math.BigDecimal;

public class Money {

	public static final Money ZERO = new Money(BigDecimal.ZERO);

	private BigDecimal amount;

	public Money(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public Money subtract(Money money) {
		return new Money(this.amount.subtract(money.amount));
	}

	public Money add(Money money) {
		return new Money(this.amount.add(money.amount));
	}

	public boolean isLessThan(Money money) {
		return amount.compareTo(money.amount) == -1;
	}

	public boolean isGreaterThan(Money money) {
		return amount.compareTo(money.amount) == 1;
	}
	
	@Override
	public boolean equals(Object money){
		return amount.compareTo(((Money)money).amount) == 0;
	}

}