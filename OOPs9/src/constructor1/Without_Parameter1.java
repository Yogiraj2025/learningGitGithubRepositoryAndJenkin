package constructor1;

public class Without_Parameter1 
{
    int roll_no;
    String name;
	public Without_Parameter1()     //no need of access specifier public; assume directly public. 
	{
		System.out.println("call to constructor");
	    roll_no=25;
	    name="Yogesh";
	}
	public void Student_info()
	{
		System.out.println(name);
		System.out.println(roll_no);
	}
	
	

}
