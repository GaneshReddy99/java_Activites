import java.util.*;
public class MatchMain {
	public static void main(String [] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the match format\r\n"
				+ "\r\n"
				+ "1. ODI\r\n"
				+ "\r\n"
				+ "2. T20\r\n"
				+ "\r\n"
				+ "3. Test");
		int x=sc.nextInt();
		System.out.println("Enter the Current score");
		int y=sc.nextInt();
		System.out.println("Enter the Current Over");
		int z=sc.nextInt();
		System.out.println("Enter the Target Score");
		int w=sc.nextInt();
		if(x==1)
		{
			ODIMatch od=new ODIMatch();
			float a=od.calculateRunRate(y,z,w);
			int b=od.calculateBalls(y,z,w);
			od.display(a,b);
		}
		else if(x==2)
		{
			T20Match t20=new T20Match();
			float a=t20.calculateRunRate(y,z,w);
			int b=t20.calculateBalls(y,z,w);
			t20.display(a,b);
		}
		else if(x==3)
		{
			TestMatch tt=new TestMatch();
			float a=tt.calculateRunRate(y,z,w);
			int b=tt.calculateBalls(y,z,w);
			tt.display(a,b);
		}
	}

}
