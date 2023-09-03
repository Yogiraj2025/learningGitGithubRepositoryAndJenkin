package abstraction_4;

public class Multiple_Inheritance8 implements I_4,I_7
{
	int a=20;
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2()
	{
		System.out.println("m2");
	}
	
	public void m3()
	{
		System.out.println("m3");
	}
	
	public void m4()
	{
		System.out.println("m4");
		System.out.println(this.a);
	}
	
	static void m10()  //since java 8 static and default methods introduced.
	{
	    System.out.println("static method 2");
	}
	
	public void m20()
    {
    	System.out.println("Default method 2");
    }

}
