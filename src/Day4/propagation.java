package Day4;

public class propagation {
	void prop() {
		try {
			A();
		}catch(Exception e) {
			System.out.println("Invalid Data");
		}
		System.out.println("Request processed");
		}
	
	void A() {
		A1();
	}
	void A1() {
		System.out.println(0/0);
	}

	public static void main(String[] args) {
		
		propagation p= new propagation();
		p.prop();

	}

}
