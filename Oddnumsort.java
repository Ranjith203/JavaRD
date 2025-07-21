package Tasks;

import java.util.Arrays;

public class Oddnumsort {

	public static void main(String[] args) {
		int []a= {3,1,7,4,12,5};
		int odd = 0;
		for (int i = 0; i < a.length; i++) {
			if((a[i]%2)!=0){
				a[odd]=a[i];
				odd++;
			}
		}
		 int[] oddNumbers = Arrays.copyOf(a,odd);
	        System.out.println(Arrays.toString(oddNumbers));
	    }
	
	}


