package Tasks;

public class FindingReapt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,4,4,5,6,2,2,7,8,9,3,3};		
		for (int i = 0; i< a.length; i++) { //this line starts from the 0th index 
			int count = 0; //creating a variable to store the count 
			for (int j =0; j < a.length; j++) { //this loop is also starts from the 0th index
				if(a[i]==a[j] && i!=j) { //we are giving a condition that the loop compares i nd j but the i and j is not going to be same 
					count++; //if the condition passes the count will increase
				}
			}
			if(count==0) { //this condition is for not repeating char so if the count does not increases that is consider as non repeating char
				System.out.println(a[i]); //so we are printing the non repeating characters
				
			}
		}
		
	}

}
