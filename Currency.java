import java.util.*;
import java.io.*;
public class Currency
{
  public static void main(String args[])
  {
    int count=0;
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    if(a>=0)
    {
      if(a>=1000)
      {
        int b=a/1000;
        count=count+b;
        a=a-(b*1000);
      }
      // else
      if(a>=500)
      {
        int b=a/500;
        count=count+b;
        a=a-(b*500);
      }
      //  else
      if(a>=100)
      {
        int b=a/100;
        count=count+b;
        a=a-(b*100);
      }
      //else
      if(a>=50)
      {
        int b=a/50;
        count=count+b;
        a=a-(b*50);
      }
      // else
      if(a>=20)
      {
        int b=a/20;
        count=count+b;
        a=a-(b*20);
      }
      // else
      if(a>=10)
      {
        int b=a/10;
        count=count+b;
        a=a-(b*10);
      }
      //else
      if(a>=5)
      {
        int b=a/5;
        count=count+b;
        a=a-(b*5);
      }
      // else
      if(a>=2)
      {
        int b=a/2;
        count=count+b;
        a=a-(b*2);
      }
      //else
      if(a>=1)
      {
        int b=a/1;
        count=count+b;
        a=a-(b*1);
      }
    }
    
    System.out.println(count);
  }
}
