import java.util.ArrayList;

public class UseFans {

    // Display a single fan without using toString()
    public static void displaySingleFan(Fan fan) {
        System.out.println("Displaying one fan:");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.isOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println("----------------------");
    }

    // Display all fans in a collection without using toString()
    public static void displayFanCollection(ArrayList<Fan> fans) {
        System.out.println("Displaying all fans in collection:");
        for (Fan fan : fans) {
            displaySingleFan(fan); // reuse method
        }
    }

    // Main test method
    public static void main(String[] args) {
        // Create a collection of Fan instances
        ArrayList<Fan> fanList = new ArrayList<>();

        // Create and configure fans
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Red");
        fan1.setOn(true);

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(7);
        fan2.setColor("Green");
        fan2.setOn(false);

        Fan fan3 = new Fan(); // using default values

        // Add fans to the list
        fanList.add(fan1);
        fanList.add(fan2);
        fanList.add(fan3);

        // Display all fans
        displayFanCollection(fanList);
    }
}
