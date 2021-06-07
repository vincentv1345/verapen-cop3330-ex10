package org.example;

public class CalulateItems {
    public double itemPrice(double a, int b){
        return a * b;
    }
    public double itemSubTotal(double a, double b, double c){
        double subtotal = a + b + c;
        return subtotal;
    }
    public double itemTax(double a){
        return Math.round(a * 0.055);
    }
    public double total(double a, double b){
        return a + b;
    }
}
