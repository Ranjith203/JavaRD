package Tasks;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a= {3,4,6,1,2,5,10,8,9};
		for (int i = 0; i < a.length; i++) {//this is takes the value 3
			for (int j = i+1; j < a.length; j++) { //and this starts from the value 4
				if(a[i]>a[j]) { //we are giving a condition which the i is need to be greater than j
					int b = a[i]; //creating a variable and we store the value of "i" it is a temporary backup
					a[i]=a[j]; 
					a[j]=b;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
	

}
