package inheritance_2;

public class Multi_Level_Inheritance5 
{
	public static void main(String[]args)
	{
		System.out.println("Multi level inheritance start execution");
		Son_Class2.married();
		Son_Class2 ICML=new Son_Class2();
		ICML.animals();
		Son_Class2.house();
		ICML.land();
		Son_Class2.bike();
		ICML.mobile();
		System.out.println("Multi level inheritance end execution");
		
		
		Parent_Class1 ICSL=new Parent_Class1();
		ICSL.land();
		Parent_Class1.house();
		ICSL.animals();
		Parent_Class1.married();
	}

}
