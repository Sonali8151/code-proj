import java.util.*;
import java.util.Scanner;
import java.lang.String;
/*class Strings
{
   public static void distict(String str)
{                
         int[] count = new int[NO_OF_CHARS];

         for(int i=0;i<s.length();i++)
     {
           
     }
         if ( count==1)
           {
              String s4=s3.insert(s1);
              System.out.println(s4);
           }
}
public static void main(String[] args)
{
     int count=0;
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
 }
}*/
class Strings
{
  int l;
  int b;
  public int rarea(int l,int b)
  {
    return l*b;
  }
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter l");
        int l1=sc.nextInt();
        System.out.println("enter b");
        int b1=sc.nextInt();
        Strings s=new Strings();
        s.rarea(l1,b1);
        System.out.println(s.rarea(l1,b1));
  }
}