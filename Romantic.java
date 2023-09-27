import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class Romantic{
    public void romantic () throws FileNotFoundException {
        Scanner romantic = new Scanner(System.in);
        Scanner r1 = new Scanner(System.in);

        int ch3;
        int ch4;
        int ch5;
        int ch6;
        int ch7;

        while(true){
            System.out.println("_________________________________ROMANTIC_________________________________");
            System.out.println("                              [1] Doraemon                                ");
            System.out.println("                              [2] Your Name                               ");
            System.out.println("                              [3] Fullmetal Alchemist                     ");
            System.out.println("                              [4] High school dxd                         ");
            System.out.println("                              [0] Back                                    ");
            System.out.println("__________________________________________________________________________");

            System.out.print("\nEnter your choice: ");

            ch3 = romantic.nextInt();
            clrscr();

            if(ch3 == 1){
                System.out.println("\n___________________Doraemon__________________________");
                    File file6 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/6_Doraemon.txt"); //อ่านไฟล์ใน .txt
                    Scanner scan6 = new Scanner(file6);

                    String file6Content ="";
                    while(scan6.hasNextLine()){
                        System.out.println(scan6.nextLine());
                }
                System.out.println("---------------------------------------------------");
                try{
                        float buy1 = 0.0f;
                        float buy2 = 0.0f;
                        float buy3 = 0.0f;
                        float buy4 = 0.0f;
                        float buy5 = 0.0f;
                        float buy6 = 0.0f;
                        float buy7 = 0.0f;;
                        float buy8 = 0.0f;
                        float buy9 = 0.0f;
                        float buy10 = 0.0f;
                        
                        BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/6_Doraemon.txt"));
                        String s = "";
                        
                        while ((s = r.readLine()) != null) {
                                String[] data = s.split(",");
                                buy1 = Float.parseFloat(data[0]);
                                buy2 = Float.parseFloat(data[1]);
                                buy3 = Float.parseFloat(data[2]);
                                buy4 = Float.parseFloat(data[3]);
                                buy5 = Float.parseFloat(data[4]);
                                buy6 = Float.parseFloat(data[5]);
                                buy7 = Float.parseFloat(data[6]);
                                buy8 = Float.parseFloat(data[7]);
                                buy9 = Float.parseFloat(data[8]);
                                buy10 = Float.parseFloat(data[9]);

                        }
                        r.close();
                        System.out.printf("volume 1 Price : %.2f\n",buy1);
                        System.out.printf("volume 2 Price : %.2f\n",buy2);
                        System.out.printf("volume 3 Price : %.2f\n",buy3);
                        System.out.printf("volume 4 Price : %.2f\n",buy4);
                        System.out.printf("volume 5 Price : %.2f\n",buy5);
                        System.out.printf("volume 6 Price : %.2f\n",buy6);
                        System.out.printf("volume 7 Price : %.2f\n",buy7);
                        System.out.printf("volume 8 Price : %.2f\n",buy8);
                        System.out.printf("volume 9 Price : %.2f\n",buy9);
                        System.out.printf("volume 10 Price : %.2f\n",buy10);

                        int ba1 = 0;

                        System.out.println("\nYou can select one books.");
                        System.out.print("Volume :");
                        
                        ba1 = romantic.nextInt();
                        float price = 0;
                        if (ba1==1){
                                price = buy1;
                                System.out.println("price : "+buy1);
                        }
                        else if (ba1==2){
                                price = buy2;
                                System.out.println("price : "+buy2);
                        }
                        else if (ba1==3){
                                price = buy3;
                                System.out.println("price : "+buy3);
                        }
                        else if (ba1==4){
                                price = buy4;
                                System.out.println("price : "+buy4);
                        }
                        else if (ba1==5){
                                price = buy5;
                                System.out.println("price : "+buy5);
                        }
                        else if (ba1==6){
                                price = buy6;
                                System.out.println("price : "+buy6);
                        }
                        else if (ba1==7){
                                price = buy7;
                                System.out.println("price : "+buy7);
                        }
                        else if (ba1==8){
                                price = buy8;
                                System.out.println("price : "+buy8);
                        }
                        else if (ba1==9){
                                price = buy2;
                                System.out.println("price : "+buy9);
                        }
                        else if (ba1==10){
                                price = buy10;
                                System.out.println("price : "+buy10);
                        }
                        else if(ba1>10){
                                System.out.println("There are only 10 volumes right now. DUDE!!");
                        }

                        System.out.println("\nCustomer Cash");
                        System.out.print("amount :");

                        float cash = 0.00f;
                        float cal = 0.00f;
                        cash = romantic.nextInt();

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
                                out.write("Doraemon ");
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
        System.out.println("          Prees [0] for back to Romantic      ");

        while(true){
                System.out.print("\nEnter your Anwser: ");
                ch4 = r1.nextInt();
                
                if (ch4 == 0){
                        System.out.println("-------------------------------------------------");
                        System.out.println("              !! Back To Romantic !!               ");
                        clrscr();
                        break;
                }
                else{
                   System.out.println("\n ");  
                   System.out.println("Enter wrong number ");
                   continue;  
           }

   }  
   System.out.println("\n");
   continue;
}

else if (ch3 == 2){
    System.out.println("\n___________________Your Name_________________________");
                    File file7 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/7_Your Name.txt"); //อ่านไฟล์ใน .txt
                    Scanner scan7 = new Scanner(file7);

                    String file7Content ="";
                    while(scan7.hasNextLine()){
                        System.out.println(scan7.nextLine());
                }
                System.out.println("---------------------------------------------------");
                try{
                        float buy1 = 0.0f;
                        float buy2 = 0.0f;
                        float buy3 = 0.0f;
                        float buy4 = 0.0f;
                        float buy5 = 0.0f;
                        float buy6 = 0.0f;
                        float buy7 = 0.0f;;
                        float buy8 = 0.0f;
                        float buy9 = 0.0f;
                        float buy10 = 0.0f;
                        
                        BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/7_Your Name.txt"));
                        String s = "";
                        
                        while ((s = r.readLine()) != null) {
                                String[] data = s.split(",");
                                buy1 = Float.parseFloat(data[0]);
                                buy2 = Float.parseFloat(data[1]);
                                buy3 = Float.parseFloat(data[2]);
                                buy4 = Float.parseFloat(data[3]);
                                buy5 = Float.parseFloat(data[4]);
                                buy6 = Float.parseFloat(data[5]);
                                buy7 = Float.parseFloat(data[6]);
                                buy8 = Float.parseFloat(data[7]);
                                buy9 = Float.parseFloat(data[8]);
                                buy10 = Float.parseFloat(data[9]);

                        }
                        r.close();
                        System.out.printf("volume 1 Price : %.2f\n",buy1);
                        System.out.printf("volume 2 Price : %.2f\n",buy2);
                        System.out.printf("volume 3 Price : %.2f\n",buy3);
                        System.out.printf("volume 4 Price : %.2f\n",buy4);
                        System.out.printf("volume 5 Price : %.2f\n",buy5);
                        System.out.printf("volume 6 Price : %.2f\n",buy6);
                        System.out.printf("volume 7 Price : %.2f\n",buy7);
                        System.out.printf("volume 8 Price : %.2f\n",buy8);
                        System.out.printf("volume 9 Price : %.2f\n",buy9);
                        System.out.printf("volume 10 Price : %.2f\n",buy10);

                        int ba1 = 0;

                        System.out.println("\nYou can select one books.");
                        System.out.print("Volume :");
                        
                        ba1 = romantic.nextInt();
                        float price = 0;
                        if (ba1==1){
                                price = buy1;
                                System.out.println("price : "+buy1);
                        }
                        else if (ba1==2){
                                price = buy2;
                                System.out.println("price : "+buy2);
                        }
                        else if (ba1==3){
                                price = buy3;
                                System.out.println("price : "+buy3);
                        }
                        else if (ba1==4){
                                price = buy4;
                                System.out.println("price : "+buy4);
                        }
                        else if (ba1==5){
                                price = buy5;
                                System.out.println("price : "+buy5);
                        }
                        else if (ba1==6){
                                price = buy6;
                                System.out.println("price : "+buy6);
                        }
                        else if (ba1==7){
                                price = buy7;
                                System.out.println("price : "+buy7);
                        }
                        else if (ba1==8){
                                price = buy8;
                                System.out.println("price : "+buy8);
                        }
                        else if (ba1==9){
                                price = buy2;
                                System.out.println("price : "+buy9);
                        }
                        else if (ba1==10){
                                price = buy10;
                                System.out.println("price : "+buy10);
                        }
                        else if(ba1>10){
                                System.out.println("There are only 10 volumes right now. DUDE!!");
                        }

                        System.out.println("\nCustomer Cash");
                        System.out.print("amount :");

                        float cash = 0.00f;
                        float cal = 0.00f;
                        cash = romantic.nextInt();

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
                                out.write("Your Name ");
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
        System.out.println("          Prees [0] for back to Romantic      ");

        while(true){
                System.out.print("\nEnter your Anwser: ");
                ch5 = r1.nextInt();
                
                if (ch5 == 0){
                        System.out.println("-------------------------------------------------");
                        System.out.println("              !! Back To Romantic !!               ");
                        clrscr();
                        break;
                }
                else{
                   System.out.println("\n ");  
                   System.out.println("Enter wrong number ");
                   continue;  
           }

   } 
   System.out.println("\n");
   continue;
}

else if (ch3 == 3){
    System.out.println("\n___________________Fullmetal Alchemist_______________");
                    File file8 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/8_Fullmetal Alchemist.txt"); //อ่านไฟล์ใน .txt
                    Scanner scan8 = new Scanner(file8);

                    String file8Content ="";
                    while(scan8.hasNextLine()){
                        System.out.println(scan8.nextLine());
                }
                System.out.println("---------------------------------------------------");
                try{
                        float buy1 = 0.0f;
                        float buy2 = 0.0f;
                        float buy3 = 0.0f;
                        float buy4 = 0.0f;
                        float buy5 = 0.0f;
                        float buy6 = 0.0f;
                        float buy7 = 0.0f;;
                        float buy8 = 0.0f;
                        float buy9 = 0.0f;
                        float buy10 = 0.0f;
                        
                        BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/8_Fullmetal Alchemist.txt"));
                        String s = "";
                        
                        while ((s = r.readLine()) != null) {
                                String[] data = s.split(",");
                                buy1 = Float.parseFloat(data[0]);
                                buy2 = Float.parseFloat(data[1]);
                                buy3 = Float.parseFloat(data[2]);
                                buy4 = Float.parseFloat(data[3]);
                                buy5 = Float.parseFloat(data[4]);
                                buy6 = Float.parseFloat(data[5]);
                                buy7 = Float.parseFloat(data[6]);
                                buy8 = Float.parseFloat(data[7]);
                                buy9 = Float.parseFloat(data[8]);
                                buy10 = Float.parseFloat(data[9]);

                        }
                        r.close();
                        System.out.printf("volume 1 Price : %.2f\n",buy1);
                        System.out.printf("volume 2 Price : %.2f\n",buy2);
                        System.out.printf("volume 3 Price : %.2f\n",buy3);
                        System.out.printf("volume 4 Price : %.2f\n",buy4);
                        System.out.printf("volume 5 Price : %.2f\n",buy5);
                        System.out.printf("volume 6 Price : %.2f\n",buy6);
                        System.out.printf("volume 7 Price : %.2f\n",buy7);
                        System.out.printf("volume 8 Price : %.2f\n",buy8);
                        System.out.printf("volume 9 Price : %.2f\n",buy9);
                        System.out.printf("volume 10 Price : %.2f\n",buy10);

                        int ba1 = 0;

                        System.out.println("\nYou can select one books.");
                        System.out.print("Volume :");
                        
                        ba1 = romantic.nextInt();
                        float price = 0;
                        if (ba1==1){
                                price = buy1;
                                System.out.println("price : "+buy1);
                        }
                        else if (ba1==2){
                                price = buy2;
                                System.out.println("price : "+buy2);
                        }
                        else if (ba1==3){
                                price = buy3;
                                System.out.println("price : "+buy3);
                        }
                        else if (ba1==4){
                                price = buy4;
                                System.out.println("price : "+buy4);
                        }
                        else if (ba1==5){
                                price = buy5;
                                System.out.println("price : "+buy5);
                        }
                        else if (ba1==6){
                                price = buy6;
                                System.out.println("price : "+buy6);
                        }
                        else if (ba1==7){
                                price = buy7;
                                System.out.println("price : "+buy7);
                        }
                        else if (ba1==8){
                                price = buy8;
                                System.out.println("price : "+buy8);
                        }
                        else if (ba1==9){
                                price = buy2;
                                System.out.println("price : "+buy9);
                        }
                        else if (ba1==10){
                                price = buy10;
                                System.out.println("price : "+buy10);
                        }
                        else if(ba1>10){
                                System.out.println("There are only 10 volumes right now. DUDE!!");
                        }

                        System.out.println("\nCustomer Cash");
                        System.out.print("amount :");

                        float cash = 0.00f;
                        float cal = 0.00f;
                        cash = romantic.nextInt();

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
                                out.write("Fullmetal Alchemist ");
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
        System.out.println("          Prees [0] for back to Romantic      ");

        while(true){
                System.out.print("\nEnter your Anwser: ");
                ch6 = r1.nextInt();
                
                if (ch6 == 0){
                        System.out.println("-------------------------------------------------");
                        System.out.println("              !! Back To Romantic !!               ");
                        clrscr();
                        break;
                }
                else{
                   System.out.println("\n ");  
                   System.out.println("Enter wrong number ");
                   continue;  
           }

   } 
   System.out.println("\n");
   continue;
}

else if (ch3 == 4){
    System.out.println("\n___________________High school dxd___________________");
                    File file9 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/9_High school dxd.txt"); //อ่านไฟล์ใน .txt
                    Scanner scan9 = new Scanner(file9);

                    String file9Content ="";
                    while(scan9.hasNextLine()){
                        System.out.println(scan9.nextLine());
                }
                System.out.println("---------------------------------------------------");
                try{
                        float buy1 = 0.0f;
                        float buy2 = 0.0f;
                        float buy3 = 0.0f;
                        float buy4 = 0.0f;
                        float buy5 = 0.0f;
                        float buy6 = 0.0f;
                        float buy7 = 0.0f;;
                        float buy8 = 0.0f;
                        float buy9 = 0.0f;
                        float buy10 = 0.0f;
                        
                        BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/9_High school dxd.txt"));
                        String s = "";
                        
                        while ((s = r.readLine()) != null) {
                                String[] data = s.split(",");
                                buy1 = Float.parseFloat(data[0]);
                                buy2 = Float.parseFloat(data[1]);
                                buy3 = Float.parseFloat(data[2]);
                                buy4 = Float.parseFloat(data[3]);
                                buy5 = Float.parseFloat(data[4]);
                                buy6 = Float.parseFloat(data[5]);
                                buy7 = Float.parseFloat(data[6]);
                                buy8 = Float.parseFloat(data[7]);
                                buy9 = Float.parseFloat(data[8]);
                                buy10 = Float.parseFloat(data[9]);

                        }
                        r.close();
                        System.out.printf("volume 1 Price : %.2f\n",buy1);
                        System.out.printf("volume 2 Price : %.2f\n",buy2);
                        System.out.printf("volume 3 Price : %.2f\n",buy3);
                        System.out.printf("volume 4 Price : %.2f\n",buy4);
                        System.out.printf("volume 5 Price : %.2f\n",buy5);
                        System.out.printf("volume 6 Price : %.2f\n",buy6);
                        System.out.printf("volume 7 Price : %.2f\n",buy7);
                        System.out.printf("volume 8 Price : %.2f\n",buy8);
                        System.out.printf("volume 9 Price : %.2f\n",buy9);
                        System.out.printf("volume 10 Price : %.2f\n",buy10);

                        int ba1 = 0;

                        System.out.println("\nYou can select one books.");
                        System.out.print("Volume :");
                        
                        ba1 = romantic.nextInt();
                        float price = 0;
                        if (ba1==1){
                                price = buy1;
                                System.out.println("price : "+buy1);
                        }
                        else if (ba1==2){
                                price = buy2;
                                System.out.println("price : "+buy2);
                        }
                        else if (ba1==3){
                                price = buy3;
                                System.out.println("price : "+buy3);
                        }
                        else if (ba1==4){
                                price = buy4;
                                System.out.println("price : "+buy4);
                        }
                        else if (ba1==5){
                                price = buy5;
                                System.out.println("price : "+buy5);
                        }
                        else if (ba1==6){
                                price = buy6;
                                System.out.println("price : "+buy6);
                        }
                        else if (ba1==7){
                                price = buy7;
                                System.out.println("price : "+buy7);
                        }
                        else if (ba1==8){
                                price = buy8;
                                System.out.println("price : "+buy8);
                        }
                        else if (ba1==9){
                                price = buy2;
                                System.out.println("price : "+buy9);
                        }
                        else if (ba1==10){
                                price = buy10;
                                System.out.println("price : "+buy10);
                        }
                        else if(ba1>10){
                                System.out.println("There are only 10 volumes right now. DUDE!!");
                        }

                        System.out.println("\nCustomer Cash");
                        System.out.print("amount :");

                        float cash = 0.00f;
                        float cal = 0.00f;
                        cash = romantic.nextInt();

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
                                out.write("High school dxd ");
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
        System.out.println("          Prees [0] for back to Romantic      ");

        while(true){
                System.out.print("\nEnter your Anwser: ");
                ch7 = r1.nextInt();
                
                if (ch7 == 0){
                        System.out.println("-------------------------------------------------");
                        System.out.println("              !! Back To Romantic !!               ");
                        clrscr();
                        break;
                }
                else{
                   System.out.println("\n ");  
                   System.out.println("Enter wrong number ");
                   continue;  
           }

   } 
   System.out.println("\n");
   continue;
}

else if(ch3 == 0){
    break;
}

else{
    System.out.println("Your choice is wrong!");
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