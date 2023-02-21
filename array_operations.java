import java.io.*;

class Array_operation_2D
{
public void TransposeMatrix()
{
	
	
		int i,j;
		int a [][] = new int [3][3];
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter First Array Elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Transpose Matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(" "+a[j][i]);
			}
			System.out.println(" ");
		}
}
	

	
public void addition()
{
	public static void main(String args[]) throws IOException
	{
		int i,j;
		int a [][] = new int [3][3];
		int b [][] = new int [3][3];
		int c [][] = new int [3][3];
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter First Array Elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Enter second Array Elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Transpose Matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(" "+c[i][j]);
			}
			System.out.println();
		}
	}
		
}

public void multiplication()
{
	
	
		int i,j;
		int a [][] = new int [3][3];
		int b [][] = new int [3][3];
		int c [][] = new int [3][3];
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.println("Enter First Array Elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Enter second Array Elements: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				b[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
		System.out.println("Transpose Matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
				System.out.println(" "+c[i][j]);
			}
			System.out.println();
		}
		
}


}

class array_operations
{
public static void main(String args[])throws IOException
{
	
Array_operation_2D obj=new Array_operation_2D();	
while(true)
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
System.out.println("*****MENU******");
System.out.println("1.addition");
System.out.println("2.multiplication");
System.out.println("3.transpose");
System.out.println("4.exit");

System.out.print("enter your choice->");
ch=Integer.parseInt(br.readLine());

switch(ch)
{
case 1:
	obj. addition();
	break;

case 2:
	obj.multiplication();
	break;

case 3:
	obj. TransposeMatrix();
	break;

case 4:
	return;	
	
}

}
}
}