package Day4;

public class even {

	public static void main(String[] args) {
		
		int a= 246978;
		System.out.println("Even numbers");
		while(a > 0) {
			int num = a % 10;
			if(num % 2 == 0) {
				System.out.println(num);
				
			}
			a=num/10;
			}
		}
		
	}

