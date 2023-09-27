import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class Admin{
    public  void admin ()throws FileNotFoundException, IOException{
        Scanner admin = new Scanner(System.in);
        Add a1 = new Add();
        Bookstore a2 = new Bookstore();
        Add2 a3 = new Add2();
        Firstpage a4 = new Firstpage();

        int ch; 

        String Adminname;
        String Password;
        
        Adminname = "ST";
        Password = "1542";
        clrscr();

        while(true){

            Scanner input3 = new Scanner(System.in);

            System.out.println("-----------------------------------| Login Administrator |------------------------------------");
            System.out.println("----------------------------------------------------------------------------------------------");

            Scanner input1 = new Scanner(System.in);
            System.out.print("Enter Admin name : ");
            String username = input1.next();

            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter Password : ");
            String password = input2.next();
            


            if (username.equals(Adminname) && password.equals(Password)) {
                System.out.println("\n");
                
                System.out.println("_____________________________________| Add BOOK in Store |____________________________________");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.println("                                |      [1] Add New Book       |                               ");
                System.out.println("                                |      [2] Add New Promotion  |                               ");
                System.out.println("                                |      [0] Back to Firstpage  |                               ");
                System.out.println("----------------------------------------------------------------------------------------------");
                System.out.print("Enter your choice:");

                ch = admin.nextInt();
                clrscr();

                if(ch==1){
                    a1.add();
                    a2.bookstore();
                }
                else if(ch==2){
                    a3.add2();
                    a2.bookstore();
                }
                else if(ch==0){
                    a4.firstpage();
                }
                else{
                    System.out.println("Your choice is wrong!");
                }

                
            }
            else if (username.equals(Adminname)) {
                System.out.println("--------------------------------------------- ");
                System.out.println("Wrong password!!!");  
                System.out.print("You want to try again?[Y/N] :");  
                String aws = input3.next();
                clrscr();

                if(aws.equals("Y")){
                    continue;
                }
                else if(aws.equals("N")){
                    a4.firstpage();
                }

            }
            else if (password.equals(Password)) {
                System.out.println("--------------------------------------------- ");
                System.out.println("Wrong admin name!!");
                System.out.print("You want to try again?[Y/N] :");  
                String aws = input3.next();
                clrscr();

                if(aws.equals("Y")){
                    continue;
                }
                else if(aws.equals("N")){
                   a4.firstpage();
               }
               break;
           }
           else{
            System.out.println("--------------------------------------------- ");
            System.out.println("Wrong Admin name & Password!");
            System.out.print("You want to try again?[Y/N] :");  
            String aws = input3.next();
            clrscr();

            if(aws.equals("Y")){
                continue;
            }
            else if(aws.equals("N")){
                a4.firstpage();
            }
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

public class Add{
    public void add () throws FileNotFoundException, IOException {


        FileWriter writer = new FileWriter("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Newbook.txt",true);
        Scanner a1 = new Scanner(System.in);

        System.out.print("Enter New book:");    
        String addbook = a1.nextLine();

        writer.write(System.lineSeparator());
        writer.write(addbook);
        writer.close();
    }
}

public class Add2{
    public void add2 () throws FileNotFoundException, IOException {


        FileWriter writer = new FileWriter("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Promotion.txt",true);
        Scanner a1 = new Scanner(System.in);

        System.out.print("Enter Promotion book:");    
        String addbook = a1.nextLine();

        writer.write(System.lineSeparator());
        writer.write(addbook);
        writer.close();
    }
}
}

