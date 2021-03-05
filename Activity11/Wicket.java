
public class Wicket
{
	private String PlayerName;
	private Bowler bowler;
	
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public Bowler getBowler() {
		return bowler;
	}
	public void setBowler(Bowler bowler) {
		this.bowler = bowler;
	}
	//constructor
	public Wicket(String playerName, Bowler bowler) {
		super();
		PlayerName = playerName;
		this.bowler = bowler;
	}
	
	public void display()
	{
		String array[] = PlayerName.split("\\|");
		
		System.out.println("Player Name: "+bowler.getName());
		System.out.println("Wickets: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
