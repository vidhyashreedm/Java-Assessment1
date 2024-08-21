package Assessment1;

class Test1 {
	public static void show(){
		System.out.println("Hello world");
	}
}

public class Q15 {
	public static void main(String[] args) {
		//call show method of Test class from here
		Test1.show();
		Test1 t=new Test1();
		t.show();
	}
}
