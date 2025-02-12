package personalizedmealplangenerator;

public class MealPlanGenerator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianPlan = MealPlanUtil.generateMealPlan(new VegetarianMeal());
        Meal<VeganMeal> veganPlan = MealPlanUtil.generateMealPlan(new VeganMeal());
        Meal<KetoMeal> ketoPlan = MealPlanUtil.generateMealPlan(new KetoMeal());
        Meal<HighProtein> highProteinPlan = MealPlanUtil.generateMealPlan(new HighProtein());

        // Display meal plans
        System.out.println("Vegetarian Meal Plan: ");
        vegetarianPlan.displayMeals();

        System.out.println("Vegan Meal Plan: ");
        veganPlan.displayMeals();

        System.out.println("Keto Meal Plan: ");
        ketoPlan.displayMeals();

        System.out.println("High-Protein Meal Plan: ");
        highProteinPlan.displayMeals();
    }
}
