package mypractice;

import java.util.Objects;

public class Employee {
private int id;
private String name;
private int sal;
	public Employee(int id, String name, int sal) {
	super();
	this.id = id;
	this.name = name;
	this.sal = sal;
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

	public Employee() {
		// TODO Auto-generated constructor stub
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
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name) && sal == other.sal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
