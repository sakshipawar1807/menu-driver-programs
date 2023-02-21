// Write a menu driven program to perform the following operations on multidimensional array
// ie matrices 

import java.util.*;
import java.io.*;
class multidimenssionalArray
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rows:");
	int row=sc.nextInt();
	System.out.println("enter columns:");
	int column=sc.nextInt();
	int arr1[][]=new int[row][column];
	int arr2[][]=new int[row][column];
	System.out.println("enter first array element:");
	int i,j;
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			arr1[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("first matrix array:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			System.out.println(" "+arr1[i][j]);
		}
	}
	
	System.out.println("enter second array element:");
	
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			arr2[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("second matrix array:");
	for(i=0;i<row;i++)
	{
		for(j=0;j<column;j++)
		{
			System.out.println(" "+arr2[i][j]);
		}
	}
	
	System.out.println("which operation you want to perform:");
	System.out.println("1.addition");
	System.out.println("2.multiplication");
	System.out.println("3.exit");
	
	int choice;
	System.out.println("enter your choice:");
	choice=sc.nextInt();
	
	switch(choice)
	{
		case 1:
		int add[][]=new int[row][column];
		System.out.println("after addition matrix is:");
		for(i=0;i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					
					add[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			System.out.println("addition is:"+add[i][j]);
	        break;
			
		case 2:
		int mul[][]=new int[row][column];
		
		System.out.println("after multiplication matrix is:");
		for(i=0;i<row;i++)
			{
				for(j=0;j<column;j++)
				{
					
				mul[i][j]=arr1[i][j]*arr2[i][j];
				}
			}
			System.out.println("multiplication is:"+mul[i][j]);
	        break;
			
			case 3:
			return ;
		
		
	}
		
}		
}
