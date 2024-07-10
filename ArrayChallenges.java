//Find the largest element in an array.
import java.util.*;
public class basiccodes
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[n-1]);
    }
}

//Find the smallest element in an array.
import java.util.*;
public class basiccodes
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print(arr[0]);
    }
}

//Find the sum of elements in an array.
import java.util.*;
public class basiccodes
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}

//reverse an array.
import java.util.*;
public class basiccodes
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}

//another method to reverse and save the array 

import java.util.*;
public class basiccodes
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j)
        {
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;j--;
        }
        for(int x=0;x<n;x++)
        {
            System.out.print(arr[x]+" ");
        }
        
    }
}
