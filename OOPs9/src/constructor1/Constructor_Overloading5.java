package constructor1;

public class Constructor_Overloading5 
{
	int a;
	int b;
	
	Constructor_Overloading5()
	{
		a=10;
	}
	Constructor_Overloading5(int c)
	{
		a=c;
	}
	Constructor_Overloading5(int d, int e)
	{
		a=d;
		b=e;
	}
	public  void show()
	{
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	
	
}
	


