import java.util.*;
class CreditCard
{
	public static void main(String [] arg)
	{
		Scanner sc = new Scanner(System.in);
		double charges=0,pb=0;
		
		System.out.println("Enter the total charges");
		charges=sc.nextDouble();
		
		if(charges<=500)
		{
			pb=(charges/100)*0.25;
		}
		else
		{
			pb=(500/100)*0.25;
			charges=charges-500;
			if(charges<=1000)
			{
				pb=pb+(charges/100)*0.50;
			}
			else
			{
				pb=pb+(1000/100)*0.50;
				charges=charges-1000;
				
				if(charges<=1000)
				{
					pb=pb+(charges/100)*0.75;
				}
				else
				{
					pb=pb+(1000/100)*0.75;
					charges=charges-1000;
				
					if(charges>=1)
					{
						pb=pb+(charges/100)*1.0;
					}
				}
			}
		}
			
		System.out.println("Your Payback Amount is = "+pb);
	}
}