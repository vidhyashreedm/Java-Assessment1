package Assessment1;

public class Q7Employee 
{
	private int id;
	private String name;
	private int sal;
	
	Q7Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	public static void main(String[] args) {
		//here create two objects of Employee class and add  data into that
		//call show method and pass this two objects to show method
		Q7Employee e1=new Q7Employee(101,"sam",1000);
		Q7Employee e2=new Q7Employee(102,"ram",1001);
		System.out.println("employee 1 details:");
		Q7Employee.show(e1);
		System.out.println("employee 2 details:");
		Q7Employee.show(e2);
	}
	public static void show(Q7Employee e){
		//do required changes to show method and display that data here
		System.out.println("id:"+e.id);
		System.out.println("name:"+e.name);
		System.out.println("sal:"+e.sal);
	}

}
