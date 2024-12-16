package day17;

public class Main{
	public static void main(String[] args) {
		 Dog dog = new Dog();
		 dog.move();
		 dog.speak();
		 Bird bird = new Bird();
		 bird.move();
		 bird.speak();
		 
		 System.out.println( IAnimal.isMammal("dog"));
		 
		 System.out.println(IAnimal.Catogory);
	}
}
