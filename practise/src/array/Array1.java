package array;

public class Array1 
{
	public static void main(String[]args)
	{
	    int temp;
	    int arr[]={5,7,6,8,2,1,10,3,4,9};
	    
	    for(int a=0;a<arr.length;a++)
	    {
	        for(int b=a+1;b<arr.length;b++)
	        {
	            if(arr[a]>arr[b])
	            {
	                temp=arr[a];
	                arr[a]=arr[b];
	                arr[b]=temp;
	            }
	        }
	    }
	    System.out.println(arr[7]);
    }
}
