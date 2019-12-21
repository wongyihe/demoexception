package demoexception;

public class demo2 {

	public static void main(String[] args) {
		Box b=new Box();
//		b.caps=2;
		try {
		b.set(-2);
		}
		catch(myexception e) 
		{
			System.out.println(e.getMessage());
		}
		catch(overexception e) 
		{
			System.out.println(e.getMessage());
		}
		catch(belowexception e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
class Box
{
	private int caps;
	void set(int c) throws myexception, belowexception, overexception 
	{
		if(c<0) throw new belowexception();
		if(c>10) throw new overexception();
		caps=c;
	}
}
class myexception extends Exception
{
	public myexception() {
		super();
	}
	public myexception(String message) {
		super(message);
	}
}
class overexception extends Exception
{
	public overexception() {
		super("over");
	}
	public overexception(String message) {
		super(message);
	}
}
class belowexception extends Exception
{
	public belowexception() {
		super("below");
	}
	public belowexception(String message) {
		super(message);
	}
}
