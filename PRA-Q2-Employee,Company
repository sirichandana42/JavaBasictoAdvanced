/*
Create a class named "Employee" with the following attributes:

id (int)
name (String)
designation (String)
salary (double)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Employee class:

getSalary(): This method should return the salary of the employee.
getDesignation(): This method should return the designation of the employee.

Create a class named "Company" with the following attributes:

companyName (String)
employees (Employee array)
numEmployees (int)

The above attributes should be private, and the class should have a parameterized constructor to initialize them.

Implement the following methods in the Company class:

getAverageSalary(): This method should return the average salary of all the employees in the company.
getMaxSalary(): This method should return the highest salary of all the employees in the company.
getEmployeesByDesignation(String designation): This method should return an array of all employees with the given designation.

In the main method, use a Scanner object to read the values of the company name, number of employees, and the employee details 
(id, name, designation, and salary) in a loop. Once all employee details have been read, create a Company object and pass the 
appropriate parameters. Finally, call the three methods mentioned above and print the output.

Note:

All searches should be case-insensitive.
You may assume that the input is valid and in the correct format.

Sample input:
---------------------
Enter company name: ABC Company
Enter number of employees: 3
Enter employee details:
Employee 1:
Enter id: 101
Enter name: John Smith
Enter designation: Manager
Enter salary: 5000
Employee 2:
Enter id: 102
Enter name: Jane Doe
Enter designation: Engineer
Enter salary: 4000
Employee 3:
Enter id: 103
Enter name: Bob Johnson
Enter designation: Engineer
Enter salary: 4500

Sample Output:
--------------------
Average salary: 4500.0
Max salary: 5000.0
Employees with designation: Engineer
ID: 102, Name: Jane Doe, Designation: Engineer, Salary: 4000.0
ID: 103, Name: Bob Johnson, Designation: Engineer, Salary: 4500.0
*/

import java.util.*;
class Employee
{
    private int id;
    private String name;
    private String des;
    private double salary;
    public Employee(int id, String name, String des, double salary) 
    {
        this.id = id;
        this.name = name;
        this.des = des;
        this.salary = salary;
    }

    public int getId() 
    {
        return id;
    }
    public String getName() 
    {
        return name;
    }

    public String getDes() 
    {
        return des;
    }
    public double getSalary() 
    {
        return salary;
    }
}

class Company
{

    private String companyName;
    private ArrayList<Employee> employees;
    private int numEmployees;
    public Company(String companyName, ArrayList<Employee> employees) 
    {
        this.companyName = companyName;
        this.employees = employees;
    }

    public String getcompanyName() 
    {
        return companyName;
    }
    public int getnumEmployees() 
    {
        return employees.size();
    }
    public double getAverageSalary()
    {
        if (employees.isEmpty()) {
            return 0;
        }
        double sum=0;
        for(Employee x:employees)
        {
            sum=sum+x.getSalary();
        }
        if(sum>0)
        {
            double avg=sum/employees.size();
            return avg;
        }
          return 0;
    }
    public double getMaxSalary()
    {
        double check=0;
        for(Employee x:employees)
        {
            if(check<x.getSalary())
            {
                check=x.getSalary();
            }
        }
        return check;
    }
    public ArrayList<Employee> getEmployeesByDesignation(String reqdesi)
    {
        ArrayList<Employee> result=new ArrayList<>();
        for(Employee x:employees)
        {
            if(x.getDes().equalsIgnoreCase(reqdesi))
            {
                result.add(x);
            }
        }
        return result;
    }

}
public class Solution2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        String companyName=sc.nextLine();
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<Employee> Employees=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int empId=sc.nextInt(); sc.nextLine();
            String empName=sc.nextLine(); 
            String empDes=sc.nextLine(); 
            double empSalary=sc.nextDouble();sc.nextLine();
            Employees.add(new Employee(empId,empName,empDes,empSalary));
        }
        Company company=new Company(companyName,Employees);

        System.out.println(company.getAverageSalary());
        System.out.println(company.getMaxSalary());
        String reqdesi=sc.nextLine();
        ArrayList<Employee> filteredemployees= company.getEmployeesByDesignation(reqdesi);
        for(Employee x:filteredemployees)
        {
            System.out.println(x.getId()+" "+x.getName()+" "+x.getDes()+" "+x.getSalary());
        }
        sc.close();
    }

}
