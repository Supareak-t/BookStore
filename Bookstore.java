import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException; 

public class Bookstore{
	public void bookstore() throws FileNotFoundException, IOException{

		Scanner bookstore = new Scanner(System.in);
		Scanner a70 = new Scanner(System.in);
		Booktype a1 = new Booktype();
		Newbook a2 = new Newbook();
		Promotion a3 = new Promotion();
		Receipt a4 = new Receipt();
		Firstpage a5 = new Firstpage();
		clrscr(); 

		int ch1;

		while(true){
			clrscr();
			System.out.println("________________________________________| BOOK Store |________________________________________");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.println("                                |       [1] Book type         |                               ");
			System.out.println("                                |       [2] New Book          |                               ");
			System.out.println("                                |       [3] Promotion         |                               ");
			System.out.println("                                |       [4] Receipt           |                               ");
			System.out.println("                                |       [0] Exit to Firstpage |                               ");
			System.out.println("----------------------------------------------------------------------------------------------");
			System.out.print("Enter your choice:");

			ch1 = bookstore.nextInt();
			clrscr(); 

			if(ch1 == 1){
				a1.booktype();
				continue;
			}

			else if(ch1 == 2){
				a2.newbook();
				continue;
			} 
			else if(ch1 == 3){
				a3.promotion();
				continue;
			}

			else if(ch1 == 4){
				a4.receipt();
				System.out.println("----------------------------------------------------------------------------------------------");
				System.out.print("Press ENTER to continue");
                String Con1 = a70.nextLine();
				continue;
			}

			else if(ch1 == 0){
				a5.firstpage();
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
