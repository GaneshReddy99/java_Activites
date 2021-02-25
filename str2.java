import java.util.*;
public class str2
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        String [] str1=s1.split(" ");
        String [] str2=s2.split(" ");
        if(str1[1].equals(str2[1]))
        {
             System.out.println("yes");
        }
        else
        {
            System.out.println("No");
        }
     
     }
     
}