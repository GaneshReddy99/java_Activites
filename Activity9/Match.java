import java.util.Date;

public class Match implements Comparable<Match> {
	private String team1;
	private String team2;
	private String matchDate;
	
	public Match( String matchDate,String team1, String team2) {
		super();
		this.team1 = team1;
		this.team2 = team2;
		this.matchDate =matchDate;
	}
	
	

	public Match() {
		super();
	}



//	public Match(java.util.Date parse) {
//		// TODO Auto-generated constructor stub
//	}



	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	public int compareTo(Match m) {
		 
		    return matchDate.compareTo(m.getMatchDate());
		
		
	}
	

}
