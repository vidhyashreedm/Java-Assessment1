package servletEx;

import java.util.Objects;
public class Employee {
private int age;
private String name;
private int salary;
	public Employee(String name, int age, int salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}

	public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSal(int salary) {
	this.salary = salary;
}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary);
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
		return age == other.age && Objects.equals(name, other.name) && salary == other.salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

