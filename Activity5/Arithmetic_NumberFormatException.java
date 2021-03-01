package ltts.com;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arithmetic_NumberFormatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the total runs scored");
			
			int x=Integer.parseInt(br.readLine());
			System.out.println("Enter the total overs faced");
			int y=Integer.parseInt(br.readLine());
			float z=x/y;
			System.out.println("Current Run Rate :"+z);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}
