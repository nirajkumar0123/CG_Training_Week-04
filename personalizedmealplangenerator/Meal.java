package personalizedmealplangenerator;

import java.util.ArrayList;
import java.util.List;

class Meal<T extends MealPlan> {
    private final List<T> meals = new ArrayList<>();

    // Method to add a meal to the plan
    public void addMeal(T meal) {
        meals.add(meal);
    }

    // Method to get all meals
    public List<T> getMeals() {
        return meals;
    }

    // Display all meals
    public void displayMeals() {
        for (T meal : meals) {
            meal.displayMealDetails();
        }
    }
}
