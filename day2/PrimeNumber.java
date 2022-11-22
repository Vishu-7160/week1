package week1.day2;

public class PrimeNumber 
{
	
		public static void main(String[] args) 
		{
			int a = 15;
			boolean flag = false;
			
			for (int i = 2;i<=a/2;i++)
			{
				
				int n;
				n = a%i;
				if(n==0) 
				{
					flag = true;
				}
				
				break;
				
			}

				if(flag == true)
				{
					System.out.println("Prime");
				}
				else
				{
					System.out.println("Not a Prime");
				}
			


	   }

	}


