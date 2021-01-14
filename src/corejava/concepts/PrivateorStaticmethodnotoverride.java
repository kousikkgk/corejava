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
		
	}
	private void Method1() {
		
	}
	public static void method2() {
		//Method hiding--->hide the super class method
	}
}
