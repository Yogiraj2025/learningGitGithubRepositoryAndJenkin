package casting5;

public class Up_Down_Casting 
{
	public static void main(String[] args) 
	{
		Son2 ref=new Son2();  //Overriding
		ref.land();
		ref.travel();
		ref.mobile();
		System.out.println("-----------------------");
	    
		
		Parent1 ref1=new Son2();  //Up casting
		ref1.land();
		ref1.travel();
		System.out.println("-----------------------");
		
		
		//Son2 ref2=(Son2) new Parent1();  //Down casting(only explicit)
		//ref2.land();
		//ref2.travel();
		//ref2.mobile();
	}

	
}
