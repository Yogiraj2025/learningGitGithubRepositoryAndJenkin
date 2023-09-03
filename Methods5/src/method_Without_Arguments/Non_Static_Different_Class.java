package method_Without_Arguments;

public class Non_Static_Different_Class 
{
	public static void main(String[]args)
	{
		System.out.println("main method start execution");
		Non_Static_Same_Class x=new Non_Static_Same_Class();
		x.m1();
		x.m2();
		Non_Static_Same_Class y=new Non_Static_Same_Class();
		y.m3();
		System.out.println("main method end execution");
		
	}
	
	

}
