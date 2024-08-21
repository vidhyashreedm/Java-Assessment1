package Assessment1;

public class Q16 {
	public static void m1(){
		System.out.println("a");
	}
	public static void main(String[] args) {
		//call m1 method from here
		m1();
		Q16.m1();
		Q16 q=new Q16();
		q.m1();
		
	}
}

