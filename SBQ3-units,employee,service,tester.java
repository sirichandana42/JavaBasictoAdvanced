/*Create a class Unit with following:

1.Attributes

unitld: Integer

unitName: String

budget: Integer

employees: List of employees for the unit.

2.Getters and Setters Methods

3.Parameterized constructor

Create a class Employee with following:

1.Attributes

employeeld nteger

employeeName: String

salary:Integer

2.Getters and Setters Methods.

3.Parameterized constructor.

Relationship

Each Unit can have multiple Employees objects.

Create a class Service with following methods

1.Calculate TotalSalaryByEmployeeName:
-This method will take a list of Unit objects and a employeeName as input.

-This method calculates and Prints the total Salary by employeeName.

ALL

1

-If no Employee is found the method should print a message "No Employee found with mentioned name." (Without quotes)

-You need to throw an custom based exception in case of, if the salary of a employee is negative. The method should throw an exception called Salaryis NegativeException which includes a message "Invalid Salary: Salary cannot be negative." (without quotes).

2.findUnitNamesOfEmployeeBySalary:

-This method will take a list of Unit objects and integer parameter Salary.

-Method should print the list of all the Unit Names who have employed employees where their employee salary is greater than the salary passed as a parameter. (refer The output)

-If no match is found then method should print the message "No matching units found."(Without quotes)

Create a class Tester

1. Take inputs

2. Create Object of Service class to call the methods.

Refer the sample input and output. 

Sample Input:

3-->No of Units.

1001-->Unit Id for 1st Unit.

BFSI-->Unit Name for 1st Unit.

2-->No of Employees under 1st Unit

LL

101-->Employee ID of 1st Employee under 1st Unit

Sagar-->Employee Name of 1st Employee under 1st Unit

D

25000-->Employee Salary of 1st Employee under 1st Unit

1

4

102-->Employee ID of 2nd Employee under 1st Unit

Shalini-->Employee Name of 2nd Employee under 1st Unit

26000-->Employee Salary of 2nd Employee under 1st Unit

1002-->Unit Id for 2nd Unit.

CMI-->Unit name for 2nd Uit.

1-->No of Employees under 2nd Unit

204-->Employee ID of 1st Employee under 2nd Unit

SagarS-->Employee Name of 1st Employee under 2nd Unit

30000-->Employee Salary of 1st Employee under 2nd Unit

1003-->Unit Id for 3rd Unit.

BNTS-->Unit Name for 3rd Unit..

2-->No of Employees under 3rd Unit

301-->Employee ID of 1st Employee under 3rd Unit

Subhash-->Employee Name of 1sst Employee under 3rd Unit

12000-->Employee Salary of 1st Employee under 3rd Unit

302-->Employee ID of 2nd Employee under 3rd Unit

Saniva-->Emplovee Name of 2nd Emplovee under
Saniya-->Employee Name of 2nd Employee under 3rd Unit

25000-->Employee Salary of 1st Employee under 3rd Unit

Sagar-->Argument

for Calculate TotalSalaryByEmployeeName function

20000 -->Argument for findUnitNamesOfEmployeeBySalary

Sample output:

25000

BFSI

CMI

BNTS

Explanation:

The first line of output is total salary of the employees of the given employee name

The following line(s) is/are the list of name/names of the unit(s) who have employees with salary more than the given input price*/

import java.util.*;

class Unit
{
    private int unitId;
    private String unitName;
    private int budget;
    private ArrayList<Employee> employees;
    public Unit(int unitId,String unitName,int budget,ArrayList<Employee> employees)
    {
        this.unitId=unitId;
        this.unitName=unitName;
        this.budget=budget;
        this.employees=employees;
    }
    public int getunitId()
    {
        return this.unitId;
    }
    public String getunitName()
    {
        return this.unitName;
    }
    public int getbudget()
    {
        return this.budget;
    }
    public ArrayList<Employee> getemployees()
    {
        return this.employees;
    }
}

class Employee
{
    private int employeeId;
    private String employeeName;
    private int salary;
    public Employee(int employeeId,String employeeName,int salary)
    {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.salary=salary;
    }
    public int getemployeeId()
    {
        return this.employeeId;
    }
    public String getemployeeName()
    {
        return this.employeeName;
    }
    public int getsalary()
    {
        return this.salary;
    }
}


class SalaryisNegativeException extends Exception{
    public SalaryisNegativeException(String message)
    {
        super(message);
    }
}
class Service {
    public void CalculateTotalSalaryByEmployeeName(ArrayList<Unit> units, String reqemployeeName)
    {
        int totalsalary=0;
        boolean found=false;
        for(Unit y:units)
        {
            for(Employee x:y.getemployees())
            {
                if(x.getemployeeName().equalsIgnoreCase(reqemployeeName))
                {
                    found=true;
                    if(x.getsalary()<0)
                    {
                        try{
                            throw new SalaryisNegativeException("Invalid Salary: Salary cannot be negative.");
                        }
                        catch(SalaryisNegativeException e)
                        {
                            System.out.println(e.getMessage());
                            return;
                        }
                    }
                    totalsalary+=x.getsalary();
                }
            }
        }
        if(found)
        {
            System.out.println(totalsalary);
        }
        else{
            System.out.println("No Employee found with mentioned name.");
        }
    }
    public void findUnitNamesOfEmployeeBySalary(ArrayList<Unit> units, int reqsalary)
    {
        ArrayList<String> matchingunits=new ArrayList<>();
        for(Unit y:units)
        {
            for(Employee x:y.getemployees())
            {
                if(x.getsalary()>reqsalary)
                {
                    matchingunits.add(y.getunitName());
                    break;
                }
            }
        }
        if(matchingunits.isEmpty())
        {
            System.out.println("No matching units found.");
        }
        else{
            for(String unitName:matchingunits)
            {
                System.out.println(unitName);
            }
        }
    }
}
public class Tester
{
    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Unit> units=new ArrayList<>();
        int nu=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<nu;i++)
        {
            int unitId=sc.nextInt(); sc.nextLine();
            String unitName=sc.nextLine();
            int budget=sc.nextInt(); sc.nextLine();
            int ne=sc.nextInt();sc.nextLine();
            ArrayList<Employee> employees=new ArrayList<>();
            for(int j=0;j<ne;j++)
            {
                int employeeId=sc.nextInt();sc.nextLine();
                String employeeName=sc.nextLine();
                int salary=sc.nextInt(); 
                sc.nextLine();
                employees.add(new Employee(employeeId,employeeName,salary));
            }
            units.add(new Unit(unitId,unitName,budget,employees));
        }
        String reqemployeeName=sc.nextLine();
        int reqsalary=sc.nextInt();sc.nextLine();
        Service service=new Service();
        service.CalculateTotalSalaryByEmployeeName(units,reqemployeeName);
        service.findUnitNamesOfEmployeeBySalary(units,reqsalary);
        sc.close();
    }
}
