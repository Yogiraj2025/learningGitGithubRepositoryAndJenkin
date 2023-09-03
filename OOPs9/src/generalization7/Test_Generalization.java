package generalization7;

public class Test_Generalization 
{
	public static void main(String[] args) 
	{
		System.out.println("jio sim feature");
		Jio j=new Jio();
		j.sms();
		j.internet();
		j.audiocalling();
		j.videocalling();
		j.newFeatureA();
		
		System.out.println("Airtel sim feature");
		Airtel a=new Airtel();
		a.sms();
		a.internet();
		a.audiocalling();
		a.videocalling();
		a.newFeatureB();
		
		System.out.println("jio sim feature");
		Vodafone v=new Vodafone();
		v.sms();
		v.internet();
		v.audiocalling();
		v.videocalling();
		v.newFeatureC();
		
	}

}
