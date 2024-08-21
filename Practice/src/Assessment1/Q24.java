package Assessment1;

public class Q24 {
	public static void m1(Employee e){
		//display data here
		System.out.println(e.getId()+" "+ e.getName()+" "+e.getSal());
	}
	public static void main(String[] args) {
		//call m1 method from here
		Employee e=new Employee(101,"sam",1000);
		m1(e); //recommended 
		Q24 q=new Q24();
		q.m1(e);
	}
}
