package day10;

public class Car {
	
int year;
String make;

	Car(){
		year = 2000;
		make = "unknown";
}
	Car( String make){
		year = 2001;
		this.make=make;
}
	Car(int year, String make){
		this.year=year;
		this.make=make;
}
	void displayCarDetails() {
		System.out.println(year);
		System.out.println(make);
	}
}
