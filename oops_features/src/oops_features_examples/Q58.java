package oops_features_examples;
// Create an employee object with some data and create a clone of it and display data 
//from the cloned object
class Emp implements Cloneable {
	private int id;
	private String name;
	private int sal;

	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
public Emp() {
		
	}

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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class Q58  {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Emp e1=new Emp(101,"Ram",100);
		Emp e2=(Emp)e1.clone();
		System.out.println(e1);
		

	}

}
