package corejava.oops;

interface Sport{
	void play();
}

class Cricket implements Sport{

	@Override
	public void play() {
		System.out.println("Playing Cricket!......");
	}
	
}

class Tennis implements Sport{

	@Override
	public void play() {
		System.out.println("Playing Tennis!......");
	}
	
}

//not override play method
abstract class SportAbst implements Sport{
	abstract void run();
}
public class AbstractionMain {
	
	public static void main(String[] args) {
		Sport cricket=new Cricket();
		cricket.play();
		
		Sport tennis=new Tennis();
		tennis.play();
	}
}
