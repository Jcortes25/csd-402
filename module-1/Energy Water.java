import java.util.Scanner;

public class WaterHeatingEnergy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the mass of the water in kilograms: ");
        double waterMass = scanner.nextDouble();

        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = scanner.nextDouble();
s
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = scanner.nextDouble();

        double Q = waterMass * (finalTemperature - initialTemperature) * 4184;

        System.out.println("The energy required to heat the water is: " + Q + " joules.");

        scanner.close();
    }
}
