package block_Types;

public class A 
{

	static
	{
		{
			System.out.println("Local block");
		}
		System.out.println("static block A is called");
	}
	
	A()
	{
		System.out.println("constructor A is called");
	}
	
	public static void main(String[] args) {
		
	}

}
