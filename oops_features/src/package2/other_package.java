package package2;

import oops_features_examples.protection;

public class other_package {
 other_package()
 {
	System.out.println("other package constructor"); 
	protection p1=new protection();
	//System.out.println("n="+p1.n);//error
	//System.out.println("n_pri="+p1.n_pri); //error
	//System.out.println("n_pro="+p1.n_pro); //error
	System.out.println("n_pub="+p1.n_pub);
	
 }
}
