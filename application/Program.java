package application;

import entities.Order;
import java.util.Date;
import java.util.Scanner;
import entities.OrderStatus;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        sc.close();
    }
}
