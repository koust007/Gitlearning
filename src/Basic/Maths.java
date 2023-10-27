package Basic;

public class Maths {

	public void add(int a , int b) {
		int result = a + b;
		System.out.println("Sum of two numbers is :"+result);
		
		
	}
	
	public void multiple(int a , int b) {
		int result = a * b;
		System.out.println("Multiply of two numbers is :"+result);
		
		
	}
	
	public void Sub(int a , int b) {
		int result = a - b;
		System.out.println("Sub of two numbers is :"+result);
		
		
	}
	
	//Dev 2 has made this change
	
	public static void main(String[] args) {
		Maths obj = new Maths();
		obj.add(2, 5);
		obj.multiple(2, 5);
		obj.Sub(5, 2);

	}

}
