package array_2D;

import java.util.Scanner;

public class Taking_Input 
{

	public static void main(String[] args) 
	{
		
       Scanner obj=new Scanner(System.in);
       int num[][]=new int[3][4];
       System.out.println("Enter values in array: ");
       for(int i=0;i<num.length;i++)
       {
    	   for(int j=0;j<num[0].length;j++)
    	   {
    		   num[i][j]=obj.nextInt();
    	   }
       }
       
       System.out.println("you have Enter values in array: ");
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