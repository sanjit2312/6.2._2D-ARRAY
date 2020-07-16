package array_2D;

public class Calculation_With_Array 
{

	public static void main(String[] args)
	{
		
		int num[][]=new int[3][4];
		num[0][0]=11;
		num[0][1]=22;
		num[0][2]=11+num[0][1];
		num[0][3]=num[0][2]+20;
		num[1][0]=num[0][3]+num[0][0];
		num[1][1]=77;
		num[1][2]=11+num[1][1];
		num[1][3]=num[0][2]+70;
		num[2][0]=num[1][3]+num[1][1];
		num[2][1]=99;
		num[2][2]=11+num[2][0];
		num[2][3]=num[2][1]+20;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
			   System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}

	}

}
