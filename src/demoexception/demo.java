package demoexception;

public class demo 
{

	public static void main(String[] args) 
	{
		demo1 d=new demo1();
		int a=4;
		int b=0;
		try {
			System.out.println(d.div(a, b));
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		finally {
		System.out.println("the end");	
		}
	}

}

class demo1
{
	int div(int a,int b) 
	{
		return a/b;
	}
}
