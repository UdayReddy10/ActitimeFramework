package pac;

public class Reverse {
	public static void main(String args[])
	{
	int num=12521;
	int rem=0;
	int sum=0;
	int temp=num;
	while(num>0)
	{
	rem=num%10;
	sum=sum+rem;
	num=num/10;
	}
	System.out.println(sum);
	}	
}
