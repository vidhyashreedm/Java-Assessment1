package oops_features_examples;
 class Employeee {
	private int id;
	private String name;
	private int sal;

	public Employeee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
public Employeee() {
		
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

public class Q54 {
	public static void main(String args[])
	{
		Employeee e=new Employeee();
		System.out.println(e);
	}
}


}
