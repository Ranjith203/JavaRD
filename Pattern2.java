package Tasks;

public class Pattern2 {
	/*
	 * ****
	 * *  *
	 * *  *
	 * ****
	 */
	public static void main(String[] args) {
		
		int row=6;
		int col=6;
		
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(i==0 || j==0 || i==5 || j==5) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(); 
		}
	}

}
