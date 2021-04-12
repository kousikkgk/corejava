package corejava.concepts;

class PrivateAndStaticMethodClass{
	private void Method1() {
		System.out.println("Method 1....");
	}
	public static void method2() {
		System.out.println("Method 2.....");
	}
}

public class PrivateorStaticmethodnotoverride extends PrivateAndStaticMethodClass  {

	public static void main(String[] args) {
		PrivateAndStaticMethodClass psmc1=new PrivateAndStaticMethodClass();
		psmc1.method2();//static method call using object
		PrivateAndStaticMethodClass.method2();//static method call using class 
	}
	private void Method1() {
		
	}
	public static void method2() {
		//Method hiding--->hide the super class method
	}
}
