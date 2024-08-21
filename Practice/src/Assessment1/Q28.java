package Assessment1;

public class Q28 {
	public static int m1(int i){
		System.out.println("m1 called");
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int total = 100 + m1(2);
		System.out.println(total);
	}
}

