package ltts.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InvalidException extends Exception
{
	InvalidException(String s){  
		  super(s);  
		 }  
}

public class TeamNameNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String[] str= {"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kings XI Punjab","Kolkata Knight Riders","Mumbai Indians","Rajasthan Royals","Royal Challengers Bangalore"};
		try {
			System.out.println("Enter the expected winner team of IPL Season 13");
			String str2= br.readLine();
			
			int temp1=0;
			for(int i=0;i<str.length;i++)
			{
				if(str[i].equals(str2))
				{
					temp1=1;
				}
			}
			if(temp1==0)
			{
				throw new InvalidException("TeamNotFound");
			}
			System.out.println("Enter the expected runner Team of IPL Season 13");
			String str3=br.readLine();
			int temp2=0;
			for(int i=0;i<str.length;i++)
			{
				if(str[i].equals(str3))
				{
					temp2=1;
				}
			}
			if(temp2==0)
			{
				throw new InvalidException("TeamNotFound");
			}
			System.out.println("Expected IPL Season 13 winner:"+str2+"Expected IPL Season 13 winner: Delhi Capitals\r\n"
					+ "\r\n"
					+ "Expected IPL Season 13 runner:"+str3);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
