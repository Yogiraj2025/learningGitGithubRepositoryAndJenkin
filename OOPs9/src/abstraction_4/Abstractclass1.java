package abstraction_4;

public abstract class Abstractclass1 
{
	Abstractclass1()  //constructor in abstract class.
	{
		System.out.println("constructor start executing");
	}
    public void m1()
	{
		System.out.println("m1 comleted in concrete class.");
	}
	
	abstract public void m3(int a,int b);  //abstract method.
	
    abstract public void m4();  //abstract method.
    
    abstract public void m5();
    
    
    
    
}   
