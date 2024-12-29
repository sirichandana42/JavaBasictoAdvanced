/*
PRE-PRA QUESTION

Write a Java code that implements the following:

Create a class MusicApp with following:

1.Attributes

appld: Integer

appName: String

appSubscription:

Integer

songs: List of Songs for the musicApp.

2.Getters and Setters Methods

3. Parameterized constructor

Create a class Song with following:

1.Attributes

songid: Integer

songName, String

singerNamer String

songViews:integer

2.Getters and Setters Methods
3.Parameterized constructor.

Relationship

Each musicApp can have multiple Songs objects.


Create a class Service with following methods

1.CalculateAverageViewsBySingerName:

-This method will take a list of musicApp objects and a singerName as input. -This method calculates and Prints the Average Views wrt singerName across the various musicApp. -If no song is found the method should print a message "No Song found with mentioned singerName." (Without quotes)

-You need to throw an custom based exception in case of, if the songViewer of a song is negative. The method should throw an exception called ViewisNegativeException which includes a message "Invalid SongsView: SongViews cannot be negative." (without quotes).

2.findmusicAppOfSongsBySongName:

-This method will take a list of Song objects and string parameter SongName.

-Method should print the list of all the musicApp Names who have Songs where the songName is same as passed as a parameter. (refer The output)

-If no match is found then method shouldprint the message "No matching musicApp found."(Without quotes)

Create a class Tester

1. Take inputs

L D 1

2. Create Object of Service class to call the methods.

Note-Every String Comparison should be case sensitive. The value for number of musicApps to be added can range from 0 to 100. In case, number of musicApps to be added is 0, you have to print "No musicAppFound"

Refer the sample input and output.

++

Sample Input:

3//Number of music Apps

1234 //ld for musicApp

Wynk //name of the musicApp

500 //subscription fees of musicApp

3 //number of songs on Wynk musicApp

988 //ld of Song on Wynk musicApp

KingShit //Name of song on Wynk musicApp

Shubh //SingerName of songs on Wynk musicApp

70000 //Viewers of songs on Wynk musicApp

653 //ld of Song on Wynk musicApp

Apna BanaLePiya //Name of song on Wynk musicApp

Arijit //Singer Name of songs on Wynk musicApp

90000 //Viewers of songs on Wynk musicApp
345 //ld of Song on Wynk musicApp

AabadBarbaad //Name of song on Wynk musicApp

Arijit //SingerName of songs on Wynk musicApp

55000 //Viewers of songs on Wynk musicApp

1235 //ld for musicApp

Spotify //name of the musicApp

350 //subscription fees of musicApp

3 //number of songs on Spotify musicApp

988 //ld of song on Spotify musicApp

KingShit //Name of song on Spotify musicApp

Shubh //SingerName of songs on Spotify musicApp

9000 //Viewers of song on Spotify musicApp

653 //ld of song on Spotify musicApp

Saware //Name of song on Spotify musicApp

Arijit //SingerName of songs on Spotify musicApp

100000 //Viewers of song on Spotify musicApp

345 //ld of song on Spotify musicApp

Tumhare Hi Rahenge Hum //Name of song on Spotify musicApp

Varun //Singer Name of songs on Spotify musicApp

120000 //Viewers of song on Spotify musicApp

1236 //ld for musicApp

JiioSaavn //name of the musicApp

450 //subscription fees of musicApp

3//number of songs on JiioSaavn musicApp

980 //ld of song on jiioSaavn musicApp

Numb //Name of song on JiioSaavn musicApp

LinkanPark //SingerName on JiloSaavn musicApp

9000 //Viewers of song on JiloSaavn musicApp

653 //ld of song on JiioSaavn musicApp

JoTuNaMila //Name of song on JiloSaavn musicApp

AsinAzhar //Singer Narne on JiloSaavn musicApp

100000 //Viewers of song on JiloSaavn musicApp

345 //ld of song on JiloSaavn musicApp

Humraah //Name of song on JiloSaavn musicApp

AsimAzhar //Singer Name on JiloSaavn musicApp

120000 //Viewers of song on JiloSaavn musicApp

Arijit //Argument for Calculate Average ViewsBySinger Name function
JoTuNaMila //Argument for findmusicAppOfSongs BySongName function

Sample output:

81666

JiioSaavn
*/
import java.util.*;
class MusicApp
{
    private int appId;
    private String appName;
    private int appSubscription;
    private ArrayList<Songs> songs;
    public MusicApp(int appId,String appName,int appSubscription,ArrayList<Songs> songs)
    {
        this.appId=appId;
        this.appName=appName;
        this.appSubscription=appSubscription;
        this.songs=songs;
    }
    public int getappId()
    {
        return this.appId;
    }
    public String getappName()
    {
        return this.appName;
    }
    public int getappSubscription()
    {
        return this.appSubscription;
    }
    public ArrayList<Songs> getsongs()
    {
        return this.songs;
    }
}

class Songs{
    private int songId;
    private String songName;
    private String singerName;
    private int songViews;
    public Songs(int songId,String songName,String singerName,int songViews)
    {
        this.songId=songId;
        this.songName=songName;
        this.singerName=singerName;
        this.songViews=songViews;
    }
    public int getsongId()
    {
        return this.songId;
    }
    public String getsongName()
    {
        return this.songName;
    }
    public String getsingerName()
    {
        return this.singerName;
    }
    public int getsongViews()
    {
        return this.songViews;
    }
}
class Service1
{
    public int CalculateAverageViewsBySinger(ArrayList<MusicApp> musicapp,String reqsingername)
    {
        int sum=0; int count=0;
        for(MusicApp x:musicapp)
        {
            for(Songs y:x.getsongs())
            {
                if(y.getsingerName().equalsIgnoreCase(reqsingername))
                {
                    if(y.getsongViews()<0)
                    {
                        System.out.println("Invalid SongsView: SongViews acnnot be negative.");
                        
                    }
                    else{
                    sum+=y.getsongViews();
                    count++;
                    }
                }
            }
        }
        if(count==0)
        {
            System.out.println("No Song found with mentioned singerName.");
            return 0;
        }
        else{
            return sum/count;
        }
    }

    
    public ArrayList<MusicApp> findmusicAppOfSongsBySong(ArrayList<MusicApp> musicapps,String reqsongname)
    {
        ArrayList<MusicApp> filteredmusicapp= new ArrayList<>();
        for(MusicApp x: musicapps)
        {
            for(Songs y:x.getsongs())
            {
                if(y.getsongName().equalsIgnoreCase(reqsongname))
                {
                    filteredmusicapp.add(x);
                }
            }
        }


            return filteredmusicapp;
    }
}
public class Tester1{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int nma=sc.nextInt();
        ArrayList<MusicApp> musicapp=new ArrayList<>();
        for(int i=0;i<nma;i++)
        {
           int appId=sc.nextInt();sc.nextLine();
            String appName=sc.nextLine();
            int appSubscription=sc.nextInt();
            int ns=sc.nextInt();
            ArrayList<Songs> songs=new ArrayList<>();
            for(int j=0;j<ns;j++)
            {
               int songId=sc.nextInt();sc.nextLine();
              String songName=sc.nextLine();
               String singerName=sc.nextLine();
                int songViews=sc.nextInt();
                songs.add(new Songs(songId,songName,singerName,songViews));
            }
            musicapp.add(new MusicApp(appId,appName,appSubscription,songs));
        }
        sc.nextLine();
         String reqsingername=sc.nextLine();
         String reqsongname=sc.nextLine();
         Service1 service = new Service1();
         System.out.println(service.CalculateAverageViewsBySinger(musicapp,reqsingername));
         ArrayList<MusicApp> ans=service.findmusicAppOfSongsBySong(musicapp,reqsongname);
         if(ans.isEmpty())
        {
            System.out.println("No matching musicApp found.");
        }
        else{
            for(MusicApp x:ans)
            {
                System.out.println(x.getappName());
            }
        }
    }
}
