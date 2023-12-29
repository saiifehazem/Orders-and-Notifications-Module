package com.OrdersandNotificationsManagement.demo.Model;

import java.util.ArrayList;

public class CompoundOrder implements Order {
    double totalPrice = 0;


    public int id = 1000;
    public static int idCounter = 1000;
    public double ShippingTax = 0;


    public CompoundOrder() {
        id = ++idCounter;
    }



    private ArrayList<SimpleOrder> orders = new ArrayList<>();

    public ArrayList<SimpleOrder> getOrders() {
        return orders;
    }

    public void addOrder(SimpleOrder order) {
        orders.add(order);
    }

    public void removeOrder(SimpleOrder order) {
        orders.remove(order);
    }

    public Integer getID() {
        return id;
    }



    public double calcPrice() {
        for (SimpleOrder order : orders) {
            order.SetShippingTax(0.05);
            order.calcPrice();
            totalPrice += order.getTotalPrice();
        }
        return totalPrice;
    }

    public void SetShippingTax(double val)
    {
        ShippingTax = val;
    }
}