package org.cadenhead.ecommerce;

import java.util.*;

public class Storefront2 {
    private LinkedList catalog = new LinkedList();

    public void addItem2(String id, String name, String price, String quant, String noDiscount) {

        Item2 it = new Item2(id, name, price, quant, noDiscount);
        catalog.add(it);
    }

    public Item2 getItem(int i) {
        return (Item2)catalog.get(i);
    }

    public int getSize() {
        return catalog.size();
    }

    public void sort() {
        Collections.sort(catalog);
    }
}