package Basic;

public class Maths {

	public void add(int a , int b) {
		int result = a + b;
		System.out.println("Sum of two numbers is :"+result);
		
		
	}
	
	//Dev 2 has made this change
	//New methods have been added
	
	public static void main(String[] args) {
		Maths obj = new Maths();
		obj.add(2, 5);

	}

}
