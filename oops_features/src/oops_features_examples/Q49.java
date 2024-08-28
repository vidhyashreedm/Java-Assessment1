package oops_features_examples;

class Test{
	void display()
	{
		System.out.println("Test display method");
	}
}
class Test1 extends Test{
	void display()
	{
		System.out.println("Test1 display method -overriding method");
	}
}
public class Q49{

	public static void main(String[] args) {
		//create one method in class Test
		//override that method in Test1 class
		//call that overridden method from here
		//to do this thing do required changes in all these three classes
		Test1 t= new Test1();
		t.display();
	}
	
}
