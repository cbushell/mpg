package mpg.builder;


public class NutritionFactsUsingBuilder {

	private final int fat;
	
	private final int sodium;
	
	private final int servings;
	
	private final int calories;
	
	private final int servingSize;
	
	private final int carbohydrate;
	
	
	
	public NutritionFactsUsingBuilder(Builder builder){
		fat = builder.fat;
		sodium = builder.sodium;
		servings = builder.servings;
		calories = builder.calories;
		servingSize = builder.servingSize;
		carbohydrate = builder.carbohydrate;
	}
	
	
	public static class Builder{
		
		// Required attributes
		private final int servings;

		private final int servingSize;
		
		
		// Optional attributes
		private int fat = 0;
		
		private int sodium = 0;

		private int calories = 0;
		
		private int carbohydrate = 0;
		
		
		public Builder(int servingSize, int servings){
			this.servings = servings;
			this.servingSize = servingSize;
		}
		
		
		public Builder calories(int calories){
			this.calories = calories;
			return this;
		}
		
		
		public Builder fat(int fat){
			this.fat = fat;
			return this;
		}
		
		
		public Builder carbohydrate(int carbohydrate){
			this.carbohydrate = carbohydrate;
			return this;
		}
		
		
		public Builder sodium(int sodium){
			this.sodium = sodium;
			return this;
		}
		
		
		public NutritionFactsUsingBuilder build(){
			return new NutritionFactsUsingBuilder(this);
		}
	}

}
