import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException; 


public class FileReader{
	public static void main(String[] args) throws IOException   {   //FileNotFoundException
		File file = new File("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/Promotion2.txt");
		Scanner scan = new Scanner(file);

		String fileContent ="hello my name is zuzie";
		while(scan.hasNextLine()){
			fileContent = fileContent.concat(scan.nextLine() + "\n");
			//System.out.println(scan.nextLine());
		}

		FileWriter writer = new FileWriter("C:/Users/maxwi/Desktop/1-2564/308-331 OOP/Final/newfile2.txt");
		writer.write(fileContent);
		writer.close();

	}
}