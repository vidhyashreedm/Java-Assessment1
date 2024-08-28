package oops_features_examples;

public class same_package {
  public same_package()
{
	  System.out.println("same_package constructor");
	  protection p=new protection();
	  System.out.println("n="+p.n);
		//System.out.println("n_pri="+p.n_pri); error
		System.out.println("n_pro="+p.n_pro);
		System.out.println("n_pub="+p.n_pub);
}
}
