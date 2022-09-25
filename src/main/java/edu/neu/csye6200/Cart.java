package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;


public class Cart {
    private double myCash;
    private double myTotal;
    private double myChange;

    public Cart(double myCash) {
        this.myCash = myCash;
    }

    public double getMyCash() {
        return myCash;
    }

    public void setMyCash(double myCash) {
        this.myCash = myCash;
    }

    public double getMyTotal() {
        return myTotal;
    }

    public void setMyTotal(double myTotal) {
        this.myTotal = myTotal;
    }

    public double getMyChange() {
        return myChange;
    }

    public void setMyChange(double myChange) {
        this.myChange = myChange;
    }
    private List<Item> itemList=new ArrayList<Item>();



    public void sillyCheckout(double cash, double price, double total, double change) {

        myTotal=total+price;
        myChange=myCash-myTotal;

    }
    public double Checkout(Cart myCart, Item myItem) {

        myTotal=myTotal+ myItem.getPrice();
        myChange=myCart.getMyCash()-myTotal;
        itemList.add(myItem);

        return myChange;

    }


}

