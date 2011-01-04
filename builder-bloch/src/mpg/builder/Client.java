package mpg.builder;

public class Client {

	public static void main(String[] args) {
		
		// Telescoping constructor
		NutritionFactsUsingTelescopingConstructor cocaCola1 = new NutritionFactsUsingTelescopingConstructor(
				240, 8, 100, 0, 35, 27);

		
		// Java beans style
		NutritionFactsUsingJavaBeansStyle cocaCola2 = new NutritionFactsUsingJavaBeansStyle();
		cocaCola2.setServingSize(240);
		cocaCola2.setServings(8);
		cocaCola2.setCalories(100);
		cocaCola2.setSodium(35);
		cocaCola2.setCarbohydrate(27);
		
		
		// Bloch builder
		NutritionFactsUsingBuilder nutritionFacts = new NutritionFactsUsingBuilder.Builder(
				240, 8).calories(100).sodium(35).carbohydrate(27).build();
	}
}
