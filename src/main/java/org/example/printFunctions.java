package org.example;

public class printFunctions {
    public void printFunction(){
        GetItems i = new GetItems();
        CalulateItems c = new CalulateItems();
        double item1 = i.getItem1();
        int getItem1 = i.getQuantityOfItem1();
        double item2 = i.getItem2();
        int getItem2 = i.getQuantityOfItem2();
        double item3 = i.getItem3();
        int getItem3 = i.getQuantityOfItem3();
        double one = c.itemPrice(item1, getItem1);
        double two = c.itemPrice(item2, getItem2);
        double three = c.itemPrice(item3, getItem3);
        double itemSubTotal = c.itemSubTotal(one, two, three);
        System.out.println("Subtotal: " + itemSubTotal);
        double itemTax = c.itemTax(itemSubTotal);
        System.out.println("Tax: " + itemTax);
        double total = c.total(itemSubTotal, itemTax);
        System.out.println("Total: " + total);
    }

}
