package org.example;
import java.util.Scanner;
/**
 * Wasn't too sure on how to get all the items using one get Method
 * and one set Method without having to type different print statements for item1,
 * item2, etc...
 */
public class GetItems {
    public double getItem1(){
        System.out.println("Enter the price of item 1? ");
        Scanner p = new Scanner(System.in);
        return p.nextDouble();
    }
    public double getItem2(){
        System.out.println("Enter the price of item 2? ");
        Scanner p = new Scanner(System.in);
        return p.nextDouble();
    }
    public double getItem3(){
        System.out.println("Enter the price of item 3? ");
        Scanner p = new Scanner(System.in);
        return p.nextDouble();
    }
    public int getQuantityOfItem1(){
        System.out.println("Enter the quantity of item 1");
        Scanner q = new Scanner(System.in);
        return q.nextInt();
    }
    public int getQuantityOfItem2(){
        System.out.println("Enter the quantity of item 2");
        Scanner q = new Scanner(System.in);
        return q.nextInt();
    }
    public int getQuantityOfItem3(){
        System.out.println("Enter the quantity of item 3");
        Scanner q = new Scanner(System.in);
        return q.nextInt();
    }
}
