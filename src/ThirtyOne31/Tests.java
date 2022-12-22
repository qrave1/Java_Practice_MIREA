package ThirtyOne31;

import Twentynine29_30.extensions.IllegalTableNumber;
import Twentynine29_30.extensions.OrderAlreadyAddedException;
import Twentynine29_30.items.Dish;
import Twentynine29_30.items.Drink;
import Twentynine29_30.items.DrinkTypeEnum;
import Twentynine29_30.items.MenuItem;
import Twentynine29_30.managers.TableOrdersManager;
import Twentynine29_30.orders.Order;
import Twentynine29_30.orders.TableOrder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Tests {
    private static Order order;
    private static List<MenuItem> items;
    private static TableOrdersManager ordersManager;

    @BeforeAll
    public static void setup() {
        order = new TableOrder(5);
        ordersManager = new TableOrdersManager(1);
        items = List.of(
                new Drink(300, "Wine", "Red European Wine", 13, DrinkTypeEnum.WINE),
                new Dish(1000, "Fish", "Fish")
        );
    }

    @Test
    public void testTableOrder() {
        for (var i : items) {
            order.add(i);
            ordersManager.add(i, 0);
        }

        Assertions.assertEquals(2, order.itemsQuantity());
        Assertions.assertEquals(1300, order.costTotal());
        Assertions.assertThrowsExactly(OrderAlreadyAddedException.class, () -> {
           ordersManager.add(order, 0);
        });
        Assertions.assertThrowsExactly(IllegalTableNumber.class, () -> {
            ordersManager.add(order, 1);
        });
    }
}
