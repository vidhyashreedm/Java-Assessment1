package Assessment1;

public class Q23 {
	public static void m1(Object o){
		System.out.println("m1 method");
	}
	public static void main(String[] args) {
		//call m1 method from here
		Object o=new Object();
		m1(o);
		Q23.m1(o);
		
	}
}
