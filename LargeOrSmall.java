import java.util.*;

public class LargeOrSmall{
	public static void largest(int x,int y,int z)
	{
		if(x>y)
		{
			if(x>z)
			{
				System.out.println(x+" is largest");
			}
			else
			{
				System.out.println(z+" is largest");
			}
		}
		else
		{
			if(y>z)
			{
				System.out.println(y+" is largest");
			}
			else
			{
				System.out.println(z+" is largest");
			}
		}
	}
	
	public static void smallest(int x,int y,int z)
	{
		if(x<y)
		{
			if(x<z)
			{
				System.out.println(x+" is smallest");
			}
			else
			{
				System.out.println(z+" is smallest");
			}
		}
		else
		{
			if(y<z)
			{
				System.out.println(y+" is smallest");
			}
			else
			{
				System.out.println(z+" is smallest");
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