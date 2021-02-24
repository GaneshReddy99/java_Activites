import java.util.Scanner;
class Arithmetic
{
	public static void main(String [] args)	
{
	int x,y,n;
	Scanner sc= new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	n=sc.nextInt();
	int k=Arithmetic_Operation(x,y,n);
	if(k==-1)
	{
	System.out.println("Invalid input");
	}
	else
	{
		System.out.println(k);
	}
}
	static int Arithmetic_Operation(int x,int y,int n)
	{
	int a=0; 
	if((x>=32767 || x<0) || (y>=32767 || y<0) || (n>4 || n<0))
	{
		a=-1;
	}
	else
	{
		switch(n)
		{
		case 1:
			a=x+y;
			
			break;
		case 2:
			a=x-y;
			
			break;
		case 3:
			a=x*y;
			
			break;
		case 4:
			a=x/y;
			break;
		}
		
	}
	return a;
	}
}