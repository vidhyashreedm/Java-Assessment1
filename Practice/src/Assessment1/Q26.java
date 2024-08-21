package Assessment1;

public class Q26 {
	public static void m1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		//create Employee object here with 101,sam,1000 data
		//call m1 method and pass employee id as parameter
		Employee e=new Employee(101,"sam",1000);
		m1(e.getId());
		
	}
}
