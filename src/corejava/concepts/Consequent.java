package corejava.concepts;

public class Consequent {

	public static void main(String[] args) {
		String name="Hello World";
		char [] nameRev=name.toCharArray();
		for (int i=0;i<=name.length()-1;i++) {
			
			char val = (i%2==0)?Character.toUpperCase(nameRev[i]):Character.toLowerCase(nameRev[i]);
			System.out.print(val);
		}
	}

}

