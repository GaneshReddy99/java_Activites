import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String,Wicket> hm = new HashMap<>();
		int val = 1;
		while(val!=0)
		{
			System.out.println("Enter Player Name: ");
			String name = sc.next();
			System.out.println("Enter Wickets separated by |");
			String wickets = sc.next();
			hm.put(name, new Wicket(wickets,new Bowler(name)));
			System.out.println("Do you want to add Player: ");
			String val1 = sc.next();
			if(val1.equals("no"))
			{
				val=0;
			}
		}
		int c = 1;
		while(c==1)
		{
			System.out.println("Enter Player to Search: ");
			String player = sc.next();
			if(hm.containsKey(player))
			{
				hm.get(player).display();
				System.out.println("Enter Player to Search: ");
				String player1 = sc.next();
				if(player1.equals("no"))
				{
					c=0;
				}
			}
			else
			{
				System.out.println("Invalid");
				System.out.println("Enter Player to Search: ");
				String player1 = sc.next();
				if(player1.equals("no"))
				{
					c=0;
				}
				 
			}
			
		}
		
		
		

	}

}
