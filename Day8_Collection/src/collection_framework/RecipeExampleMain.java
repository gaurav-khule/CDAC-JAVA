package collection_framework;

import java.util.List;

public class RecipeExampleMain {
	public static void main(String[] args) {
		Recipe r1 = new Recipe();
		r1.setName("Pineapple Raita");
		r1.setPreparationTime(30);
		List<String> raitaIngredients = List.of("Curd", "Sugar", "Pineapple");
		r1.setIngredients(raitaIngredients);
		
		Recipe r2 = new Recipe();
		r2.setName("Veg Burger");
		r2.setPreparationTime(40);
		r2.addIngredient("Bun Bread");
		r2.addIngredient("Mayo");
		r2.addIngredient("Cheese");
		r2.addIngredient("Cucumber");
		r2.addIngredient("Tomato");
		r2.addIngredient("Lettuce");
		
		System.out.println("Recipe Name: " + r1.getName());
		System.out.println("Ingredient:-- ");
		List<String> firstList = r1.getIngredients();
		for(String ing : firstList)
			System.out.println(ing);
		
		System.out.println("--------------------------------------------");
		
		System.out.println("Recipe Name: " + r2.getName());
		System.out.println("Ingredient:-- ");
		List<String> SecondList = r2.getIngredients();
		for(String ing : SecondList)
			System.out.println(ing);
		
				
	}
}
