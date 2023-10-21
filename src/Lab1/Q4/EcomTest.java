package Lab1.Q4;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class EcomTest {
    public static void main(String[] args) {
        boolean in_order = true;
        int orderID = 1;
        int itemID = 1;
        Scanner input = new Scanner(System.in);
        List<Order> orders = new ArrayList<>();

        while (in_order) {
            boolean adding_item = true;
            Order order = new Order(orderID);
            Random rand = new Random();

            while (adding_item) {
                System.out.print("Enter item name: ");
                String itemName = input.nextLine();

                double price = rand.nextDouble() * 20; // Generate random price between 0 and 19 $

                Item newItem = new Item(itemID, itemName, price);
                order.addItem(newItem);
                itemID++;

                System.out.print("Do you want to order another item? (yes/no): ");
                String continueOrder = input.nextLine().toLowerCase();
                if (continueOrder.equals("no")) {
                    adding_item = false;
                }

            }

            orders.add(order);
            orderID++;

            System.out.print("Do you want to place another order? (yes/no): ");
            String continueOrdering = input.nextLine().toLowerCase();
            if (continueOrdering.equals("no")) {
                in_order = false;
            }
        }

        System.out.println("Your current Order List:");
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getID());
            List<Item> items = order.getItems();
            for (Item item : items) {
                System.out.println("Item id: " + item.getID());
                System.out.println("Item Name: " + item.getName());
                System.out.printf("Item Price: $%.2f%n",item.getPrice());
                System.out.println("--------------------");
            }
            double avgCost = order.calculateAverageCost();
            System.out.printf("Average Cost: $%.2f%n", avgCost);
            System.out.println("--------------------");
        }
    }
}