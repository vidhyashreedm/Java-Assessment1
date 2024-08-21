package Assessment1;

public class Q3Employee {
	private int id;
	private String name;
	private int sal;

	public Q3Employee(int id, String name, int sal) {
		//super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
public Q3Employee() {
		
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

	public int getsal() {
		return sal;
	}

	public void setsal(int sal) {
		this.sal = sal;
	}

public static void main(String[] args)
{
	Q3Employee e=new Q3Employee(101,"sam",1000);
	System.out.println(e.getId());
	System.out.println(e.getName());
	System.out.println(e.getsal());
	
}
}