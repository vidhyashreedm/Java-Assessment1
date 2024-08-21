package Assessment1;

public class Q5Employee {
	private int id;
	private String name;
	private int sal;
	
	Q5Employee(int id,String name,int sal)
	{
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	  public static void main(String[] args) {
		  
          //here create object of Employee class and add 101,sam,1000 data into that
	        //call show method and pass this created object to show method
		  Q5Employee e= new Q5Employee(101,"sam",1000);
		  Q5Employee.show(e);
	}
	public static void show(Q5Employee e){
		//do required changes to show method and display that data here
		System.out.println("id:"+e.id);
		System.out.println("name:"+e.name);
		System.out.println("sal:"+e.sal);
	}


}
