package polymorphism_3;

public class This6 
{
    int a=10;
    int b=20;
    static int c=30;
    
    public void m1()
    {
    	int a=40;
    	int b=50;
    	int c=60;
    	System.out.println(a);
    	System.out.println(b);
    	System.out.println(c);
    	System.out.println(this.a);  //this keyword is used to access global variable in the same class
    }
    
    public static void main(String[] args) 
    {
    	 This6 x=new  This6 ();
    	 x.m1();
    	 System.out.println(x.a);
 		 System.out.println(x.b);
 		 System.out.println(c);
		
	}
}
