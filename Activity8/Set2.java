package ltts.com;

import java.util.HashSet;
import java.util.Scanner;

public class Hash_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<String> hs=new HashSet<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			hs.add(sc.next());
		}
		System.out.println(hs.size());
		

	}

}
