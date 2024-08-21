package Assessment1;

public class Q18 {
	public static void m1(int a){
		System.out.println(a);
	}
	public static void main(String[] args) {
		//call m1 method from here
		m1(10);
		Q18.m1(20); //recommended method
		Q18 q= new Q18();
		q.m1(30);
	}
}

