package Assessment1;
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
}
public class Q10Employee {
	public static void main(String[] args) {
		Employeee e=new Employeee(101,"sam",1000);
		Q10Employee e2=new Q10Employee();
		e2.show(e);
		e.setSal(e.getSal()+100);
		e2.show(e);
		//create Employee object with 101,sam,1000 data
		//display this object data by passing to show method
		//add 100 bonus in salary 
		//display this object data by passing to show method
	}
	public void show(Employeee e){
		//do required changes in show method
		System.out.println(e.getId() + " " + e.getName() + " " + e.getSal());
	 
	}

}
