package array_2D;

public class Declaration_And_Initialization1 
{

	public static void main(String[] args)
	{
		
		int num[][]= {{11,22,33,44},{55,66,77,88},{10,20,30,40}};
		int mark[][];
		mark=num;
		System.out.println("num[2][1]= "+mark[2][1]);
		System.out.println("num[0][2]= "+mark[0][2]);


	}

}
