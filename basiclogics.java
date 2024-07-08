//Find the factorial of a number
import java.util.*;
public class basiccodes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--)
        {
            fact=fact*i;
        }
        System.out.print(fact);
        sc.close();
    }
}

//Check if a number is prime. 
import java.util.*;
public class basiccodes{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean flag=true;
        for(int i=2;i*i<=x;i++)
        {
            if(x%i==0)
            {
                flag=false;
            }
        }
        if(flag) 
        {
            System.out.print( "is prime");
        }
        else 
        {
            System.out.print("is not prime");
        }
        sc.close();
    }
}

//Find the greatest common divisor (GCD) of two numbers. 
import java.util.*;
public class basiccodes{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        while(y!=0)
        {
            int temp=y;
            y=x%y;
            x=temp;
        }
        System.out.print(x);
        sc.close();
    }
}

 //Find the least common multiple (LCM) of two numbers.
 import java.util.*;
 public class basiccodes{
    public static int GCD(int x, int y)
    {
        while(y!=0)
         {
             int temp=y;
             y=x%y;
             x=temp;
         }
         return x;
    }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int x=sc.nextInt();
         int y=sc.nextInt();
         int gcd=GCD(x,y);
         System.out.print((x*y)/gcd);
         sc.close();
     }
 }

//Generate the first N Fibonacci numbers.

import java.util.*;
 public class basiccodes{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int x=0,y=1;
         int n=sc.nextInt();
         System.out.print("0"+" "+"1"+" ");
         for(int i=1;i<=n-2;i++)
         {
            int temp=y;
            y=x+y;
            x=temp;
            System.out.print(y+" ");
         }
         
         sc.close();
     }
 }
