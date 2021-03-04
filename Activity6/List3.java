package ltts.com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class List3 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 13");
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		al.add(sc.next());
		LinkedList<String> ll=new LinkedList<String>();
		System.out.println("Enter the top 5 scorers of IPL Season 12");
		ll.add(sc.next());
		ll.add(sc.next());
		ll.add(sc.next());
		ll.add(sc.next());
		ll.add(sc.next());
		for(int i=0;i<5;i++)
		{
			if(al.contains(ll.get(i)))
					{
						System.out.println(ll.get(i));
					}
		}
		
		
	}

}
