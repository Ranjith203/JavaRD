package Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class Collectn {
	
	//ArrayList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A1 = new ArrayList();
		ArrayList<Integer> a = new ArrayList();
		
	//Adding	
		A1.add(5);
		A1.add(6);
		A1.add(0,7);
		A1.add(8);
		A1.add(9);
		A1.add(3,10);
		System.out.println(A1);
		System.out.println(A1.get(3));
		
		//Update
		A1.set(5,15);
		System.out.println(A1);
		
		//Remove
		A1.remove(0);
		System.out.println(A1);
		
		//To add an entire array
		a.addAll(A1);
		a.remove(0); 
		a.removeIf(e->e<10);
		System.out.println(a);
		System.out.println(A1.contains(2));// checks if the number exist in the array
		System.out.println(A1.indexOf(15)); //***finds from the start****
		System.out.println(A1.lastIndexOf(6));//*****finds from the end*****
		System.out.println(A1.isEmpty()); //checks  if the Array is empty*****
		System.out.println(A1.subList(2,5));//cuts and gives Specific array index*****
		
		//sort
		A1.sort(null);
		System.out.println(A1);// sorts the array to ascending order***
		for (int i = 0; i < A1.size(); i++) {  // this is how we use for loop for ArrayList*****
			System.out.println(A1.get(i));
		}
		A1.add(10);
		System.out.println(A1);
		//Lambda function (e->)
		//A1.forEach(e->{             ///ForEach  is not support concurrency 
		//(e==15) {
		//	A1.remove(A1.indexOf(e));

		
		
		
		
		
		
//Iterator
			Iterator<Integer> T = A1.iterator();// import java util iterator to use this****
			while(T.hasNext()) {
				int n = T.next();
				if(n==10) {
					T.remove();
				}
			}
		    System.out.println(A1);
		    
		
		    
	}

}
