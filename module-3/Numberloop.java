public class NumberPattern {
    public static void main(String[] args) {
        int numRows = 7;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < (numRows - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print((int) Math.pow(2, j) + " ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print((int) Math.pow(2, j) + " ");
