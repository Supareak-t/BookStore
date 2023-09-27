import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class CreateFile
{
    public static void main(String[] args) throws IOException
    {
        // Accept a string 
        int ch;
        Scanner a1 = new Scanner(System.in);
        Scanner a2 = new Scanner(System.in);
        Scanner a3 = new Scanner(System.in);
        String str = "File Handling in Java using "+
                " FileWriter and FileReader";
        
  
        // attach a file to FileWriter 

        FileWriter fw=new FileWriter("output.txt" , true);
  
        // read character wise from string and write 
        // into FileWriter 
        System.out.print("Enter your accessibility:");    
        String accessType = a1.nextLine(); 
        System.out.print("Enter your sense:");    
        String sense = a2.nextLine(); 
        System.out.print("Enter your size:");    
        String size = a3.nextLine();      

            fw.write("Name:" +accessType "style:" +sense  "Size:"  +size);
            fw.append("\n");

  
        System.out.println("Writing successful");
        //close the file 
        fw.close();

        FileReader fr=null;
        try
        {
            fr = new FileReader("output.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
  
        // read from FileReader till the end of file
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);
  
        // close the file
        fr.close();
    }
}