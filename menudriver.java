/*calculate volume of cylinder
perimeter of rectangle 
area of rectangle using switch case*/

import java.io.*;


class menudriver
{
public static void main(String args[])throws IOException
{
	int ch=0;
	int r=0;
	int h=0;
	int l=0;
	int b=0;
	final float pi=3.14f;
	float volume=0,area=0,perimeter=0;
	
while(true)
{
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	
System.out.println("*****MENU******");
System.out.println("1.volume of cylinder");
System.out.println("2.area of rectangle");
System.out.println("3.perimeter of rectangle");
System.out.println("4.exit");

System.out.print("enter your choice->");
ch=Integer.parseInt(br.readLine());

switch(ch)
{
case 1:
	System.out.println("enter radius and height of cylinder");
	r=Integer.parseInt(br.readLine());
	h=Integer.parseInt(br.readLine());
	volume=pi*r*r*h;
	System.out.println("volume of cylinder is="+volume);
	break;

case 2:
	System.out.println("enter length and breadth of rectangle");
	l=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	area=l*b;
	System.out.println("area of rectangle is="+area);
	break;

case 3:
	System.out.println("enter length and breadth of rectangle");
	l=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	perimeter=2*l+b;
	System.out.println("perimeter of rectangle is="+perimeter);
	break;

case 4:
	return;	
	
}

}
}
}