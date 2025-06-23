package Day4;

import java.util.HashMap;

public class Hasma {

	//if we need a meaning to why we have the data in an array that time we need to use HashMap. 
	// Hash map did not support duplicate it will override and take the new one.
	// null can be accepted only one null can be used.
	//Hash map does not maintain orders cause its not a index based it is based on Key.
	//we can use linear search not binary search.
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> H = new HashMap<String,Integer>();
		HashMap<String,String> S = new HashMap<String,String>();
		
		H.put("Apple",50);
		System.out.println(H);
		
		S.put(null, null);
		S.put(null,"150");
		System.out.println(S.getOrDefault("name","def"));
		System.out.println(S.get("Aasda"));
		System.out.println(H.containsKey("Apple"));
		System.out.println(S.containsValue("150"));
		System.out.println(H.keySet());
		System.out.println(H.values());
		System.out.println(H.entrySet());
		
		//linear search*****
		H.entrySet().forEach(e->{
			if(e.getValue().equals(50)) {
				System.out.println(e.getKey());
			}
		});
	}

}
