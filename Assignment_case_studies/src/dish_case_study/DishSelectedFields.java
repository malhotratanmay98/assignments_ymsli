package dish_case_study;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class DishSelectedFields {

	private String name;
	private int calories;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	public DishSelectedFields(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	public DishSelectedFields() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DishSelectedField [name=").append(name).append(", calories=").append(calories).append("]");
		return builder.toString();
	}
	
}
