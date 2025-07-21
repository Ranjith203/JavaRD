package Tasks;

//Fibonacci sequence is the addition of two number in the set of numbers 
public class Fibonacci {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8};
			
		int f = 0;
		  int s = 1;
		  int t;
		 
		  System.out.print(f+" "+s);
		  for(int i = 0; i < 10; i++)
		  {
			  t = f+s;
			  System.out.print(" "+t);
			  f = s;
			  s = t;
		  }
		 } 
	}
