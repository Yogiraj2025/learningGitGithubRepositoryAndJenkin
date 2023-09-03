package method_Without_Arguments;

public class All_In_One_Regular_Methods 
{
	public static void main(String[]args)
	{
		System.out.println("main method start execution");
		m1();
		m1();
		
		Regular_Workspace.m2();
		
		All_In_One_Regular_Methods x=new All_In_One_Regular_Methods();
		x.m3();
		
		Regular_Workspace y=new Regular_Workspace();
		y.m4();
		
	}
	public static void m1()
	{
		int a=25;
		
		System.out.println("m1 start");
		System.out.println("a:"+a);
		System.out.println("m1 end");
	}
	public void m3()
	{
		System.out.println("m3 start");
		System.out.println("m3 proceed");
		System.out.println("m3 end");
	}

}
