import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadFromFile{
    public static void main(String[] args){
        try{
            File file= new File("name.txt");
            Scanner sc= new Scanner(file);
            while(sc.hasNextLine()){
                String name= sc.nextLine();
                System.out.println(name);
            }
             sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File is not found");
        }
    }
}