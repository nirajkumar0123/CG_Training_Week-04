package personalizedmealplangenerator;

//Vegan Meal
class VeganMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegan";
    }

    @Override
    public void displayMealDetails() {
        System.out.println("Meal Type: Vegan");
        System.out.println("Includes: Plant-based foods, No dairy, No animal products");
    }
}
