package Assignments.Assignment6.Lesson8.prob3;

import java.util.*;

public class OrderTest {
    public static void main(String[] args) {
        // a) through i) here, print after each step (use for-each)

        // Creating 5 orders
        Order o1 = new Order("12345", "Devraj", 126.98);
        Order o2 = new Order("12346", "Amit", 45.00);
        Order o3 = new Order("12347", "Ferdi", 89.99);
        Order o4 = new Order("12348", "Sara", 25.50);
        Order o5 = new Order("12349", "John", 100.00);
        Order o6 = new Order("34789", "Kyle", 87.50);
        List<Order> orders = new ArrayList<>(Arrays.asList(o1,o2,o3,o4,o5,o6));
        // Deleting an instance
        orders.remove(o4);
        // printing size of orders
        System.out.println("Size : "+orders.size());
        // Getting order by index
        System.out.println(orders.get(2));
        //updating order
        orders.set(3,new Order("36792","Harry",95.67));

        System.out.println("Orders sorted by totalAmount (ascending)");
        // sorting orders by totalAmount
        orders.sort(Comparator.comparing(Order::getTotalAmount));
        for (Order o:orders){
            System.out.println(o);
        }

        List<Order> listOrders = listMoreThan50(orders);
        System.out.println("Orders with totalAmount > 50.0, sorted by customerName:");
        listOrders.sort(Comparator.comparing(Order::getCustomerName));
        for (Order o:listOrders){
            System.out.println(o);
        }

    }

    public static List<Order> listMoreThan50(List<Order> list) {
        if(list==null) return new ArrayList<>();
        List<Order> moreThan50 = new ArrayList<>();
        for(Order order:list){
            if(order!=null){
               if(order.getTotalAmount()>50)
                {
                    moreThan50.add(order);
                }
            }
        }
        return moreThan50;
    }
}
/*
Sample Output:

SSize : 5
Order{12347, Ferdi, 89.99}
Orders sorted by totalAmount (ascending)
Order{12346, Amit, 45.0}
Order{34789, Kyle, 87.5}
Order{12347, Ferdi, 89.99}
Order{36792, Harry, 95.67}
Order{12345, Devraj, 126.98}
Orders with totalAmount > 50.0, sorted by customerName:
Order{12345, Devraj, 126.98}
Order{12347, Ferdi, 89.99}
Order{36792, Harry, 95.67}
Order{34789, Kyle, 87.5}

 */