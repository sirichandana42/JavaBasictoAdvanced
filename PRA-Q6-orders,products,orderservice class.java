/*You are tasked with creating a system to manage orders and products. The system will consist of two primary classes: Orders and OrdersService.

The Orders class represents an individual order. Each order will have the following attributes:

orderId (int): A unique identifier for the order.
orderName (String): The name of the order.
noOfProducts (int): The number of products included in the order.
products (List of Strings): A list containing the names of the products in the order.
quantities (List of Integers): A list of quantities corresponding to each product.
You need to implement the getters, setters, and a constructor for the Orders class.

In addition to the Orders class, you will implement an OrdersService class that provides two non-static methods:

Find the Product with Maximum Quantity: This method calculates and returns the product with the maximum quantity for a specified order. It should accept an integer parameter orderId, search for the order, and find the product with the highest quantity. If the specified order does not exist or has no associated products, the method should print "Order Id Not Found" and return null.

Find Orders by Product Name: This method retrieves all order details containing a specific product. It should accept a string parameter productName and search for all orders that include the given product (case-insensitive). The method should return a list of orders containing only the orderId and orderName attributes. If no orders are found for the specified product, the method should throw a custom exception called ProductNotFoundException with the message "Product Not Found."

Finally, implement a OrdersTester class to handle input and output. In this class, you will:

Accept the list of orders and products as input.
Call the methods in the OrdersService class and display the results.
Ensure all comparisons for product names are case-insensitive. Use the sample input and output format below to validate your solution.

Sample Input/Output:
Sample Input 1:

mathematica
Copy code
2
101
Order1
2
Orange
32
Mango
11
201
Order2
1
Papaya
12
101
Orange
Sample Output 1:

mathematica
Copy code
Orange
101
Order1
Sample Input 2:

mathematica
Copy code
3
101
Order1
2
Orange
20
Mango
25
201
Order2
1
Papaya
12
301
Order3
2
Pineapple
45
Apple
60
501
Grapes
Sample Output 2:

mathematica
Copy code
Order Id Not Found
Product Not Found*/
import java.util.*;

class Orders {
    private int orderId;
    private String orderName;
    private int noOfProducts;
    private ArrayList<Products> products;

    public Orders(int orderId, String orderName, int noOfProducts, ArrayList<Products> products) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.noOfProducts = noOfProducts;
        this.products = products;
    }

    public int getorderId() {
        return orderId;
    }

    public String getorderName() {
        return orderName;
    }

    public int getnoOfProducts() {
        return noOfProducts;
    }

    public ArrayList<Products> getproducts() {
        return products;
    }
}

class Products {
    private String productnames;
    private int quantities;

    public Products(String productnames, int quantities) {
        this.productnames = productnames;
        this.quantities = quantities;
    }

    public String getproductnames() {
        return productnames;
    }

    public int getquantities() {
        return quantities;
    }
}

class OrdersService {
    private ArrayList<Orders> orderlist;

    public OrdersService(ArrayList<Orders> orderlist) {
        this.orderlist = orderlist;
    }


    public String maxquantityofaspecifiedorder(ArrayList<Orders> orders, int orderId) {
        for (Orders order : orders) {
            if (order.getorderId() == orderId) {
                Products maxProduct = null;
                int maxQuantity = 0;

                for (Products product : order.getproducts()) {
                    if (product.getquantities() > maxQuantity) {
                        maxQuantity = product.getquantities();
                        maxProduct = product;
                    }
                }

                if (maxProduct != null) {
                    System.out.println(maxProduct.getproductnames());
                    return maxProduct.getproductnames();
                }
            }
        }

        System.out.println("Order Id Not Found");
        return null;
    }

    public ArrayList<Orders> findordersbyproductname(ArrayList<Orders> orders, String productName) {
        ArrayList<Orders> filteredorders = new ArrayList<>();

        for (Orders order : orders) {
            for (Products product : order.getproducts()) {
                if (product.getproductnames().equalsIgnoreCase(productName)) {
                    filteredorders.add(order);
                    break;
                }
            }
        }

        if (filteredorders.isEmpty()) {
            System.out.println("Product Not Found");
        } else {
            for (Orders order : filteredorders) {
                System.out.println(order.getorderId());
                System.out.println(order.getorderName());
            }
        }

        return filteredorders;
    }
}

public class OrdersTester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int noOfOrders = sc.nextInt();
        sc.nextLine();
        ArrayList<Orders> orders = new ArrayList<>();

        for (int i = 0; i < noOfOrders; i++) {
            int orderId = sc.nextInt();
            sc.nextLine();
            String orderName = sc.nextLine();
            int noOfProducts = sc.nextInt();
            sc.nextLine();

            ArrayList<Products> products = new ArrayList<>();
            for (int j = 0; j < noOfProducts; j++) {
                String productNames = sc.nextLine();
                int quantities = sc.nextInt();
                sc.nextLine();
                products.add(new Products(productNames, quantities));
            }

            orders.add(new Orders(orderId, orderName, noOfProducts, products));
        }

        int reqOrderId = sc.nextInt();
        sc.nextLine();
        String reqProductName = sc.nextLine();

        OrdersService os = new OrdersService(orders);
        os.maxquantityofaspecifiedorder(orders, reqOrderId);
        os.findordersbyproductname(orders, reqProductName);

        sc.close();
    }
}
