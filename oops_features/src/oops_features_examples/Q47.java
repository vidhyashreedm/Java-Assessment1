package oops_features_examples;
//Create a class which explains you inheritance concept
class A
{
	A()
	{
		System.out.println("parent class");
	}
}
class B extends A
{
	B()
	{
		System.out.println("derived class-single inheritance");
	}
}
class c extends B
{ 
	c()
	{
	System.out.println("class c derived class-multilevel");
	}
}
class D extends A
{
	D()
	{
		System.out.println("hierarchical inheritance");
	}
}
public class Q47 {
public static void main(String args[])
{
	c c1=new c();
	D d=new D();
}
}
