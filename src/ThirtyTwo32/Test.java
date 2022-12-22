package ThirtyTwo32;

import Twentynine29_30.extensions.OrderAlreadyAddedException;
import Twentynine29_30.items.Dish;
import Twentynine29_30.items.Drink;
import Twentynine29_30.items.DrinkTypeEnum;
import Twentynine29_30.items.MenuItem;
import Twentynine29_30.managers.InternetOrdersManager;
import Twentynine29_30.orders.InternetOrder;
import Twentynine29_30.orders.Order;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class Test {
    private static List<MenuItem> items;
    private static Order order;
    private static InternetOrdersManager ordersManager;
    private static final String filename = "C:\\Users\\livea\\IdeaProjects\\Java_Practice_MIREA\\src\\ThirtyTwo32\\data";

    public static void main(String[] args) throws OrderAlreadyAddedException {
        if (!readFromFile()) {
            System.out.println("Initializing");
            items = List.of(
                    new Drink(300, "Wine", "Red European Wine", 13, DrinkTypeEnum.WINE),
                    new Dish(400, "Cheeseburger", "Cheeseburger"),
                    new Drink(300, "Whiskey", "Jack Daniels", 20, DrinkTypeEnum.WHISKEY),
                    new Dish(1000, "Fish", "Fish")
            );
            order = new InternetOrder();
            ordersManager = new InternetOrdersManager();
        }

        for (var i : items) {
            order.add(i);
            System.out.println(i);
        }

        ordersManager.add(order);

        writeToFile();
    }

    public static boolean readFromFile() {
        try (
                ObjectInputStream input = new ObjectInputStream(new FileInputStream(filename))
        ) {
            items = (List<MenuItem>) input.readObject();
            order = (Order) input.readObject();
            ordersManager = (InternetOrdersManager) input.readObject();
        } catch (Exception e) {
            return false;
        }

        return items != null;
    }

    public static boolean writeToFile() {
        try (
                ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(filename))
        ) {
            output.writeObject(items);
            output.writeObject(order);
            output.writeObject(ordersManager);
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
