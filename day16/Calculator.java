package day16;

public class Calculator implements iCalculator {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	public int div(int a, int b) {
		
		return a/b;
	}

}
