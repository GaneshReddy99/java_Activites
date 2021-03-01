package ltts.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayIndexOutOfBounds_NegativeSizeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number of overs");
			int x=Integer.parseInt(br.readLine());
			int [] arr=new int[x];
			for(int i=0;i<x;i++)
			{
				arr[i]=Integer.parseInt(br.readLine());
				
			}
			System.out.println("Enter the over number");
			int y=Integer.parseInt(br.readLine());
			System.out.println(arr[y]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
