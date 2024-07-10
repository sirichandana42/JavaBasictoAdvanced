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

//remove duplicates using set
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
        Set<Integer> dup=new HashSet<>();
        for (int num : arr) 
        {
            dup.add(num);
        }
        System.out.println(dup);
    }
}

//another method to remove duplicates
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
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag!=1)
                {
                    System.out.print(arr[i]+" ");
                }
        }
    }
}

//find duplicates
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
        for(int i=0;i<n;i++)
        {
            int flag=0;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                {
                    System.out.print(arr[i]+" ");
                }
        }
    }
}

//Merge two sorted arrays. 
import java.util.*;
public class basiccodes
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int[] arr3=new int[n1+n2];
        for(int i=0;i<n1;i++)
        {
            arr3[i]=arr1[i];
        }
        int x=0;
        for(int i=n1;i<n1+n2;i++)
        {
            arr3[i]=arr2[x];
            x++;
        }
        Set<Integer> dup=new HashSet<>();
        for (int num : arr3) 
        {
            dup.add(num);
        }
        System.out.print(dup);
    }
}
