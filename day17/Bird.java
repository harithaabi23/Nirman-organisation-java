package day17;

public class Bird implements IAnimal{
	public void move() {
		System.out.println("the bird flies in the sky");
	}
	
	public void speak() {
		 System.out.println("the bird says: chirp chirp!");
	 }
	
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
