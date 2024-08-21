package Assessment1;


public class Q21 {
	public static void m1(Employee e){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee e=new Employee();
		m1(e);
		Q21.m1(e);
		
	}
}

