import java.util.Scanner;

public class CheckOut{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double price=0;
        double totalCost=0;

        do
        {
            price=SafeInput.getRangedDouble(in, "Enter price of the item between .50 cents to $9.99 dollars", 0.005, 9.99);
            totalCost+=price;

        }while(SafeInput.getYNConfirm(in, "Do you want enter another price? (y/n)"));

        System.out.printf("\nTotal cost of the items is $%.2f%n", totalCost);
    }

}