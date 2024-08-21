package Assessment1;

public class Q35 {
	static int total = 0;

	public static void add() {  
		int total = 10 + 30;
	}

	public static void main(String[] args) {
		Q35.add();
		System.out.println(total); //0
	}
}

