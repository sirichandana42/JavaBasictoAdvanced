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

//palindrome or not using bufferedreader

import java.io.*;

public class basiccodes {
    public static void main(String[] args) throws IOException {
        /*An error occurs if we dont use throw block/ try catch because the readLine() method from the BufferedReader class can throw an IOException. 
        Java requires that checked exceptions, like IOException, must be either caught using a try-catch block or
         declared to be thrown in the method signature. */
        int n, rev = 0, temp;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String x = bf.readLine();
        n = Integer.parseInt(x);
        temp = n;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if (rev == temp) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

//Find the power of a number using recursion. 
import java.util.*;
import java.io.*;
public class basiccodes
{
    public static int power(int number, int power)
        {
            if (power == 0) 
            {
                return 1; 
            } 
            else if (power == 1) 
            {
                return number; 
            } 
            else 
            {
                return number * power(number, power - 1); //logic
            }
        }
    public static void main(String[] args) throws IOException
    // did using bufferedreader to get familiar with inputting using bufferedreader u can also use Scanner instead
    {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String x=bf.readLine();
        String y=bf.readLine();
        int a=Integer.parseInt(x);
        int b=Integer.parseInt(y);
        long result = power(a, b);
        System.out.print(result);
        power(a,b);

    }
}

//no.of trialing zeros in a factorial
//solution hint: Keep dividing n by powers of 5 and update count
import java.util.Scanner;
public class basiccodes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        findTrailingZeros(n);
    }

    public static void findTrailingZeros(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        
        System.out.print(count);
    }
}


