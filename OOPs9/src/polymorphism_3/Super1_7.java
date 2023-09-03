package polymorphism_3;

public class Super1_7 
{
	int a=10;
	
	public void m1()
	{
		int a=20;
		System.out.println("local of m1:"+a);
		System.out.println("global of Super1:"+this.a);  //this
	}

}
