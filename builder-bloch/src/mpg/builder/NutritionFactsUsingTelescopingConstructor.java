package mpg.builder;


public class NutritionFactsUsingTelescopingConstructor {

	// Required attributes
	private final int servings;

	private final int servingSize;
	
	// Optional attributes
	private final int fat;
	
	private final int sodium;

	private final int calories;
	
	private final int carbohydrate;
	
	
	public NutritionFactsUsingTelescopingConstructor(int servingSize,
			int servings) {
		this(servingSize, servings, 0);
	}
	
	
	public NutritionFactsUsingTelescopingConstructor(int servingSize,
			int servings, int calories) {
		this(servingSize, servings, calories, 0);
	}
	
	
	public NutritionFactsUsingTelescopingConstructor(int servingSize,
			int servings, int calories, int fat) {
		this(servingSize, servings, calories, fat, 0);
	}
	
	
	public NutritionFactsUsingTelescopingConstructor(int servingSize,
			int servings, int calories, int fat, int sodium) {
		this(servingSize, servings, calories, fat, sodium, 0);
	}

	
	public NutritionFactsUsingTelescopingConstructor(int servingSize,
			int servings, int calories, int fat, int sodium, int carbohydrate) {
		this.fat = fat;
		this.sodium = sodium;
		this.servings = servings;
		this.calories = calories;
		this.servingSize = servingSize;
		this.carbohydrate = carbohydrate;
	}
	
}
