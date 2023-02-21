/* que---> check no is armstrong,palindrome,evenodd*/

import java.io.*;


class menudriver2
{
public static void main(String args[])throws IOException
{
	int ch=0,num=0,o_num=0,rem=0,rev=0,sum=0,digit=0;
	
	
while(true)
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
System.out.println("*****MENU******");
System.out.println("1.armstrong number");
System.out.println("2.area of palindrome number");
System.out.println("3.even odd number");
System.out.println("4.exit");

System.out.print("enter your choice->");
ch=Integer.parseInt(br.readLine());

switch(ch)
{
case 1:
	System.out.println("enter any number for checking armstrong or not=");
	num=Integer.parseInt(br.readLine());
	o_num=num;
	while(num>0)
	{
		digit=num%10;
		sum=sum+(digit*digit*digit);
		num=num/10;
	
	}
	if(sum==o_num)
	{
		System.out.println(" number is armstrong ");
	}
	else
	{
		System.out.println(" number is not armstrong ");
	}
	break;

case 2:
	System.out.println("enter any number for checking armstrong or not=");
	num=Integer.parseInt(br.readLine());
	o_num=num;
	while(num>0)
	{
		rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
	
	}
	if(rev==o_num)
	{
		System.out.println("number is palindrome ");
	}
	else
	{
		System.out.println("number is  not palindrome ");
	}
	break;



case 3:
	System.out.println("enter any number=");
	num=Integer.parseInt(br.readLine());
	if(num%2==0)
	{
		System.out.println("number is even");
	}
	else
	{
		System.out.println("number is odd");
	}
	
	break;

case 4:
	return;	
	
}

}
}
}