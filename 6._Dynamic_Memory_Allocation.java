package array_2D;

import java.util.Scanner;

public class Dynamic_Memory_Allocation
{

	public static void main(String[] args)
	{

		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number of Rows in Array: ");
		  int m=obj.nextInt();
		System.out.println("Enter number of Columns in Array: ");
		  int n=obj.nextInt();
		
		int num[][]=new int[m][n];
		
		System.out.println("Enter elements in Array: ");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{
				num[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("You enter elements in Array: ");
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{
				System.out.print(num[i][j]+" ");
			}
		}
		
		obj.close();
	}

}
