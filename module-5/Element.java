public class ArrayLocator {

    // Locate largest in 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2]; // [row, col]
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate largest in 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2]; // [row, col]
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest in 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2]; // [row, col]
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest in 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2]; // [row, col]
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Optional: test it
    public static void main(String[] args) {
        int[][] intArray = {
            {3, 5, 9},
            {1, 4, 7},
            {2, 8, 6}
        };

        double[][] doubleArray = {
            {2.3, 9.5, 7.1},
            {3.4, 1.1, 5.8}
        };

        int[] largestIntLoc = locateLargest(intArray);
        int[] smallestIntLoc = locateSmallest(intArray);
        int[] largestDoubleLoc = locateLargest(doubleArray);
        int[] smallestDoubleLoc = locateSmallest(doubleArray);

        System.out.println("Largest int location: [" + largestIntLoc[0] + ", " + largestIntLoc[1] + "]");
        System.out.println("Smallest int location: [" + smallestIntLoc[0] + ", " + smallestIntLoc[1] + "]");
        System.out.println("Largest double location: [" + largestDoubleLoc[0] + ", " + largestDoubleLoc[1] + "]");
        System.out.println("Smallest double location: [" + smallestDoubleLoc[0] + ", " + smallestDoubleLoc[1] + "]");
    }
}
