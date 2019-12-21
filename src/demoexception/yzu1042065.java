package demoexception;

public class yzu1042065 {

	public static void main(String[] args) 
	{
		demoo d=new demoo();
		float a=1;
		float b=2;
		float c=1;
		try {
			System.out.println("solution 1:"+d.solution(a,b,c)[0]+"|solution 2:"+d.solution(a,b,c)[1]);	
		}
		catch(nosexception e) {
			System.out.println(e.getMessage());
		}
		catch(oneexception e) {
			System.out.println(e.getMessage());
		}	
	}
}
//b2-4ac>0 ->2解
//b2-4ac=0 ->1解
//b2-4ac<0 ->無解
class demoo{
	float[] solution(float a,float b,float c) throws nosexception, oneexception 
	{
		if(Math.pow(b,2)-4*a*c>0) 
		{	
			float s1=(float) ((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
			float s2=(float) ((b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
			float[] s= {s1,s2};
			return s;
		}
		else if(Math.pow(b,2)-4*a*c==0)
		{
			float s=(float) ((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
			throw new oneexception("solution is"+s);
		}
		else throw new nosexception();
	}	
}
class oneexception extends Exception
{
	public oneexception() {
		super();
	}
	public oneexception(String message) {
		super(message);
	}	
}
class nosexception extends Exception
{
	public nosexception() {
		super("no solution");
	}
	public nosexception(String message) {
		super(message);
	}
}
