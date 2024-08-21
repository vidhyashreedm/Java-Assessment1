package Assessment1;
public class Q8Employee {
	private int id;
	private String name;
	private int sal;

	public Q8Employee(int id, String name, int sal) {
		//super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
public Q8Employee() {
		
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




	public static void main(String[] args) {
		Q8Employee emp = new Q8Employee(101, "sam", 1000);
		Q8Employee.show(emp);
		System.out.println(emp.getId()+" " + emp.getName() + " "+ emp.getSal());
	}

	public static void show(Q8Employee ex) {
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
		ex.setId(102);
	}

 }

