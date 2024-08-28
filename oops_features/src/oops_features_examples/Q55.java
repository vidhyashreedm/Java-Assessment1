package oops_features_examples;
// Create two employee objects with same data and compare two object(data)
public class Q55 {

	public static void main(String[] args) {
		Employee e1=new Employee(101,"sam",1000);
		Employee e2=new Employee(101,"sam",1000);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);//false
		System.out.println(e1.getId()==e2.getId());//true
		System.out.println(e1.getSal()==e2.getSal());//true
		System.out.println(e1.getName()==e2.getName());//true
		
		

	}

}
