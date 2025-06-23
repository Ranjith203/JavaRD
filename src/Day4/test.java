package Day4;

class Shape{
	void CalculateArea() {
		System.out.println("this is shape");
	}
}
class Circle extends Shape{
	@Override
	void CalculateArea(){
		System.out.println(10*2);
	}
}
class Rectangle extends Shape{
	@Override
	void CalculateArea() {
		System.out.println(50/5);
	}
}
public class test {

	public static void main(String[] args) {
			
		Shape s= new Shape();
		s.CalculateArea();
		
		Circle c = new Circle();
		c.CalculateArea();
		
		Rectangle r = new Rectangle();
		r.CalculateArea();
	}

}




