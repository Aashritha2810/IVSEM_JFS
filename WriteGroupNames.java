import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteGroupNames{
    public static void main(String[] args){
        try{
            
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the number of names you want to add:");
            int n= sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()
            for(int i=0; i<n; i++){
                 System.out.println("Enter name: " + (i+1));
                 String name = sc.nextLine();
                 FileWriter fw= new FileWriter("name.txt", true);
                 fw.write(name + "\n");
                 fw.close();
            }
            sc.close();
            System.out.println("Added names to the file successfully.");
        }
        catch(IOException e){
            System.out.println("An Unknown error occurred");
            e.printStackTrace();
        }
    }
}