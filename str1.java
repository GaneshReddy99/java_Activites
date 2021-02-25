import java.util.*;
public class str1
{

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.nextLine();
        s2=sc.nextLine();
        int n=s1.length();
        String s3=s1.substring(0, 1).toUpperCase()+s1.substring(1,n)+s2.toUpperCase();
        
        System.out.println(s3);
     }
     
}