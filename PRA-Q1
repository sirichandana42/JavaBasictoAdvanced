/*Create a class Employee with below attributes:

employeeId - int
employeeName - String
age - int
gender - char
salary - double

where employeeId is the unique identifier of the employee, employeeName is the name of the employee, age is the age of 
the employee, gender is the gender of the employee and salary is the salary of the employee.

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.
Implement two static methods - getEmployeeWithSecondLowestSalary and countEmployeesBasedOnAge in Solution class.

getEmployeeWithSecondLowestSalary method:
This method will take an array of Employee objects as a parameter.
The method will return the Employee object with the second lowest salary in the array of Employee objects.
If there are less than two employees in the array, then the method should return null.

countEmployeesBasedOnAge method:
This method will take two input parameters - array of Employee objects and an integer parameter (for age).
The method will return the count of employees from the array of Employee objects whose age matches with the input 
parameter.
If no employee with the given age is present in the array of Employee objects, then the method should return 0.

Note :

Two employee objects can have the same salary.
All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For getEmployeeWithSecondLowestSalary method - The main method should print the employeeId followed by # and employeeName
from the returned Employee object, if the returned value is not null.

If the returned value is null then it should print "Null".

For countEmployeesBasedOnAge method - The main method should print the count of employees as it is, if the returned value
is greater than 0, otherwise it should print "No employee found for the given age".

Before calling these static methods in main, use Scanner to read the number of objects and objects to read the values of 
Employee objects referring attributes in the above mentioned attribute sequence.

Consider below sample input and output:

Input:
-------------
4
101
John
30
M
10000.00
102
Samantha
25
F
15000.00
103
Alex
28
M
12000.00
104
Lisa
30
F
15000.00
30

Output:
----------------
103#Alex
2
*/

import java.util.*;
class Employee
{
    private int id;
    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(int id, String name, int age, char gender, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public int getId()
    {
        return this.id;
    }
    public String getName()
    {
        return this.name;
    }
    public int getAge()
    {
        return this.age;
    }
    public char getGender()
    {
        return this.gender;
    }
    public double getSalary()
    {
        return this.salary;
    }
}

public class Solution
{
    public static Employee getEmployeeWithSecondLowestSalary(ArrayList<Employee> employees, int n)
    {
        if(n<2)
        {
            return null;
        }
            employees.sort(Comparator.comparingDouble(Employee::getSalary));    //comparator operator
            double firstLowestSalary = employees.get(0).getSalary();
            for (Employee employee : employees) 
            {
                if (employee.getSalary() > firstLowestSalary) 
                {
                    return employee;
                }
            }
        return null;
    }
    public static int countEmployeesBasedOnAge(ArrayList<Employee> employees, int reqage)
    {
        int count=0;
        for(Employee employee:employees)
        {
            if(employee.getAge()==reqage)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        ArrayList<Employee> Employees=new ArrayList<>();   //important to be noted
        for(int i=0; i<n; i++)
            {
                int employeeId = sc.nextInt();sc.nextLine();
                String employeeName = sc.nextLine();
                int age = sc.nextInt();sc.nextLine();
                char gender = sc.next().charAt(0);sc.nextLine();
                double salary = sc.nextDouble();sc.nextLine();
                Employees.add(new Employee(employeeId,employeeName,age,gender,salary));   //important to be noted
            }
        int reqage=sc.nextInt();
        Employee sls= getEmployeeWithSecondLowestSalary(Employees,n);
        int count= countEmployeesBasedOnAge(Employees,reqage);
        if(sls!=null)
        {
            System.out.print(sls.getId()+"#"+sls.getName());
    
        }
        else{
            System.out.print("null");
        }
        if (count > 0) 
        {
            System.out.println(count);
        } 
        else 
        {
            System.out.println("No employee found for the given age");
        }
        sc.close();
    }
}
