package polymorphism_3;

public class Method_Overloading1 
{
	public void addition(int a,int b)
	{
		System.out.println("addition of 2 no:"+(a+b));
	}
	
  /*
    public void addition(int a,int b)
    {
    	
    }
  */
	
	
	public void addition(int a,int b,int c)
	{
		System.out.println("addition of 3 no:"+(a+b+c));
	}
	public void addition(long a,char b)
	{
		System.out.println("addition of 2 no:"+(a+b));
	}
	
	public void addition(char a,long b)
	{
		System.out.println("addition of 2 no:"+(a+b));
	}
	
	public void addition(int a,float b)
	{
		System.out.println("addition of 2 no:"+(a+b));
	}
	public void addition(int a,double b)
	{
		System.out.println("addition of 2 no:"+(a+b));
	}
	public void addition(int a,char b)
	{
		System.out.println("addition of 2 no:"+(a+b));
	}
	public void addition(int a,String b)
	{
		System.out.println("addition of 2 no:"+(a+b));
		
	}
	public void addition(String str1,String str2)
	{
		System.out.println("addition of 2 name:"+(str1+str2));
	}
	public static void main(String[] args) 
	{
		
		System.out.println("a");
	}
	public static void main(String args) 
	{
		
		System.out.println("b");
	}

}
