/*create the class Course with the below Attributes.

courseId- int
courseName- String
courseAdmin- String
quiz- int
handson -int

The above methods should be private ,write getter and
setter and parametrized constructor as required.

create class courseProgram with main method.

implement two static methods-
   findAvgOfQuizByAdmin method:this method will take array
of Course objects and a String  value as input parameters.
This method will find out Average (as int) of Quiz questions
for given Course Admin (String parametre passed)
This method will return Average if found.if there is no course
that matches then the method should return 0.

sortCourseByHandsOn method:
This method will take an Array of Course Objects and int
value as input parameters.
This methods should return an Array of Course objects in an
ascending order of their  handson which are less than the
given handson(int parameter passed) value. if there is no
such course then the method should return null.

The above mentioned static methods should be called from
main methods.

for findAvgOfQuizByAdmin method: The main method
should print the average if the returned value is not 0.
if the returned value is 0 then it should print "No Course
found."


for sortCourseByHandsOn method:
                        the  main method should print the name
of the Course from the returned Course object Array if the
returned value is not null.if the returned value is null then
it should print "No Course found with mentioned attribute."

input1:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Nisha
17

output1:
35
kubernetes
Apache Spark
cassandra

input2:
111
kubernetes
Nisha
40
10
321
cassandra
Roshini
30
15
457
Apache Spark
Nisha
30
12
987
site core
Tirth
50
20
Shubhamk
5

output 2:
No Course found
No Course found with mentioned attributes.
*/

import java.util.*;
class Course
{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Course(int courseId,String courseName,String courseAdmin,int quiz,int handson)
    {
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseAdmin=courseAdmin;
        this.quiz=quiz;
        this.handson=handson;
    }

    public int courseId()
    {
        return this.courseId;
    }
    public String getcourseName()
    {
        return this.courseName;
    }
    public String getcourseAdmin()
    {
        return this.courseAdmin;
    }
    public int getquiz()
    {
        return this.quiz;
    }
    public int gethandson()
    {
        return this.handson;
    }
}
public class CourseProgram
{
    public static int findAvgOfQuizByAdmin(ArrayList<Course> course,String courseadmin)
    {
        int sum=0;
        int count=0;
        for(Course x:course)
        {
            if(x.getcourseAdmin().equalsIgnoreCase(courseadmin))
            {
                count++;
                sum+=x.getquiz();
            }
        }
        if(sum>0)
        {
            return sum/count;
        }
        else{
            return 0;
        }
    }


    public static ArrayList<Course> sortCourseByHandsOn(ArrayList<Course> course, int value)
    {
        ArrayList<Course> filteredCourses=new ArrayList<>();
        for(Course x:course)
        {
        if(x.gethandson()<value)
            {
                filteredCourses.add(x);
            }
        }
        if (filteredCourses.isEmpty()) {
            return null;
        }
        filteredCourses.sort(Comparator.comparingInt(Course::gethandson));   //important to be noted
        return filteredCourses;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Course> course = new ArrayList<>();
        int n=sc.nextInt();sc.nextLine();
        for(int i=0;i<n;i++)
        {
        int courseId=sc.nextInt(); sc.nextLine();
        String courseName=sc.nextLine();
        String courseAdmin=sc.nextLine();
        int quiz=sc.nextInt();sc.nextLine();
        int handson=sc.nextInt();sc.nextLine();
        course.add(new Course(courseId,courseName,courseAdmin,quiz,handson));
        }
        String reqcourseadmin=sc.nextLine();
        int value=sc.nextInt();

        System.out.println(findAvgOfQuizByAdmin(course,reqcourseadmin));
        
        ArrayList<Course> answer= sortCourseByHandsOn(course,value); //important to be noted//
        for(Course x:answer)
        {
            System.out.println(x.getcourseName());
        }
    }
}
