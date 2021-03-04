package ltts.com;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class List2 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		System.out.println("Enter swap positons");
		String str=sc.next();
		int n=Integer.parseInt(str);
		Collections.swap(al, 0, n);
		
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
	}

	
}
