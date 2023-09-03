package abstraction_4;

public interface I_4 
{
	/*
	I_4()  // interfaces can't have constructors.
	{
		
	}
	*/
	int a=10;  //static/final/public
	
	void m1();  //abstract/public
	
	void m2();
	
	
    static void m10()  //since java 8 static and default methods introduced.
	{
	    System.out.println("static method");
	}
    
    default void m20()
    {
    	System.out.println("Default method");
    }
	
	/*
	private void m30()  //sine java 9 private method introduced.
	{
		
	}
	*/

}
