package Assessment1;

public class Q22 {
	public static void m1(String s){
		System.out.println("s");
	}
	public static void main(String[] args) {
		//call m1 method from here
		m1("sam");
		Q22.m1("sam");
		Q22 q= new Q22();
		q.m1("sam");
	}
}
