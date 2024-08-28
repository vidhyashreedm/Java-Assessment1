package oops_features_examples;
//Create product class with id,name,price,qnty and create object with some data and 
//display that data using toString
class product
{
	private int id;
	private String name;
	private double price;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public product(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
public class Q53 {
public static void main(String args[])
{
	product p=new product(1,"product x",1000,10);
	System.out.println(p);//overriding toString()
	
	
}

}
