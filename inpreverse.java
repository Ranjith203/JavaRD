package Tasks;

import java.util.Scanner;
import java.util.Arrays;


public class inpreverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 int size = sc.nextInt();
		 
		 int [] a = new int[size];
		 System.out.println("Enter "+size+" numbers:");
		 for(int i=0; i<size;i++) {
			 a[i]=sc.nextInt();
			 
			 System.out.print("You entered: ");
		       for (int num : a) {
		           System.out.print(num + " ");
		        }   
		 }
		 	int nonzero = 0;
		 	for(int i=0;i<a.length;i++) {
		 		if(a[i]!=0) {
		 			a[nonzero]=a[i];
		 			nonzero++;
		 		}
		 	}
		 	for(int i =nonzero;i<a.length;i++) {
		 		a[i]=0;
		 	}
		 	System.out.println(Arrays.toString(a));
		 	sc.close();
		 	
	}

}
