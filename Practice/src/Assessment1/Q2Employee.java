package Assessment1;

public class Q2Employee {
	private int id=101;
	private String name="sam";
	private int sal=1000;
	
	void display()
	{
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("sal:"+sal);
	}
	
	public static void main(String args[])
	{
	Q2Employee e=new Q2Employee();
	e.display();
	}
	
}




