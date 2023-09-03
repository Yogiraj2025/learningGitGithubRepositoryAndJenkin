package method_Without_Arguments;

public class Static_Same_Class
{
public static void main(String[]args)

{
	System.out.println("main method execution started");
	m1();//calling static same class method in main method
	m2();
	m3();
	System.out.println("main method execution completed");
	
}
public static void m1()
{
	System.out.println("m1 executing");
}
public static void m2()
{
	System.out.println("m2 executing");
}
public static void m3()
{
	System.out.println("m3 executing");
	System.out.println("m3 executed");
}

}
