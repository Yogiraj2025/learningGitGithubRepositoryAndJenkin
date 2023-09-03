package method_With_ReturnType;

public class Program2 
{
	public static void main(String[] args) 
	{
		
		int num1=100;
		int num2=addition(10,15);  //store if you want to use
		System.out.println(addition(num1,num2));//syso directly if you don't want to use
	   
	}
	

	public static int addition(int a, int b)//int
	{
		
		int sum=a+b;                        //int
		//System.out.println(sum);
		//return sum;                         //int
		return a;
	}
	
	

}
