package Day4;

abstract class sum{
	abstract void method();
	void add(){
		System.out.println("enter a value");
	}
}
class Add extends sum{
	void method(){
		System.out.println(10+20);
	}

}
class Sub extends sum{
	void method(){
		System.out.println(50-10);
	}

}
class div extends sum{
	void method() {
		System.out.println(18/6);
	}

}
public class Abst{

	public static void main(String[] args) {
		sum a= new Add();
		a.method();
		
		sum b= new Sub();
		b.method();
		
		sum c= new div();
		c.method();
		
		}

}
