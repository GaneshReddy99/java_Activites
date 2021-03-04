package ltts.com;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		ArrayList<Integer> al= new ArrayList<Integer>();
		int n=sc.nextInt();
		int h=0;
		int c=0;
		
		for(int i=0;i<n;i++)
		{
			al.add(sc.nextInt());
			if(al.get(i)>=50 && al.get(i)<100)
			{
				h++;
			}
			if(al.get(i)>=100)
			{
				c++;
			}
		}
		System.out.println(h);
		System.out.println(c);
		
		

	}

	

}
