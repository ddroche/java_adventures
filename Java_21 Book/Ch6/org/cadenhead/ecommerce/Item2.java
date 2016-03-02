package org.cadenhead.ecommerce;

public class Item2 implements Comparable {
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private boolean noDiscount;

    Item2(String idIn, String nameIn, String retailIn, String quanIn, String discountIn) {
        id = idIn;
        name = nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(quanIn);
        noDiscount = Boolean.parseBoolean(discountIn);

        if (quantity > 400 && noDiscount == false)
            price = retail * .5D;
        else if (quantity > 200 && noDiscount == false)
            price = retail * .6D;
        else if (noDiscount == false)
            price = retail * .7D;
        else
            price = retail;
        price = Math.floor( price * 100 + .5 ) / 100;
    }

    public int compareTo(Object obj) {
        Item2 temp = (Item2)obj;
        if (this.price < temp.price)
            return 1;
        else if (this.price > temp.price)
            return -1;
        return 0;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean getDiscount() {
        return noDiscount;
    }
}