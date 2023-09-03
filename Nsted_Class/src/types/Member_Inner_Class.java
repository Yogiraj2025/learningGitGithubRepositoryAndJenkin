package types;

public class Member_Inner_Class 
{
	private int marks=25;
	
	class Inner
	{
		public void m1()
		{
			System.out.println("Yogesh:"+marks);
		}
	}
	
	public static void main(String[] args) 
	{
		Member_Inner_Class obj1=new Member_Inner_Class();
		Member_Inner_Class.Inner obj2=obj1.new Inner();
		obj2.m1();
		
	}

}
