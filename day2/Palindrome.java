package week1.day2;

public class Palindrome 
{
	public static void main(String[] args)
	{
		int num = 34343;
		int temp = 0;
		for(int i = num;i>0;i--)
		{
			int remainder;
			remainder = num%10;
			temp = (temp*10)+remainder;
			num = num/10;
			
		}
		if(temp == num)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	
}
