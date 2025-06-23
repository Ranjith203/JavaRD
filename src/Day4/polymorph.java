package Day4;

class fruites{
	void price() {
		System.out.println("no value");
	}
}
	class apple extends fruites{
	@Override
		void price () {
			 System.out.println("30");
		}
	}
	class orange extends fruites{
		@Override
		void price() {
			System.out.println("40");
		}
	}
	class mango extends fruites{
		@Override
		void price() {
			System.out.println("50");
		}
	}

public class polymorph {

 public static void main(String[] args) {
	 fruites I = new fruites();
	 I.price();
	 I= new apple();				
	 I.price();
	 I= new orange();
	 I.price();
	 I= new mango();
	 I.price();
 }
}