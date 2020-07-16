package array_2D;

public class Initilization
{

	public static void main(String[] args)
	{

		int num[][]=new int[3][4];
		num[0][0]=11;
		num[0][1]=22;
		num[0][2]=33;
		num[0][3]=44;
		num[1][0]=55;
		num[1][1]=66;
		num[1][2]=77;
		num[1][3]=88;
		num[2][0]=10;
		num[2][1]=20;
		num[2][2]=30;
		num[2][3]=40;
		
		System.out.println("num[0][1] = "+num[0][1]);
		System.out.println("num[2][3] = "+num[2][3]);
		
	/*	for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num[0].length;j++)
			{
				System.out.println("num["+i+"]["+j+"] = "+num[i][j]);
			}
		}*/
	}

}
