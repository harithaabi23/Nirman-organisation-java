package day19;

import java.util.Scanner;

public class Main implements IExample2{

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		
		return a/b;
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("enter a value: ");
			int a = sc.nextInt();
			System.out.println("enter b value: ");
			int b = sc.nextInt();
			obj.add(a, b);
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		
	
	
}}
