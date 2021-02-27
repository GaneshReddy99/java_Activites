import java.util.*;
class InningsMain
{
public static void main(String [] args)
{
Scanner sc =new Scanner(System.in);
Innings i=new Innings();
String s1=sc.next();
String s2=sc.next();
int n=sc.nextInt();
i.setteamname(s1);
i.setinningsname(s2);
i.setruns(n);
i.displayInningsDetails();
}
}