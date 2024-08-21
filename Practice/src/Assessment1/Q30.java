package Assessment1;

public class Q30 {
	public static Employee m1(){
		//create Employee object here and return
		//do required changes in m1 method to do this task
		Employee e=new Employee(101,"sam",1000);
		return e;
	}


	public static void main(String[] args) {
		//call m1 method and catch returned employee object here
		//display returned employee data here
		Employee s=m1();
		System.out.println(s.getId()+" "+s.getSal()+" "+s.getName());
	}
}

