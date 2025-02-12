package personalizedmealplangenerator;

//Keto Meal
class KetoMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Keto";
    }

    @Override
    public void displayMealDetails() {
        System.out.println("Meal Type: Keto");
        System.out.println("Includes: High-fat, Low-carb, Moderate-protein foods");
    }
}
