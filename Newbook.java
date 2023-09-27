import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class Newbook{
    public void newbook() throws FileNotFoundException{

        clrscr();
        System.out.println("----------!!NEW Arrival Book!!----------");
        File file = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Newbook.txt"); //อ่านไฟล์ใน .txt
        Scanner scan = new Scanner(file);

        String fileContent ="";
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

        System.out.println("---------------------------------------------------");
        try{
            float buy1 = 0.0f;
            float buy2 = 0.0f;
            float buy3 = 0.0f;
            float buy4 = 0.0f;
            float buy5 = 0.0f;
            
            
            BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/Newbook.txt"));
            String s = "";
            
            while ((s = r.readLine()) != null) {
                String[] data = s.split(",");
                buy1 = Float.parseFloat(data[0]);
                buy2 = Float.parseFloat(data[1]);
                buy3 = Float.parseFloat(data[2]);
                buy4 = Float.parseFloat(data[3]);
                buy5 = Float.parseFloat(data[4]);

            }
            r.close();
            
            System.out.printf("[1] Demon Slayer volume 11            Price : %.2f\n",buy1);
            System.out.printf("[2] Boruto Next Generation volume 1   Price : %.2f\n",buy2);
            System.out.printf("[3] Detective Conan volume 11         Price : %.2f\n",buy3);
            System.out.printf("[4] Detective Conan volume 12         Price : %.2f\n",buy4);
            System.out.printf("[5] Doraemon volume 11                Price : %.2f\n",buy5);
            System.out.printf("[0] Return to Menu Bookstore ");

            int ba1 = 0;

            
            System.out.println("\n-------------------------------------------------");
            System.out.println("\nYou can select one books.");
            System.out.print("Volume :");
            Scanner newbook = new Scanner(System.in);
            
            ba1 = newbook.nextInt();

            float price = 0;
            
            if (ba1 == 1){
                price = buy1;
                System.out.println("price : "+buy1);
            }
            else if (ba1 == 2){
                price = buy2;
                System.out.println("price : "+buy2);
            }
            else if (ba1 == 3){
                price = buy3;
                System.out.println("price : "+buy3);
                
            }
            else if (ba1 == 4){
                price = buy4;
                System.out.println("price : "+buy4);
                
            }
            else if (ba1 == 5){
                price = buy5;
                System.out.println("price : "+buy5);
                
            }
            else if (ba1 == 0){
                clrscr();
                
            }
            else if(ba1>5){
                System.out.println("There are currently no new books released.");
            }
            else{
                clrscr();
                System.out.println("Error, wrong choice!!");
            }
            System.out.println("\nCustomer Cash  ");
            System.out.print("amount :");


            float cash = 0.00f;
            float cal = 0.00f;
            cash = newbook.nextInt();

            if(cash > 0){
                cal=cash-price;
            }
            else if(cash <= 0){
                System.out.println("!!!! Enter the cash amount greater than 0 !!!!");
            }


            //cal=cash-price;
            System.out.printf("Cal  %.2f\n",cal);
            try{
                FileWriter fw = new FileWriter("receipt/file_name.txt",true);
                BufferedWriter out = new BufferedWriter(fw);
                out.write(System.lineSeparator());
                out.write("----------------------------------------");
                out.write(System.lineSeparator());
                out.write("New Book");
                out.write(System.lineSeparator());
                out.write("Volume : "+ba1);
                out.write(System.lineSeparator());
                out.write("Customer Cash : "+cash);
                out.write(System.lineSeparator());
                out.write("Change : "+cal);
                out.close();

            }
            catch (IOException e){
                e.printStackTrace();
            }

            
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("          Prees [0] for back to Bookstore      ");

        int ch4;
        Scanner n1 = new Scanner(System.in);

        while(true){
            System.out.print("\nEnter your Answer : ");
            ch4 = n1.nextInt();
            clrscr();
            
            if (ch4 == 0){
                System.out.println("-------------------------------------------------");
                System.out.println("              !! Back To Bookstroe !!               ");
                clrscr();
                break;
            }
            else {
                System.out.println("\n ");  
                System.out.println("Enter wrong number ");
                continue;  
            }
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

