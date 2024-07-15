//command line arguments usage 
import java.util.*;
public class basiccodes
{
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No command line arguments found."); 
        }
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            try {
                int number = Integer.parseInt(args[i]);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format for argument: ");
                return;
            }
        }
        System.out.println("The sum of the provided numbers is: " + sum);
    }
}
 
