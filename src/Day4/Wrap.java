package Day4;

public class Wrap {

	static Integer A= 25;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//number inbuilt class methods
		
		System.out.println(A.compareTo(20));
		System.out.println(A.doubleValue());
		System.out.println(A.equals(25));
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.min(20,15));
		System.out.println(Integer.max(10,5));
		System.out.println(Integer.compareUnsigned(20,-50));
		
		
		//Character inbuilt methods
		
		Character c = 'A';
		Character B = '8';
		Character D ='$';
		Character E =' ';
		
		System.out.println(Character.isUpperCase(c));
		System.out.println(Character.isLowerCase(c));
		System.out.println(Character.isDigit(B));
		System.out.println(Character.isLetter(D));
		System.out.println(Character.isLetterOrDigit(D));
		System.out.println(Character.isWhitespace(E));
		
		
		
		//Problem 1
		
		String s ="jf2#j4%i2@#3#c&44v*";
		int l=0,d=0,y=0;
		for (int i = 0; i < s.length(); i++) {
			char C =s.charAt(i);
			if(Character.isLetter(C)) {
				l++;
			}else if(Character.isDigit(C)) {
				d++;
			}else {
				y++;
			} 
		}
		System.out.println("Letter->"+l);
		System.out.println("Digit->"+d);
		System.out.println("Symbol->"+y);
		
		
		//problem 2 
		
		String F = "aaabbbbcccc";
		int Q = 0;
		char Q2 = F.charAt(0);
		String res ="";
		for (int i = 0; i < F.length(); i++) {
			if(Q2!=F.charAt(i)) {
				res = res+Q2+""+Q;
				Q=0;
				Q2=F.charAt(i);
			}
			Q++;
		}
		res = res+Q2+""+Q;
		System.out.println(res);
	}
}

		


