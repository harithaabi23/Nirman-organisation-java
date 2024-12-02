package day1;

public class ReturnType {
    String addition(int a, int b) {
    	return "Addition: " +(a+b);
    }
    String subtraction(int a, int b) {
    	return "subtraction: " +(a-b);
    }
    String multiplication(int a, int b) {
    	return "multiplication: " +(a*b);
    }
    String division(int a, int b) {
    	return "division: " +(a/b);
    }
    String modulus(int a, int b) {
    	return "modulus: " +(a%b);
    }
    
    public static void main(String[] args) {
		// use return type to store the value and can b used again
    	ReturnType number = new ReturnType();
    	
    	String add= number.addition(10, 20);
    	System.out.println(add);
    	
    	String sub= number.subtraction(10, 20);
    	System.out.println(sub);
    	
    	String mul= number.multiplication(10, 20);
    	System.out.println(mul);
    	
    	String div= number.division(10, 20);
    	System.out.println(div);
    	
    	String mod= number.modulus(10, 20);
    	System.out.println(mod);
    
    	
	}
}












