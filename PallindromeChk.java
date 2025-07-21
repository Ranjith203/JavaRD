package Tasks;

public class PallindromeChk {

	public static void main(String[] args) {
		
		int temp=0; //temporary variable to store n 
		int r= 0;	//variable for reversing 
		int sum =0; //the variable for store the value we found
		int n = 225522; //this the number we need to check if its a pallindrom
		
		temp=n;
		while(n>0) {
			r=n%10; //r % every time with 10 
			sum=(sum*10)+r; //in this line we are multiplying with 10 and adding the r so we can get sum value
			n=n/10; //here we are dividing n with 10 so we can get separate the numbers and the loop still runs when the value is 0
		}
		if(temp==sum) { // if temp the temporary value we assigned is equals to the value we found sum then that is pallindrome 
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		}
	}


