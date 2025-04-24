import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileIOExample {
    public static void main(String[] args) {
        File file = new File("data.file");

        try {
            // Create file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("Appending to existing file: " + file.getName());
            }

            // Append mode
            FileWriter writer = new FileWriter(file, true);
            Random random = new Random();

            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(100); // Random numbers from 0-99
                writer.write(num + " ");
            }
            writer.close();
            System.out.println("10 random numbers written/appended to the file.");

            // Read and display file content
            Scanner reader = new Scanner(file);
            System.out.println("\nContents of the file:");
            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
