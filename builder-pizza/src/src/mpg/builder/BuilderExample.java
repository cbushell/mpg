package mpg.builder;


public class BuilderExample {
	
	public static void main(String[] args) {
		
		Cook cook = new Cook();
		
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		cook.setPizzaBuilder(hawaiianPizzaBuilder);
		cook.constructPizza();
		System.out.println(cook.getPizza());
		
		
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		cook.setPizzaBuilder(spicyPizzaBuilder);
		cook.constructPizza();
		System.out.println(cook.getPizza());
	}
	
}
