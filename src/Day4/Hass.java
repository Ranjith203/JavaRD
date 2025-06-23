package Day4;

import java.util.HashSet;
import java.util.Iterator;
public class Hass {

		//Hashset does'nt accept duplicate,
		//it does not has index based concept.
		//
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> h = new HashSet();
		HashSet<Integer> h1 = new HashSet();
		
		h.add(1);
		h.add(1);
		h.add(2);
		h.add(2);
		h.add(3);
		h.add(3);
		h.add(4);
		h.add(6);
		System.out.println(h);
		
		h.remove(6);
		System.out.println(h);
		
		h.isEmpty();
		System.out.println(h);
		
		h1.addAll(h);
		System.out.println(h1);
		h1.clear();
		System.out.println(h1);
		
		h1.add(5);
		h1.add(6);
		h1.add(7);
		h1.add(8);
		System.out.println(h1);
		
		Iterator<Integer> t = h1.iterator();
		while(t.hasNext()) {
			int num = t.next();
			if(num==8) {
				t.remove();
			}
		}
		System.out.println(h1);
		
	}

}
