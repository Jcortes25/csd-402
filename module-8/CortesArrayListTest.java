import java.util.ArrayList;
import java.util.Scanner;

public class AlexArrayListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input;

        System.out.println("Enter integers (enter 0 to stop):");

        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer:");
                continue;
            }

            numbers.add(input);

            if (input == 0) {
                break;
            }
        }

        Integer maxValue = max(numbers);
        System.out.println("The largest value entered is: " + maxValue);

        scanner.close();
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer max = list.get(0);
        for (Integer number : list) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
