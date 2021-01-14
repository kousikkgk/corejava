package corejava.oops;

class Compiletime{
	
	void add(int a,int b) {
		System.out.println("C value is= " + a+b);
	}
	
	void add(int a,int b,int c) {
		System.out.println("C value is= "+a+b+c);
	}
}
/****************************************/
class Multiply extends Runtime{
	void arithmetic(int a, int b) {
		System.out.println("Multiply= "+ a*b);
	}
}
class Addition extends Runtime{
	void arithmetic(int a,int b) {
		System.out.println("Addition= "+ a+b);
	}
}
class Runtime{
	void arithmetic(int a,int b) {
		System.out.println("Runtime= "+a+" "+b);
	}
}

public class PolymorphismMain {
	public static void main(String[] args) {
		System.out.println("-----------------------------");
		Compiletime compile=new Compiletime();
		compile.add(5, 8);
		compile.add(10,20, 30);
		System.out.println("-----------------------------");
		Runtime run=new Multiply();
		run.arithmetic(10, 20);
		System.out.println("-----------------------------");
		Runtime run1=new Addition();
		run1.arithmetic(10, 20);
	}
}
