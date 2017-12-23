/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class DiscountedItem implements LineItem{
    private LineItem item;
    private double discount;
    public DiscountedItem(LineItem item, double discount){
        this.item = item;
        this.discount = discount;
    }
    public double getPrice(){
        return item.getPrice()*(1-discount/100);
    }
    public String toString(){
        return item.toString() + " (Discount " + discount +"%)";
    }
}
