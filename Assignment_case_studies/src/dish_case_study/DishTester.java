package dish_case_study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DishTester {

	public static void main(String[] args) {
		List<Dish> allDishes=getAllDishes();
		
		//1. Getting all veg dishes
		
		List<Dish> allveg=allDishes.stream().filter(d->d.isVegetarian()).collect(Collectors.toList());
		System.out.println(allveg);
		
		//2. Get list of All Dishes only containing name and calValue
		
		Predicate<Dish> name = d->d.getName()!=null;
		Predicate<Dish> calory = d->d.getCalories()>0;
		
		List<Dish> onlyNameAndValue=allDishes.stream().filter(name.and(calory)).collect(Collectors.toList());
		System.out.println(onlyNameAndValue);
		
		//3. create a List by selecting the first three dishes that have more than 300 calories
		
		//List<Dish> greaterThan300 = allDishes.stream().
		
		//4. find out whether the menu has a vegetarian option: anyMatch
		
		boolean anyMatch
		 = allDishes.stream().anyMatch(d->d.isVegetarian());
		
		System.out.println("Vegetarian dish present? :"+ anyMatch);
		
		//5. find out whether the menu ishealthy :allMatch
		//(ie. all dishes are below 1000 calories)
		
		boolean allMatch = allDishes.stream().allMatch(d->d.getCalories()<100);
		System.out.println("Any Healthy Dish Present? : "+ allMatch);
		
	 
		
	}
	
	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(new Dish("pork", false, 800,
				Dish.Type.MEAT), new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT), new Dish(
						"french fries", true, 530, Dish.Type.OTHER), new Dish(
						"rice", true, 350, Dish.Type.OTHER), new Dish(
						"season fruit", true, 120, Dish.Type.OTHER), new Dish(
						"pizza", true, 550, Dish.Type.OTHER), new Dish(
						"prawns", false, 300, Dish.Type.FISH), new Dish(
						"salmon", false, 450, Dish.Type.FISH));
		return disheds;
	}
}
