package Assessment1;

public class Q25 {
	public static void m1(Object o){
		//display employee data here
		System.out.println(((Employee) o).getId()+" "+ ((Employee) o).getName()+" "+((Employee) o).getSal());
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		//call m1 method by passing this Employee object
		Employee e =new Employee(101,"sam",1000);
		Object o=new Object();
		o=e;
		
		m1(o);
	}
}
