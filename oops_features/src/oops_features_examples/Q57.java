package oops_features_examples;

import java.util.Objects;

// Create two employee objects and compare it’s references using == and equals
 class Employee3 {
	private int id;
	private String name;
	private int sal;

	public Employee3(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
public Employee3() {
		
	}

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
	@Override
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee3 other = (Employee3) obj;
		return id == other.id && Objects.equals(name, other.name) && sal == other.sal;
	}
	
 }
public class Q57 {
	public static void main(String args[])
	{
Employee3 e1=new Employee3(100,"sam",1000);
Employee3 e2=new Employee3(100,"sam",1000);
System.out.println(e1==e2);//flase
System.out.println(e1.equals(e2));//false,after overriding equals(),returns true
	}

 }

