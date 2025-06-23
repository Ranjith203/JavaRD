package Day4;
import java.util.Scanner;
import java.util.Arrays;

public class Scan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Array Size");
		int n = sc.nextInt();
		int j []= new int [n];
		  for (int i = 0; i < j.length; i++) {
			System.out.println("Enter any Number");
			int n1= sc.nextInt();
			j[i]=n1;
		}
		 System.out.println(Arrays.toString(j));
	}

} 
