package Tasks;

import java.util.Arrays;

public class movenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {0,1,0,2,0,3,4,5,0};
		int nonzeros=0;// the variable to store non zero elements
		for (int i = 0; i < a.length; i++) { //this loop used to add the non zero elements to an array
			if(a[i]!=0) { 
				a[nonzeros]=a[i]; //this is where we adding the non zero in the array
				nonzeros++; // this is nonzero elements count
			}
		}
		for (int i = nonzeros; i < a.length; i++) { //this loop is used to add the zero in the balance indexes because the index values of our array is 9
			a[i]=0; //adding zeros
		}
		System.out.println(Arrays.toString(a));
	}

}
