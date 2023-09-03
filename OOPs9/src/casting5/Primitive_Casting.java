package casting5;

public class Primitive_Casting 
{
	public static void main(String[] args) 
	{
		int a=10;
		System.out.println(a);
		double b=a;  //implicit casting
		System.out.println(b);
		System.out.println("-----------------");
		
		double c=2.5f;
		System.out.println(c);
		int d= (int) c;  //explicit casting
		System.out.println(d);
	}

}
