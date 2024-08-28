package oops_features_examples;
//Create one interface with two abstract methods and implement those methods in one class and call them.
interface example
{
	 void sum(); //by default abstract
	abstract void sub();
}

public class Q50 implements example {

	@Override
	public void sum() {
		System.out.println("perform adddition here");
		
	}

	@Override
	public void sub() {
		System.out.println("perform subtraction here");
		
	}
public static void main(String args[])
{
	Q50 q=new Q50();
	q.sum();
	q.sub();
}
}

