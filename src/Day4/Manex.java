package Day4;

class exe extends Exception{
	public exe (String msg) {
		super(msg);
	}
}

public class Manex {

	public static void main(String[] args) throws exe {
		
			int [] a= {1,2,4,3,2,0,9};
			for (int i = 0; i < a.length-1; i++) {
				try {
					if(a[i]<a[i+1]) {
						throw new ArithmeticException("Exception Found");
					}
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					}
				}
			}
	
