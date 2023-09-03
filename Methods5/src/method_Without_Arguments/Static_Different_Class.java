package method_Without_Arguments;

public class Static_Different_Class
{
public static void main(String[]args)
{
	System.out.println("main method execution started");
	Static_Same_Class.m1();//calling static different class in main method
	Static_Same_Class.m2();
	Static_Same_Class.m3();
	m4();//calling static same class method in main method
	m5();
	System.out.println("main method execution completed");
	
}
static void m4()
{
	System.out.println("m4 executing");
}
static void m5()
{
	System.out.println("m5 executing");
}

}
