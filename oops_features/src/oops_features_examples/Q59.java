package oops_features_examples;

 public class Q59 {

	public static void main(String[] args) {
	Employee e=new Employee(100,"Sam",1000);
	System.out.println(e.hashCode());
	e=null;
	System.gc();//calling garbage collector explicitly
	System.out.println("garbage collection");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("calling finalize method to dispose system resources, perform clean-up activities and minimize memory leaks");
		
	}

}
