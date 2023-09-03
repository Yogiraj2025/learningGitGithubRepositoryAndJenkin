package method_Without_Arguments;

public class Static_Different_Class_2 
{
	public static void main(String[]args)
	{
		System.out.println("main method execution started");
		Static_Same_Class.m1();
        Static_Same_Class.m2();
        Static_Same_Class.m3();
        Static_Different_Class.m4();
        Static_Different_Class.m5();
        System.out.println("main method execution compeleted");
	}
        
}
