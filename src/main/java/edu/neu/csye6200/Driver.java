package edu.neu.csye6200;

import javax.swing.JOptionPane;

/**
 * @author SaiAkhil
 */
public class Driver {
    public static void main(String[] args) {
        System.out.println("============Main Execution Start===================\n\n");

        //Add your code in between these two print statements
        double mychange;
        Item.demo();
        Cart sillyCart=new Cart(20);

        Item butter= new Item("butter", 5 );
        Item bread= new Item("bread", 6);


        sillyCart.sillyCheckout(sillyCart.getMyCash(), butter.getPrice(), sillyCart.getMyTotal(),sillyCart.getMyChange());
        sillyCart.sillyCheckout(sillyCart.getMyCash(), bread.getPrice(), sillyCart.getMyTotal(),sillyCart.getMyChange());



        StringBuilder sb = new StringBuilder("\nSilly cart Items:\n");
        sb.append("\n\t").append(butter.toString()).append("\n\t").append(bread).append("\n\t");

        System.out.println(sb.toString());

        System.out.printf("Cash: $%.2f \n",sillyCart.getMyCash());
        System.out.printf("Total: $%.2f \n",sillyCart.getMyTotal());
        System.out.printf("Change received from Silly Cart : $%.2f \n",sillyCart.getMyChange());




        Cart checkout=new Cart(20);

        Item veggies= new Item("veggies", 8 );
        Item fruits= new Item("fruits", 6);

        mychange = checkout.Checkout(checkout,veggies);
        mychange =  checkout.Checkout(checkout,fruits);


        StringBuilder sb1 = new StringBuilder("\n Cart Checkout Items:\n");
        sb1.append("\n\t").append(veggies.toString()).append("\n\t").append(fruits).append("\n\t");

        System.out.println(sb1.toString());

        System.out.printf("Cash: $%.2f \n",checkout.getMyCash());
        System.out.printf("Total: $%.2f \n",checkout.getMyTotal());
        System.out.printf("Change received from checkout : $%.2f \n",checkout.getMyChange());


        System.out.println("\n\n============Main Execution End===================");
    }
}
