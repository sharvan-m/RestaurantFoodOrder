package Delivery;

import Restaurant.Restaurant;
import Restaurant.Order;

public class Delivery {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("       RESTAURANT FOOD ORDER SYSTEM");
        System.out.println("========================================");

        Restaurant restaurant = new Restaurant(
                101,
                "RKode",
                "Chennai",
                "Pizza", 250,
                "Burger", 150,
                "Pasta", 200
        );

        restaurant.displayRestaurantDetails();

        System.out.println();

        System.out.println("Restaurant ID using getter : "
                + restaurant.getRestId());

        System.out.println();

        restaurant.setName("RKode Food Corner");

        System.out.println("After changing restaurant name:");
        restaurant.displayRestaurantDetails();

        System.out.println();

        Order order = new Order(
                5001,
                "Arun",
                "Pizza",
                2,
                250
        );

        order.calculateOrderAmount();

        order.displayOrderDetails();

        System.out.println("========================================");
    }
}