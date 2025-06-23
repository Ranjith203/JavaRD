package Day4;

public class nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows= 6;
		int spaces= rows*2-1-1;
		for(int i=1; i<rows; i++) {
			for(int j=1;j<spaces;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			spaces-=2;
			
				}
	} 

}
