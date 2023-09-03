package polymorphism_3;

public class Test_Super_9
{
	int a=50;
	
	public static void main(String[] args) 
	{
		int a=60;
		
		Super2_8 z=new Super2_8();
		z.m1();
		z.m2();
		System.out.println("local of main:"+a);
		//System.out.println(this.a/super.a);  //we can't use this and super in main methods
	
	}
}
