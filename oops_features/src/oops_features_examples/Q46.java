package oops_features_examples;

class Employee1 {
private int id;
private String name;
private int sal;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSal() {
	return sal;
}
public void setSal(int sal) {
	this.sal = sal;
}
public Employee1(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
}
}
public class Q46
{
public static void main(String args[])
{
     Employee1 e=new Employee1(101,"sam",1000);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSal());
}
}
