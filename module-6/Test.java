public class Main {
    public static void main(String[] args) {
        // Fan using default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan:");
        System.out.println(defaultFan);

        // Fan using parameterized constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.5, "blue");
        System.out.println("\nCustom Fan:");
        System.out.println(customFan);

        // Using setters to change default fan
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("green");

        System.out.println("\nUpdated Default Fan:");
        System.out.println(defaultFan);
    }
}