package Day4;

interface cars{
	void models();
}
class audi implements cars{
	public void models() {
		System.out.println("It is Audi Car");
	}
}
class Ferrari implements cars{
	public void models() {
		System.out.println("It is Ferrari Car");
	}
}
class Ford implements cars{
	public void models() {
		System.out.println("It is Ford Car");
	}
}

class price implements cars{
	public void models() {
		System.out.println(50000+50000);
	}
	
}
public class inter{
	
	public static void main(String[] args) {
		audi c=new audi();
		c.models();
		
		Ferrari F=new Ferrari();
		F.models();
		
	    Ford d = new Ford();
	    d.models();
	    
	    price p= new price();
	    p.models();
	    
}

}
