package personalizedmealplangenerator;

//HighProtein Meal
class HighProtein implements MealPlan {
    @Override
    public String getMealType() {
        return "High-Protein";
    }

    @Override
    public void displayMealDetails() {
        System.out.println("Meal Type: High-Protein");
        System.out.println("Includes: Lean meats, Eggs, Legumes, Dairy");
        System.out.println("-------------------------------------------");
    }
}

