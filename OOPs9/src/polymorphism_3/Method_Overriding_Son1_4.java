package polymorphism_3;

public class Method_Overriding_Son1_4 extends Method_Overriding_Father3
{
	public void land()
	{
		System.out.println("son1 got half of land.");
	}
	public static void money()  // no overriding,representing this directly
	{
		System.out.println("son1 got half of 50 lakh rupees.");
	}

}
