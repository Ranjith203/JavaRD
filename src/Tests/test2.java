package Tests;

interface Payment{
	default void MethodOfPayment() {
		System.out.println("method process payment");
	}
}
class Creditcard implements Payment{
	@Override
	public void MethodOfPayment() {
		System.out.println("Pay with Card");
	}
}
class UPIpayment implements Payment{
	@Override
	public void MethodOfPayment() {
		System.out.println("Pay with UPI");
	}
}

abstract class Transaction{
	abstract void method();
	void GenerateReceipt(){
		System.out.println("I will generate your Receipt");
	}
}
class PaymentTransaction extends Transaction {
    @Override
    void method() {
        System.out.println("Transaction Done");
    }
}

public class test2 {

	public static void main(String[] args) {
		
		Creditcard C = new Creditcard();
		C.MethodOfPayment();
		
		UPIpayment U = new UPIpayment();
		U.MethodOfPayment();
		 
		Transaction T = new PaymentTransaction(); 
        T.method();                
        T.GenerateReceipt();                       
	}

}
