package corejava.concepts;

import java.io.Serializable;

class CloneClass implements Cloneable{
	int a=5;
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}
	@Override
	public String toString() {
		return "CloneClass [a=" + a + "]";
	}  
	
}
class SerializeClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int b=5;
}
public class MarkerInterface {

	public static void main(String[] args) {
		CloneClass obj1=new CloneClass();
		System.out.println(obj1.toString());
		try {
			CloneClass obj2=(CloneClass) obj1.clone();
			System.out.println(obj2.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
