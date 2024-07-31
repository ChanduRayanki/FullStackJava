import java.lang.*;
public class RunnerRect {
    public static void main(String[] args) {
        // Create a Rectangle object with specified length and width
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Get the area of the rectangle
        double area = rectangle.calculateArea();

        // Print the area
        System.out.println("The area of the rectangle is: " + area);
    }
}
