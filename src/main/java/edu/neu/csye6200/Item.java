package edu.neu.csye6200;
import java.util.ArrayList;
import java.util.List;


public class Item {

    private String Itemname;
    private double price;
    private static double cash=20;
    private static double change;
    private static double totalcartvalue;
    public Item(String Itemname, double price) {

        this.Itemname = Itemname;
        this.price = price;
    }
    public String getItemname() {
        return Itemname;
    }
    public void setItemname(String Itemname) {
        this.Itemname = Itemname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        Item.cash = cash;
    }
    public double getChange() {
        return change;
    }
    public void setChange(double change) {
        this.change = change;
    }
    public double getTotalcartvalue() {
        return totalcartvalue;
    }
    public void setTotalcartvalue(double totalcartvalue) {
        this.totalcartvalue = totalcartvalue;
    }

    @Override
    public String toString() {
        return "Item [Itemname=" + Itemname + ", price=" + price + "]";
    }
    public static void demo() {

        Item butter = new Item("butter",5);
        Item bread = new Item("bread",6);


        List<Item> itemlist=new ArrayList<Item>();
        itemlist.add(butter);
        itemlist.add(bread);
        //itemlist.add(milk);

        totalcartvalue=butter.getPrice();
        totalcartvalue+=bread.getPrice();


        change=cash-totalcartvalue;
        int i=1;
        for(Item items: itemlist)
        {
            System.out.printf("%d. %s %.2f ",i,items.getItemname(),items.getPrice());
            i++;
        }
        System.out.printf("\nTotal Cash is %.2f" , cash);
        System.out.printf("\nTotal Cost: %.2f", totalcartvalue);
        System.out.printf("\nChange received: $%.2f \n",change);
    }

}
