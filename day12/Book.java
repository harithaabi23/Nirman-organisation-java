package day12;

public class Book {
private String title;
private String author;
private double price;
private int numberOfCopies;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public int getNumberOfCopies() {
	return numberOfCopies;
}

public void setNumberOfCopies(int numberOfCopies) {
	this.numberOfCopies = numberOfCopies;
}

 Book() {	
}

  Book(String title, String author, double price, int numberOfCopies) {
	this.title = title;
	this.author = author;
	this.price = price;
	this.numberOfCopies = numberOfCopies;
}

@Override
public String toString() {
	return "Book [title=" + title + ", author=" + author + ", price=" + price + ", numberOfCopies=" + numberOfCopies
			+ "]";
}

}
