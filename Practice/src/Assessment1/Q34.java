package Assessment1;

import java.util.Scanner;

public class Q34 {
	public static void main(String[] args) {
		//take data id,name,salary from user using scanner and display that data in show method
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter the id:");
	   int id=s.nextInt();
	   s.nextLine();
	   System.out.println("enter the name:");
	    String name=s.nextLine();
	  
	    System.out.println("enter the sal:");
	    double sal=s.nextDouble();
	    Q34 q= new Q34();
	    q.show(id,name,sal);
	}
	public void show(int id,String name,double sal){
		//display data here by doing required changes
		System.out.println("entered id,name and sal:"+id+" "+name +" "+sal);
	}
}

