package Assessment1;

public class Q4Employee {
	private int id;
	private String name;
	private int sal;

	public Q4Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("sal:"+sal);
	}
	public static void main(String args[])
	{
		Q4Employee e=new Q4Employee(100,"sam",1000);
		e.display();
	}

}
