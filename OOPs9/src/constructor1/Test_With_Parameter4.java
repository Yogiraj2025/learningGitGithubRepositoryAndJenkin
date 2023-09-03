package constructor1;

public class Test_With_Parameter4 
{
	public static void main(String[]args)
	{
		With_Parameter3 y =new With_Parameter3();
		y.addition();
		y.multiplication();
		With_Parameter3 z=new With_Parameter3(30,30);  //provide same value to distinct object
		z.addition();
		z.multiplication();
		With_Parameter3 x=new With_Parameter3(30,50);  //provide different value to distinct object
		x.addition();
		x.multiplication();
		
	}

}
