package method_With_Arguments;

public class Example_Method_Arguments 
{   
	public static void main(String[]args)
	{
		System.out.println("main method start executing");
		Example_Method_Arguments A=new Example_Method_Arguments();
		A.addition(20,30);  //
		A.addition(2143,2341);
		System.out.println("main method end executing");
	}
	public void addition(int a,int b )  //
	{
		System.out.println("Addition:"+(a+b));
		System.out.println(a+b);
	}
	

}
