package ltts.com;

import java.util.HashSet;
import java.util.Scanner;

public class Player_Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			hs.add(sc.next());
		}
		
		for (String s : hs) 
            System.out.println(s); 

	}

}
