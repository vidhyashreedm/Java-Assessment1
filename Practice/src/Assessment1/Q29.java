package Assessment1;


public class Q29 {
	public static float m1(int i){
		System.out.println("m1 called"); //m1 called
		return i*i;
	}
	public static void main(String[] args) {
		//call m1 method and pass some number
		int total = (int) (100 + m1(2));
		System.out.println(total); //104
}
}



