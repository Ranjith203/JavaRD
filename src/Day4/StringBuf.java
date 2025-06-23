package Day4;

public class StringBuf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A1 = "Hello";
		
		StringBuffer A = new StringBuffer("Java");
		System.out.println(A);
		A.insert(1,"AVA"); //Mutable 
		System.out.println(A);
		
		//Replace
		A.replace(1, 3,"Hi");
		System.out.println(A);
		
		//Delete
		A.delete(1,4);
		System.out.println(A);
		A.deleteCharAt(1);
		System.out.println(A);
		
		A.insert(1,"a"); //insert
		System.out.println(A);
		
		System.out.println(A1.replace("e","a"));
		System.out.println(A1);
		
		
		//****String is not mutable, where else string buffer is mutable****
		//****string buffer and string builder is same as per the methods****   
		//****Difference of buffer and builder is builder thread safe where else buffer is not thread safe****
		
		
		
	}

}
