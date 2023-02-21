/*write a program to accept the array element and display in reverse order*/

import java.io.*;
class Reverse_array
{
public static void main(String args[]) throws IOException
{
	int i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("how many array element you want=");
int n=Integer.parseInt(br.readLine());

int a[]=new int[n];

System.out.println("enter array elements=");
for( i=0;i<n;i++)
{
a[i]=Integer.parseInt(br.readLine());
}


System.out.println(" array in reverse order=");
for( i=n;i>=0;i--)
{
System.out.println(" "+a[i]);
}

}
}


