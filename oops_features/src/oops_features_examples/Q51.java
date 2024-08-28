package oops_features_examples;
interface SimCard{
    void sms();
    void call();
}
class Tests implements SimCard {

	@Override
	public void sms() {
		System.out.println("write SMS");
		
	}

	@Override
	public void call() {
		System.out.println("make a call");
		
	}

}
 	
public class Q51 {

	public static void main(String[] args) {
		//implement SimCard in Test class and override methods
		//call those methods from here
      Tests t=new Tests();
      t.sms();
      t.call();

	}

}
