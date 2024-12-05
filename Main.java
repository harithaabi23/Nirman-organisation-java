package day10;

public class Main {
	public static void main(String [] args){
		Car def= new Car();	
		def.displayCarDetails();
		
		Car single= new Car("tata");
		single.displayCarDetails();
		
		Car doub= new Car(2000,"mahendra");
		doub.displayCarDetails();
	}
	
}
