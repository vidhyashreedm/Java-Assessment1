package oops_features_examples;
//Create two product class objects and compare its data
public class Q56 {
public static void main(String args[])
{
	product p1=new product(1,"product y",100.0,10);
	product p2=new product(2,"product z",1000.0,20);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p1==p2);
	System.out.println(p1.getId()==p2.getId());
	System.out.println(p1.getName()==p2.getName());
	System.out.println(p1.getPrice()==p2.getPrice());
	System.out.println(p1.getQuantity()==p2.getQuantity());
}
}
