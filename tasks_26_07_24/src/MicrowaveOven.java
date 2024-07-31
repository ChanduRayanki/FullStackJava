import java.lang.*;
public class MicrowaveOven {

    public void cook(Recipe recipe) {
        System.out.println("Starting the cooking process for " + recipe.getDishName() + " in the microwave oven.");
        recipe.getReady();
        recipe.doTheDish();
        recipe.cleanup();
        System.out.println("Cooking process for " + recipe.getDishName() + " completed.");
    }

    public static void main(String[] args) {
        Recipe myRecipe = new Recipe("Pasta");
        MicrowaveOven myOven = new MicrowaveOven();
        myOven.cook(myRecipe);
    }
}
