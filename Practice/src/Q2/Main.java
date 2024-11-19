package Q2;

import ISP.fix.Scan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // create menu
        MenuItem food1 = new Food("Pasta", 12.99, true, true);
        MenuItem drink1 = new Drink("Coke", 1.99, true, false);
        MenuItem dessert1 = new Dessert("Ice cream", 5.49, true);

        // get customer
        System.out.println("Enter customer name: ");
        String customerId = scanner.nextLine();
        // dine in or takeout
        System.out.println("Ender order type Dine-in/takeout: ");
        String orderType = scanner.nextLine().toLowerCase();
        //order

        Order order;
        if(orderType.equals("dine-in")){
            order = new DineInOrder("ORD123", customerId);
        } else if (orderType.equals("takeout")) {
            order = new TakeoutOrder("ORD134", customerId);
        }else {
            System.out.println("Invalid order type");
            scanner.close();
            return;
        }

        order.addItem(food1);
        order.addItem(drink1);

        if (orderType.equals("dine-in")){
            order.addItem(dessert1);
        }else {
            order.addItem(dessert1);
        }

        // cost
        Double totalAmount = order.calculateTotal();
        order.processOrder();
        System.out.println("total amount: "+totalAmount);
        //payment
        System.out.println("Enter payment method credit/debit");
        String paymentMethodType = scanner.nextLine().toLowerCase();

        PaymentMethod paymentMethod;
        if (paymentMethodType.equals("credit")){
            paymentMethod = new CreditCardPayment();
        } else{
            System.out.println("Invalid payment method");
            scanner.close();
            return;
        }
        boolean paymentSuccess = paymentMethod.processPayment(totalAmount);
        //notification
        if(paymentSuccess){
            NotificationService notificationService = new EmailNotification();
            notificationService.sendNotification(customerId, "your order has been process successfully");
        }else {
            System.out.println("payment failed, please try again");
        }
        scanner.close();
    }
}
