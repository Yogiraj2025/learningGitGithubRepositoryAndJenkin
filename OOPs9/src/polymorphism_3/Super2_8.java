package polymorphism_3;

public class Super2_8 extends Super1_7
{
	int a=30;
	
	public void m2()
	{
		int a=40;
		
		System.out.println("local of m2:"+a);
		System.out.println("global of Super2:"+this.a);  //this for same class global variable access
		System.out.println("global of Super1:"+super.a);  //super for diff. class global variable access
	}


}
