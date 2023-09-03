package method_Without_Arguments;

public class Static_Different_Class_Extra 
{
	public static void main(String[]args)
	{
		System.out.println("main method start execution");
		Static_Same_Class_Extra.m1();
		m2();
		System.out.println("main method complete execution");
	}
	public static void m2()
	{
		double b=25364234.89;
		
		System.out.println("b:"+b);
	}

}
