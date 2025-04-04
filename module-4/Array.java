public class ArrayAverage {

    public static short average(short[] array) {
        if (array == null || array.length == 0) {
            return 0; // 
        }
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        if (array == null || array.length == 0) {
            return 0; // 
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static long average(long[] array) {
        if (array == null || array.length == 0) {
            return 0; // 
        }
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }


    public static double average(double[] array) {
        if (array == null || array.length == 0) {
            return 0.0; // 
        }
        double sum = 0.0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30, 40};
        int[] intArray = {5, 10, 15, 20, 25};
        long[] longArray = {100L, 200L, 300L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        System.out.println("Short Array: ");
        printArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array: ");
        printArray(intArray);
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array: ");
        printArray(longArray);
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array: ");
        printArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    public static void printArray(short[] array) {
        for (short num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(long[] array) {
        for (long num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
