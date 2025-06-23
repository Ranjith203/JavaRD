package Day4;

public class exp {

	public static void main(String[] args) {
		
		try {
			int [] A= {1,2,3,4,5,6,7};
			   System.out.println(A[9]);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Next Process");
		}
	finally {
		System.out.println("Process Done");
	}

	}
}

