package corejava.concepts;

class Animal{
	
	//1.private static instance with null intialization
	private static Animal get_instance=null;
	
	//2.PRIVATE CONSTRUCTOR
	private Animal() {
		
	}
	
	//3.create static method for get object
	public static Animal getInstance() {
		if (get_instance==null) {		
			get_instance=new Animal();
		}
		return get_instance;
	}
}
public class SingletonClass {
	
	public static void main(String[] args) {
		Animal animal1=Animal.getInstance();
		Animal animal2=Animal.getInstance();
		Animal animal3=Animal.getInstance();
		
		System.out.println(animal1);
		System.out.println(animal2);
		System.out.println(animal3);
		/*
		 * 1.private static instance with null intialization
		 * 2.private constructor
		 * 3.create static method for get object
		 * */
	}

}
