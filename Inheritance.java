package day13;

class Animal{
	void makeSound() {
		System.out.println("THIS ANIMAL MAKES A SOUND");
	}
}

class Dog extends Animal{
	void makeSound() {
		System.out.println("THE DOG BARKS");
	}
}
class Cat extends Dog{
	@Override
	void makeSound() {
		System.out.println("THE CAT MEOWS");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.makeSound();
		c.makeSound();
	}
}
