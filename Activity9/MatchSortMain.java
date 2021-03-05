import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.text.ParseException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;



public class MatchSortMain {





	public static void main(String[] args) throws ParseException, IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Match> al=new ArrayList<Match>();
		System.out.println("Enter the number of matches");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter match date in dd/mm/yyyy");
			String str1=br.readLine();
			 
			System.out.println("Enter Team: 1");
			String str2=br.readLine();
			System.out.println("Enter Team :2");
			String str3=br.readLine();
			
			al.add(new Match(str1,str2,str3));
		}
		Collections.sort(al);
		for(Match m:al)
		{
			System.out.println(m.getTeam1());
			System.out.println(m.getTeam2());
			System.out.println(m.getMatchDate());
		}
		

	}

	

}
