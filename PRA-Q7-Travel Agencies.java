/*
Create a class TravelAgencies with below attributes:

regNo – int
agencyName – String
pakageType – String
price – int
flightFacility – boolean

Write getters, setters for the above attributes . Create constructor which takes parameter in the above sequence.

Create class Solution with main method. Implement two static methods – findAgencyWithHighestPackagePrice and 
agencyDetailsforGivenIdAndType in Solution class.

findAgencyWithHighestPackagePrice method:

This method will take array of TravelAgencies objects as an input parameter and return the highest package 
price from the given array of objects.

agencyDetailsForGivenldAndType method:

This method will take three input parameters -array of TravelAgencies objects, int parameter regNo and String
parameter packageType. The method will return the TravelAgencies object based on below conditions.

FlightFacility should be available.
The input parameters(regNo and packageType) should matched with the regNo and packageType of TravelAgencies object.
If any of the above conditions are not met, then the method should return null. Note : Same Travel agency can 
have more than one package type. Travel agency and package type combination is unique. All the searches should 
be case insensitive.

The above mentioned static methods should be called from the main method.


For findAgencyWithHighestPackagePrice method – The main method should print the highestPackagePrice as it is. 
For agencyDetailsForGivenldAndType method -The main method should print the AgencyName and price of the returned 
object.The AgencyName and price should be concatinated with : while printing.
---------
Input
---------
123
A2Z Agency
Platinum
50000
true
345
SSS Agency
Gold
30000
false
987
Cox and Kings
Diamond
40000
true
888
Global Tours
Silver
20000
false
987
Diamond
-------------------------------
Output
-------------------------------
50000
Cox and Kings:40000*/
import java.util.*;
class TravelAgencies
{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;
    public TravelAgencies(int regNo,String agencyName,String packageType,int price,boolean flightFacility)
    {
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flightFacility;
    }
    public int getregNo()
    {
        return this.regNo;
    }
    public String getagencyName()
    {
        return this.agencyName;
    }
    public String getpackageType()
    {
        return this.packageType;
    }
    public int getprice()
    {
        return this.price;
    }
    public boolean getflightFacility()
    {
        return this.flightFacility;
    }
}

public class TAsol
{
    public static int findAgencyWithHighestPackagePrice(ArrayList<TravelAgencies> travelagencies)
    {
        int max=0;
        for(TravelAgencies x:travelagencies)
        {
            if(x.getprice()>max)
            {
                max=x.getprice();
            }
        }
        return max;
    }
    public static ArrayList<TravelAgencies> agencyDetailsForGivenldAndType(ArrayList<TravelAgencies> travelagencies,int reqregno,String reqpackagetype)
    {
    ArrayList<TravelAgencies> filteredtravelagencies =new ArrayList<>();
    for(TravelAgencies x:travelagencies)
    {
        if(x.getflightFacility())
        {
            if(x.getregNo()==reqregno && x.getpackageType().equalsIgnoreCase(reqpackagetype))
            {
                filteredtravelagencies.add(x);
            }
        }
    }
    return filteredtravelagencies;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int noofagencies=sc.nextInt();
        ArrayList<TravelAgencies> travelagencies=new ArrayList<>();
        for(int i=0;i<noofagencies;i++)
        {
            int regNo=sc.nextInt();sc.nextLine();
            String agencyName=sc.nextLine();
            String packageType=sc.nextLine();
            int price=sc.nextInt();
            boolean flightFacility=sc.nextBoolean();
            travelagencies.add(new TravelAgencies(regNo,agencyName,packageType,price,flightFacility));
        }
        int reqregno=sc.nextInt();sc.nextLine();
        String reqpackagetype=sc.nextLine();
        System.out.println(findAgencyWithHighestPackagePrice(travelagencies));
        ArrayList<TravelAgencies> ans=agencyDetailsForGivenldAndType(travelagencies,reqregno,reqpackagetype);
        
        if(ans.isEmpty())
        {
            System.out.println("null");
        }
        else
        {
            for(TravelAgencies x:ans)
            {
                System.out.println(x.getagencyName()+":"+ x.getprice());
            }
        }
        sc.close();
    }
}
