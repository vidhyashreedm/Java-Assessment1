package Assessment1;
 class employee1
 {
	private int id;
	private String name;
	private int sal;

	public employee1(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
public employee1() {
		
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
}

public class Q9Employee {
	public static void main(String[] args) {
		//create Employee object with 101,sam,1000 data
		//display this object data by passing to show method
		//add 100 bonus in salary 
		//display this object data by passing to show method
		employee1 e=new employee1(101,"sam",1000);
		show(e);
		e.setSal(e.getSal()+100);
		show(e);
	}
	public static void show(employee1 ex){
		//do required changes in show method
		System.out.println(ex.getId() + " " + ex.getName() + " " + ex.getSal());
	}
}
