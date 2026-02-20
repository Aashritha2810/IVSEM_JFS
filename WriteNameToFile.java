import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class WriteNameToFile{
    public static void main(String[] args){
        try{
            FileWriter fw= new FileWriter("name.txt");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your name");
            String a= sc.nextLine();
            sc.close();
            fw.write("Hello! My name is "+ a);
            fw.close();
            System.out.println("Name is written successfully");
        }
        catch(IOException e){
            System.out.println("An Unknown error occurred");
            e.printStackTrace();
        }
    }
}