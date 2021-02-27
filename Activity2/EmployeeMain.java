import java.util.*;
class EmployeeMain
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
String s3=sc.next();
Employee em=new Employee();
em.setname(s1);
em.setaddress(s2);
em.setmobile(s3);
System.out.println("Employee Details");
System.out.println(em.getaddress());
System.out.println(em.getaddress());
System.out.println(em.getmobile());
}
}
