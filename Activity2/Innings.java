class Innings
{
private String teamname;
private String inningsname;
private int runs;
public String getteamname()
{
return teamname;
}
public String getinningsname()
{
return inningsname;
}
public int getruns()
{
return runs;
}
void setteamname(String nam)
{
this.teamname=nam;
}
void setinningsname(String inni)
{
this.inningsname=inni;
}
void setruns(int run)
{
this.runs=run;
}
void displayInningsDetails()
{
System.out.println("Name:"+teamname);
System.out.println("Enter session:"+inningsname);
System.out.println("Score:"+runs);
}
}