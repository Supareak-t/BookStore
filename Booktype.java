import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException; 


public class Booktype{ 
    public void booktype() throws FileNotFoundException{

        Scanner booktype = new Scanner(System.in);
        Action b1 = new Action();
        Romantic b2 = new Romantic();
        Sports b3 = new Sports();
        Drama b4 = new Drama();
        Booktype b5 = new Booktype();
        Scanner sc = new Scanner(System.in);
        clrscr(); 

        int ch2;

        while(true){
            System.out.println("**                                     ||       Book type      ||                               **");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println("                                         [1] Action / Adventure                                   ");
            System.out.println("                                         [2] Romantic                                             ");
            System.out.println("                                         [3] Sports                                               ");
            System.out.println("                                         [4] Drama / Horror                                       ");
            System.out.println("                                         [0] Return to Menu Bookstore                             ");
            System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");

            
            ch2 = booktype.nextInt();
            clrscr(); 

            if(ch2 == 1){
                b1.action2();
                continue;
            }
            
            else if(ch2 == 2){
                b2.romantic();
                continue;
            }
            
            else if(ch2 == 3){
                b3.sports();
                continue;
            }
            
            else if(ch2 == 4){
                b4.drama();
                continue;
            }
            
            else if(ch2 == 0){
                break;
            }
            
            else{
                System.out.println("Your choice is wrong!");
            }
            break;
        }
    }
    public void Exit(){
        System.out.println("See you again");
        System.exit(1);
        
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
