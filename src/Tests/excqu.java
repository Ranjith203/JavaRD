package Tests;


class Invalidageexe extends Exception{
	public Invalidageexe(String msg) {
		super(msg);
		}
	}

	public class excqu {
		public static void main(String[] args) throws Invalidageexe{
			
				int [] ages= {18,20,22,23,24,25,16,};
					try {
						for (int i = 0; i < ages.length; i++) {
						if(ages[i]<18) {
							throw new ArithmeticException("Age is below 18");
						 }else {
							 System.out.println("vote is Added");
						 }
						}
						 }catch(Exception e) {
							e.printStackTrace();
						}
		
						}
					}
	

