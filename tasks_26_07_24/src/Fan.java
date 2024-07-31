import java.lang.*;
public class Fan {
    private String color;
    private String dimension;
    private boolean isOn;

    public Fan(String color, String dimension) {
        this.color = color;
        this.dimension = dimension;
        this.isOn = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public void printSpecifications() {
        System.out.println("Fan Specifications:");
        System.out.println("Color: " + color);
        System.out.println("Dimension: " + dimension);
        System.out.println("Power State: " + (isOn ? "On" : "Off"));
    }

    public static void main(String[] args) {
        Fan myFan = new Fan("White", "48 inches");
        myFan.printSpecifications();
        myFan.switchOn();
        System.out.println("Fan is on: " + myFan.isOn());
        myFan.printSpecifications();
    }
}
