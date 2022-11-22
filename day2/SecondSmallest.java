package week1.day2;

public class SecondSmallest
{
	public static void main(String[] args)
	{
		int[] num = {23,45,67,32,89,22};
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]>num[j])
				{
					int temp;
					temp = num[i];
					num[i] = num[j];
					num[j]= temp;
					
				}
			}
			
		}
		System.out.println("Second smallest element array: "+num[1]);
	}
}
