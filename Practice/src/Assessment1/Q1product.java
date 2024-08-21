package Assessment1;
//Create Product class with fields id,name and price and create Product
//object and store data and display that data
public class Q1product
{
	private int id;
	private String name;
	private double price;

	public static void main(String[] args) {
		Q1product p=new Q1product();
		p.id=10;
		p.name="vidya";
		p.price=200.0;
		System.out.println("Product Id:"+p.id);
		System.out.println("Product Name:"+p.name);
		System.out.println("Product price:"+p.price);
		}
}