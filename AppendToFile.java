import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String[] args) {
        try (FileWriter fa = new FileWriter("name.txt", true);
             Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter text to append to the file(type 'exit' to stop):");
            String line = sc.nextLine();
            while (!line.equals("exit")) {
                fa.write(line + "\n");
                line = sc.nextLine(); 
            }
            System.out.println("Appended to the file");
        } catch (IOException e) {
            System.out.println("An unknown error occurred");
            e.printStackTrace();
        }
    }
}