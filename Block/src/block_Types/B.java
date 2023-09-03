package block_Types;

public class B extends A
{
	
	static
	{
		System.out.println("static block B is called");
	}
	
	B()
	{
		System.out.println("constructor B is called");
	}
	
	{
		{
			System.out.println("Local block");
		}
		System.out.println("Instance Initializer block");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		B obj=new B();
		System.out.println("Main method ended");
		
	}

}
