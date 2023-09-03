package method_With_Arguments;

public class Example_Simple 
{
	public static void main(String[]args)
	{
		System.out.println("main method start execution");
		Example_Simple z=new Example_Simple();
		z.addition();
		System.out.println("main method end execution");
	}
	public void addition()
	{
		int a=20;
		int b=30;
		System.out.println("Addition:"+(a+b));
		
		
/*	public static void addition1()//just reference point of view directly copied.
	{
		int a=200,b=300,sum;
		sum=a+b;
		System.out.println("Sum of two="+sum);
	}
*/
	}

}
