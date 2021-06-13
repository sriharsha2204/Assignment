import java.util.*;
public class Menu {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you wish to order?");
		System.out.println("1.Y\n2.N");
		
	        int y= sc.nextInt();
		 switch(y){
		 case 1:System.out.println("enter your choice");
		        System.out.println("Menu Display");
			System.out.println("1.Snack");
			System.out.println("2.Lunch");
			System.out.println("3.Dinner");
			System.out.println("4.Soft drink/tea/coffee");
			int y1 = sc.nextInt();
			 switch (y1){
				 case 1:
					 System.out.println("1.Idli:40rs");
					 System.out.println("2.Dosa:50rs");
					 System.out.println("3.Uttapam:30rs");
					 System.out.println("4.Poha/Upma:20rs");
					int x=sc.nextInt();
					 switch (x) {
					 case 1:
						 System.out.println("enter the quantity");
						 int n=sc.nextInt();
						 int bill= n*40;
						 System.out.println("your bill for idli is "+" "+bill);
						 break;
					 case 2:

						 System.out.println("enter the quantity");
						 int n1=sc.nextInt();
						 int bill1= n1*50;
						 System.out.println("your bill Dosa is"+" "+bill1);
						 break;
					 case 3:

						 System.out.println(" enter the quantity");
						 int n2=sc.nextInt();
						 int bill2= n2*30;
						 System.out.println("your bill Uttapam is "+" "+bill2);
						 break;
					 case 4:
						 System.out.println("enter the quantity");
						 int n3=sc.nextInt();
						 int bill3= n3*20;
						 System.out.println("your bill Poha/Upma is  "+" "+bill3);
						 break;
						 
					 }
					 break;
				
			 }
			 
		}
		 
	}

}