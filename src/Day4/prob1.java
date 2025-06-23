package Day4;
 import java.util.*;
 
public class prob1 {
	 enum Entry{
		 A,
		 B,
		 C
		 }
	 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Value");
		 while(true) {
			 try {
				 String value = sc.next();
				 Entry t = Entry.valueOf(value);
				 System.out.println("Enter Value");
				 sc.next();
				 String val = sc.next();
				 Entry c =Entry.valueOf(val);
				 break;
				 
			 }catch (Exception e){
				 e.printStackTrace();
				 sc.next();
			 }
		 }
		

	}

}
