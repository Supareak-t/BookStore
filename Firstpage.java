import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException; 

public class Firstpage{
        public void firstpage() throws FileNotFoundException, IOException {

                Scanner firstpage = new Scanner(System.in);
                Bookstore b1 = new Bookstore();
                Admin b2 = new Admin();
                clrscr();                

                int ch1;
                while(true){
                        System.out.println("________________________________________| Wellcome |________________________________________");
                        System.out.println("                                       [1] Main menu                                        ");
                        System.out.println("                                       [2] Admin                                            ");
                        System.out.println("                                       [0] Exit                                             ");
                        System.out.println("--------------------------------------------------------------------------------------------");
                        System.out.print("Enter your choice:");

                        ch1 = firstpage.nextInt();
                        clrscr();

                        if(ch1 == 1){
                                b1.bookstore();
                        }
                        else if(ch1 == 2){
                                b2.admin();  
                        }
                        else if(ch1 == 0){
                                break;
                        }
                        else{
                                System.out.println("Your choice is wrong!");
                        }
                        break;
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
