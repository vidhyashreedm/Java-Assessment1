package Assessment1;

public class Q27 {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		m1(2);
		System.out.println(m1(2));
	}
}
