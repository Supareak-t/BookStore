import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.*;

public class Sports{
    public void sports () throws FileNotFoundException {
        Scanner sports = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        int ch3;
        int ch4;
        int ch5;
        int ch6;
        int ch7;
        int ch8;

        while(true){
            System.out.println("_________________________________SPORTS_________________________________");
            System.out.println("                            [1] Slam dunk                               ");
            System.out.println("                            [2] Inazuma Eleven                          ");
            System.out.println("                            [3] Captain Tsubasa                         ");
            System.out.println("                            [4] Prince of Tennis                        ");
            System.out.println("                            [5] Kuroko no Basket                        ");
            System.out.println("                            [0] Back                                    ");
            System.out.println("________________________________________________________________________");


            System.out.print("\nEnter your choice: ");


            ch3 = sports.nextInt();
            clrscr();

            if (ch3 == 1){

                System.out.println("\n___________________Slam dunk_______________________________");
                    File file10 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/10_Slam dunk.txt"); //อ่านไฟล์ใน .txt
                    Scanner scan10 = new Scanner(file10);

                    String file10Content ="";
                    while(scan10.hasNextLine()){
                        System.out.println(scan10.nextLine());
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

                        BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/10_Slam dunk.txt"));
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

                        ba1 = sports.nextInt();
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
                        cash = sports.nextInt();

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
                                out.write("Slam dunk ");
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
        System.out.println("          Prees [0] for back to Sports      ");

        while(true){
                System.out.print("\nEnter your Anwser: ");
                ch4 = s1.nextInt();

                if (ch4 == 0){
                        System.out.println("-------------------------------------------------");
                        System.out.println("              !! Back To Sports !!               ");
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

else if(ch3 == 2){

    System.out.println("\n___________________Inazuma Eleven____________________________");
                    File file11 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/11_Inazuma Eleven.txt"); //อ่านไฟล์ใน .txt
                    Scanner scan11 = new Scanner(file11);

                    String file11Content ="";
                    while(scan11.hasNextLine()){
                        System.out.println(scan11.nextLine());
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

                        BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/11_Inazuma Eleven.txt"));
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

                        ba1 = sports.nextInt();
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
                        cash = sports.nextInt();

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
                                out.write("Inazuma Eleven ");
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
        System.out.println("          Prees [0] for back to Sports      ");

        while(true){
                System.out.print("\nEnter your Anwser: ");
                ch5 = s1.nextInt();

                if (ch5 == 0){
                        System.out.println("-------------------------------------------------");
                        System.out.println("              !! Back To Sports !!               ");
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

else if(ch3 == 3){

    System.out.println("\n___________________Captain Tsubasa___________________________");
                    File file12 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/12_Captain Tsubasa.txt"); //อ่านไฟล์ใน .txt
                    Scanner scan12 = new Scanner(file12);

                    String file12Content ="";
                    while(scan12.hasNextLine()){
                        System.out.println(scan12.nextLine());
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

                        BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/12_Captain Tsubasa.txt"));
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

                        ba1 = sports.nextInt();
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
                        cash = sports.nextInt();

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
                                out.write("Captain Tsubasa");
                                out.write(System.lineSeparator());
                                out.write("Colume : "+ba1);
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
        System.out.println("          Prees [0] for back to Sports      ");

        while(true){
                System.out.print("\nEnter your Anwser: ");
                ch6 = s1.nextInt();

                if (ch6 == 0){
                        System.out.println("-------------------------------------------------");
                        System.out.println("              !! Back To Sports !!               ");
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

else if(ch3 == 4){

        System.out.println("\n___________________Prince of Tennis__________________________");
            File file13 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/13_Prince of Tennis.txt"); //อ่านไฟล์ใน .txt
            Scanner scan13 = new Scanner(file13);

            String file13Content ="";
            while(scan13.hasNextLine()){
                System.out.println(scan13.nextLine());
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

                BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/13_Prince of Tennis.txt"));
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

                ba1 = sports.nextInt();
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
                cash = sports.nextInt();

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
                        out.write("Prince of Tennis");
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
System.out.println("          Prees [0] for back to Sports      ");

while(true){
        System.out.print("\nEnter your Anwser: ");
        ch7 = s1.nextInt();

        if (ch7 == 0){
                System.out.println("-------------------------------------------------");
                System.out.println("              !! Back To Sports !!               ");
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

else if(ch3 == 5){
        System.out.println("\n___________________Kuroko no Basket__________________________");
            File file14 = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Text_Booktype/14_Kuroko no Basket.txt"); //อ่านไฟล์ใน .txt
            Scanner scan14 = new Scanner(file14);

            String file14Content ="";
            while(scan14.hasNextLine()){
                System.out.println(scan14.nextLine());
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

                BufferedReader r = new BufferedReader(new FileReader("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Price/14_Kuroko no Basket.txt"));
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

                ba1 = sports.nextInt();
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
                cash = sports.nextInt();

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
                        out.write("Kuroko no Basket");
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
System.out.println("          Prees [0] for back to Sports      ");

while(true){
        System.out.print("\nEnter your Anwser: ");
        ch8 = s1.nextInt();

        if (ch8 == 0){
                System.out.println("-------------------------------------------------");
                System.out.println("              !! Back To Sports !!               ");
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


