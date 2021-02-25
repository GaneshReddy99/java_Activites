import java.util.*;
public class  Greater_id{
   static int [] cricketer=new int[100];
     public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
        {
        System.out.println("Invalid array size");
        System.exit(0);
        }
        int [] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<1)
            {
                System.out.println("Invalid array size");
                System.exit(0);
            }
        }
        int x=sc.nextInt();
        if(x<0)
        {
        System.out.println("Invalid array size");
        System.exit(0);
        }
        findCricketerId(arr,n,x);
     }
     static void findCricketerId(int array[], int size, int score)
     {
         int j=0;
         for(int i=0;i<size;i++)
        {
           if(i%2!=0)
           {
               if(array[i]>score)
               {
                   cricketer[j]=array[i-1];
                   j++;
               }
               
           }
       }
       for(int k=0;k<=j-1;k++)
       {
           System.out.println(cricketer[k]);
       }
     }
}