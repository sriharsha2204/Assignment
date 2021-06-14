import java.util.*;

public class LargeOrSmall{
	public static void largest(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
			{
				System.out.println("Largest of 3 numbers is " + x);
			}
			else
			{
				System.out.println("Largest of 3 numbers is " + z);
			}
		}
		else
		{
			if(y>z)
			{
				System.out.println("Largest of 3 numbers is " + y);
			}
			else
			{
				System.out.println("Largest of 3 numbers is " + z);
			}
		}
	}
	
	public static void smallest(int x,int y,int z)
	{
		if(x<y)
		{
			if(x<z)
			{
				System.out.println("Smallest of 3 numbers is " + x);
			}
			else
			{
				System.out.println("Smallest of 3 numbers is " + z);
			}
		}
		else
		{
			if(y<z)
			{
				System.out.println("Smallest of 3 numbers is " + y);
			}
			else
			{
				System.out.println("Smallest of 3 numbers is " + z);
			}
		}
	}	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		largest(a,b,c);
		smallest(a,b,c);		

	}

}