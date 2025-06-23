package Day4;

public class garb {
	
	public void finalize() {
		 System.out.println("Sucessfully cleaned");
	} 

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
		garb  g = new garb();
		g=null;
		System.gc();
		}
	}
}

