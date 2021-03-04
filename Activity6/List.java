package ltts.com;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the player details");
		System.out.println("Enter player name");
		al.add(sc.next());
		System.out.println("Enter age");
		al.add(sc.nextInt());
		System.out.println("Enter Country");
		al.add(sc.next());
		System.out.println("Player Details:");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Enter Skill");
		String str=sc.next();
		System.out.println("Enter the position to add the skill");
	
		al.add(sc.nextInt(),str);
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("Enter the position of the detail to be removed");
		al.remove(sc.nextInt());
		System.out.println("Player Details");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
