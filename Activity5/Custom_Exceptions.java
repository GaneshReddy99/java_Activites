package ltts.com;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Custom_Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
		System.out.println("Enter the player name");
		String s1=br.readLine();
		System.out.println("Enter the player age");
		int x=Integer.parseInt(br.readLine());
		if(x<20)
		{
			throw new ArithmeticException("Invalide age");
		}
		else
		{
			System.out.println("Player name :"+s1
					+ "Player age :" +x);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}

}
