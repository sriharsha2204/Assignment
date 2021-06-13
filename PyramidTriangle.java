import java.util.*;

public class PyramidTriangle{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
                int i=0;
		while(i<n)
		{
			int j=0;
			while(j<(i+1))
			{
				System.out.print("*");
				System.out.print(" ");
				j++;
			}
			System.out.println(" ");
			i++;
		}

	}

}