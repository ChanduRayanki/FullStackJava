import java.lang.*;

public class Recipe {
    private String dishName;

    public Recipe(String dishName) {
        this.dishName = dishName;
    }

    public void getReady() {
        System.out.println("Getting ingredients ready for " + dishName + ".");
    }

    public void doTheDish() {
        System.out.println("Cooking " + dishName + ".");
    }

    public void cleanup() {
        System.out.println("Cleaning up after cooking " + dishName + ".");
    }

    public String getDishName() {
        return dishName;
    }
}
