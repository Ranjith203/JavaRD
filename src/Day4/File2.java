package Day4;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File2 {

	public static void main(String[] args) throws IOException {
		
		 File f = new File("file2.txt");
		 if(f.createNewFile()){
			 System.out.println("Created");
		 }else {
			 System.out.println("File already exist");
		 }
		 
		 	FileWriter fwrite = new FileWriter(f);
		 	fwrite.append("Name,Price\n Apple,20\n Mango,30\n Orange,50");
		 	fwrite.close();

		 	Scanner sc = new Scanner(f);
		 	int a=0;
		 	while(sc.hasNext()) {
		 		a++;
		 		System.out.println(sc.next());
		 	}
	}
}
