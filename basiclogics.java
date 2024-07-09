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

 //Check if a number is a perfect square. 
 import java.util.*;
 import java.lang.Math;
 public class basiccodes{
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         double sqr=Math.sqrt(n);
         if(sqr*sqr==n)
         {
            System.out.print("is perfect sqaure");
         }
         else
         System.out.print("not a perfect sqaure");
         sc.close();
     }
 }

//Check if a n is an Armstrong n. 
import java.util.Scanner;

public class basiccodes {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean isArmstrong = isArmstrongNn(n);
        if (isArmstrong) {
            System.out.println(" is an Armstrong");
        } else {
            System.out.println(" is not an Armstrong ");
        }
    }

    public static boolean isArmstrongNn(int n) {
        int temp = n;
        int noofdigi = countDigits(n);
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += Math.pow(digit, noofdigi);
            n /= 10;
        }
        return sum == temp;
    }
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }
}

//Find the sum of digits of a number. 
import java.util.*;
public class basiccodes{
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            int temp=n;
            int r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.print(sum);
    }
}


//Reverse the digits of a number.
import java.util.*;
public class basiccodes{
    public static void main(String[] args) {
        int n,rev=0;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            int temp=n;
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.print(rev);
    }
}

//Check if a number is a palindrome. 
import java.util.*;
public class basiccodes{
    public static void main(String[] args) {
        int n,rev=0,temp;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==temp)
        {
            System.out.print("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
