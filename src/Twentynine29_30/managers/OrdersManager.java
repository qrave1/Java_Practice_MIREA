package Twentynine29_30.managers;

import Twentynine29_30.items.MenuItem;
import Twentynine29_30.orders.Order;

import java.io.Serializable;

public interface OrdersManager extends Serializable {
    long serialVersionUID = 1L;

    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
