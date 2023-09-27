import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;


public class Receipt{
    public void receipt() throws FileNotFoundException {

        File file = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/receipt/file_name.txt"); //อ่านไฟล์ใน .txt
        Scanner scan = new Scanner(file);

        String fileContent ="";
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
    }
    public static void clrscr(){
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } 
        catch (IOException | InterruptedException ex) {}
    }
}
