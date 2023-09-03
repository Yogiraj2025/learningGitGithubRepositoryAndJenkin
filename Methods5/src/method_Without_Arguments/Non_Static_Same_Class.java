package method_Without_Arguments;

public class Non_Static_Same_Class 
{
	public static void main(String[]args)
	{
		Static_Same_Class_Extra.m1();
		System.out.println("main method start execution");
		Non_Static_Same_Class x=new Non_Static_Same_Class();//Object creation
		                                                    //classname object_reference variable=new classname()
		x.m1();                                             //object reference variable.method name();
		x.m2();
		Non_Static_Same_Class y=new Non_Static_Same_Class();
		y.m3();
		System.out.println("main method end execution");
	}
	public void m1()
	{
		System.out.println("m1 start");
		System.out.println("m1 processing");
		System.out.println("m1 end");
	}
	public void m2()
	{
		System.out.println("m2 start");
		System.out.println("m2 processing");
		System.out.println("m2 end");
	}
	public void m3()
	{
		System.out.println("m3 start");
		System.out.println("m3 processing");
		System.out.println("m3 end");
	}

}
