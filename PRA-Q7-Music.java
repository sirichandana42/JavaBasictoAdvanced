/*Create a class Music with below attributes:

playListNo - int

type -String

count - int

duration(minutes) -double.



The above attributes should be private.Write Getter and Setter and parametrized constructor as required.

Create class Solution with main method.

****************************************************************************

Implement two static methods: findAvgOfCount and sortTypeByDuration in Solution Class.



findAvgOfCount Method:
----------------------------------------
This method will take an array of Music objects and an int value as input parameters.The method will find out Average 
(as int) of count for those objects whose count is more than the given Count(int parameter passed).This method will return 
average if found.If there is no Type that matches then the method should return 0.

for this method- main method should print average ,if the returned value is not 0.If the returned value is 0 then main method 
should print "No playlist found".

sortTypeByType method:
-----------------------------------------
This method will take an array of Music objects This method should return an array of 
Music objects in an descending alphabetical order of their type 


****************************************************************************

Consider the below input and output:
4
111
WorkOut
10
15.2
321
Dance Party
20
55.500
721
Childhood Jams
6
50.60
521
Chill
30
78.89
15
----------------------------------
25
WorkOut
Dance Party
Chill
Childhood Jams

  */

import java.util.*;
class Music
{
    private int playlistNo;
    private String type;
    private int count;
    private double duration;
    public Music(int playlistNo,String type,int count,double duration)
    {
        this.playlistNo=playlistNo;
        this.type=type;
        this.count=count;
        this.duration=duration;
    }
    public int getplaylistNo()
    {
        return this.playlistNo;
    }
    public String gettype()
    {
        return this.type;
    }
    public int getcount()
    {
        return this.count;
    }
    public double getduration()
    {
        return this.duration;
    }
}

public class Musicsol
{
    public static int findAvgOfCount(ArrayList<Music> music,int reqcount)
    {
        int count=0;
        int sum=0;
        for(Music x:music)
        {
            if(x.getcount()>reqcount)
            {
                count++;
                sum+=x.getcount();
            }
        }
        if(count>0) return sum/count;
        else return 0;
    }
    public static ArrayList<Music> sortTypeByType (ArrayList<Music> music)
    {
        music.sort(Comparator.comparing(Music::gettype).reversed());  //vvip funtion to sort in aphabetical order
        return music; 
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int noofmusic=sc.nextInt();
        ArrayList<Music> music=new ArrayList<>();
        for(int i=0;i<noofmusic;i++)
        {
            int playlistNo=sc.nextInt(); sc.nextLine();
            String type=sc.nextLine();
            int count=sc.nextInt();
            double duration=sc.nextDouble();
            music.add(new Music(playlistNo,type,count,duration));
        }
        int reqcount=sc.nextInt();sc.nextLine();
        String reqtype=sc.nextLine();
        int ans=findAvgOfCount(music,reqcount);
        if(ans>0) System.out.println(ans);
        else System.out.println("No Playlists Found");
        ArrayList<Music> sortedmusic= sortTypeByType(music);
        for(Music x:sortedmusic)
        {
            System.out.println(x.gettype());
        }
        sc.close();
    }
}
