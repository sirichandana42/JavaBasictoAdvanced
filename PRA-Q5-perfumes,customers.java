/*

1. Perfume

Attributes:

perfumeId (Integer): Unique identifier for the perfume.

brand (String): The brand name of the perfume.

price (Double): The price of the perfume.

fragrance (String): The fragrance type of the perfume.


Methods:

getPerfumeId(): Returns the perfume's unique identifier.

getBrand(): Returns the perfume's brand.

getPrice(): Returns the price of the perfume.

getFragrance(): Returns the fragrance type of the perfume.




2. Customer

Attributes:

customerId (Integer): Unique identifier for the customer.

name (String): The name of the customer.

age (Integer): The age of the customer.

gender (String): The gender of the customer.

perfumes (ArrayList<Perfume>): List of perfumes owned by the customer.


Methods:

getCustomerId(): Returns the customer's unique identifier.

getName(): Returns the customer's name.

getAge(): Returns the customer's age.

getGender(): Returns the customer's gender.

getPerfumes(): Returns the list of perfumes owned by the customer.






---

Task:

You are required to implement the following methods:

1. findCustomersWithPerfumeBrand

Input:

A list of Customer objects.

A string representing the perfume brand to search for (reqPerfumeBrand).


Output:

A list of Customer objects who own at least one perfume of the specified brand.

If no customers are found, print the message "No matching customers found."



2. calculateTotalExpenditure

Input:

A list of Customer objects.


Output:

A Double representing the total expenditure of all customers on perfumes. This is calculated by summing up the prices of all perfumes owned by the customers.




---

Sample Input:

2
1
Alice
30
Female
2
101
Chanel
150.0
Floral
103
Gucci
180.0
Woody
2
Bob
35
Male
2
102
Dior
200.0
Citrus
104
Chanel
220.0
Oriental
Chanel

Sample Output:

Alice
Bob
Total expenditure on perfumes: $750.00

*/
import java.util.*;

class Perfume {
    private int perfumeId;
    private String brand;
    private double price;
    private String fragrance;

    public Perfume(int perfumeId, String brand, double price, String fragrance) {
        this.perfumeId = perfumeId;
        this.brand = brand;
        this.price = price;
        this.fragrance = fragrance;
    }

    public int getPerfumeId() {
        return this.perfumeId;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }

    public String getFragrance() {
        return this.fragrance;
    }
}

class Customer {
    private int customerId;
    private String name;
    private int age;
    private String gender;
    private ArrayList<Perfume> perfumes;

    public Customer(int customerId, String name, int age, String gender, ArrayList<Perfume> perfumes) {
        this.customerId = customerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.perfumes = perfumes;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public ArrayList<Perfume> getPerfumes() {
        return this.perfumes;
    }
}

public class Solution {

    // Method to find customers with a specific perfume brand
    public static ArrayList<Customer> findCustomersWithPerfumeBrand(ArrayList<Customer> customers, String reqPerfumeBrand) {
        ArrayList<Customer> matchingCustomers = new ArrayList<>();

        // Loop through customers
        for (Customer customer : customers) {
            // Loop through perfumes of each customer
            for (Perfume perfume : customer.getPerfumes()) {
                if (perfume.getBrand().equalsIgnoreCase(reqPerfumeBrand)) {
                    matchingCustomers.add(customer);
                    break; // Once a match is found, no need to check further perfumes for this customer
                }
            }
        }

        if (matchingCustomers.isEmpty()) {
            System.out.println("No matching customers found.");
        }

        return matchingCustomers;
    }

    // Method to calculate total expenditure of all customers
    public static double calculateTotalExpenditure(ArrayList<Customer> customers) {
        double totalExpenditure = 0.0;

        // Loop through customers and calculate total expenditure
        for (Customer customer : customers) {
            for (Perfume perfume : customer.getPerfumes()) {
                totalExpenditure += perfume.getPrice();
            }
        }

        return totalExpenditure;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating some customer and perfume objects directly

        // Create Perfume objects for Customer 1
        Perfume perfume1 = new Perfume(101, "Chanel", 150.0, "Floral");
        Perfume perfume2 = new Perfume(102, "Gucci", 180.0, "Woody");

        // Create Customer 1 object
        ArrayList<Perfume> perfumes1 = new ArrayList<>(Arrays.asList(perfume1, perfume2));
        Customer customer1 = new Customer(1, "Alice", 30, "Female", perfumes1);

        // Create Perfume objects for Customer 2
        Perfume perfume3 = new Perfume(103, "Dior", 200.0, "Citrus");
        Perfume perfume4 = new Perfume(104, "Chanel", 220.0, "Oriental");

        // Create Customer 2 object
        ArrayList<Perfume> perfumes2 = new ArrayList<>(Arrays.asList(perfume3, perfume4));
        Customer customer2 = new Customer(2, "Bob", 35, "Male", perfumes2);

        // Add customers to the list
        ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(customer1, customer2));

        // Request a perfume brand to search for
        String reqPerfumeBrand = sc.nextLine();

        // Find customers with the requested perfume brand
        ArrayList<Customer> result = findCustomersWithPerfumeBrand(customers, reqPerfumeBrand);
        for (Customer customer : result) {
            System.out.println(customer.getName());
        }

        // Calculate total expenditure on perfumes
        double totalExpenditure = calculateTotalExpenditure(customers);
        System.out.printf("Total expenditure on perfumes: $%.2f%n", totalExpenditure);

        sc.close();
    }
}
