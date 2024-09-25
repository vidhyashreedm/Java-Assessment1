package servletex2;

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

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

