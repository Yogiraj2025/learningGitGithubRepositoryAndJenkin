package polymorphism_3;

public class Test_Method_Overloading2 
{
	public static void main(String[]args)
	{
		Method_Overloading1 mo=new Method_Overloading1();
		mo.addition(10, 10);
		mo.addition(10, 10, 10);
		mo.addition(0, 0);
		mo.addition(0, 0);
		mo.addition(10, 10.10f);
		mo.addition(10, 10.10);
		mo.addition(10, 'y');
		mo.addition(10, "  Yogesh");
		mo.addition("Yogesh", " + Mahesh");
	}

}
