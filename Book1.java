package day22;

public class Book1 {
	private int id;
	private String title;
	private String author;
	private double price;
	private int numberOfCopies;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	@Override
	public String toString() {
		return "Book1 [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", numberOfCopies="
				+ numberOfCopies + "]";
	}
	public Book1(int id, String title, String author, double price, int numberOfCopies) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.numberOfCopies = numberOfCopies;
	}
	public Book1() {
		super();
	}
	
	
	
	
}
