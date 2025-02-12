package personalizedmealplangenerator;

class MealPlanUtil {
    public static <T extends MealPlan> Meal<T> generateMealPlan(T mealType) {
        Meal<T> mealPlan = new Meal<>();
        mealPlan.addMeal(mealType); // Add a meal to the plan
        return mealPlan;
    }
}
