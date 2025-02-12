package personalizedmealplangenerator;


//Vegetarian Meal
class VegetarianMeal implements MealPlan {
    @Override
    public String getMealType() {
        return "Vegetarian";
    }

    @Override
    public void displayMealDetails() {
        System.out.println("Meal Type: Vegetarian");
        System.out.println("Includes: Fruits, Vegetables, Dairy, Grains");
    }
}
