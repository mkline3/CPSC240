/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Matt
 */
public class Bundle implements LineItem{
    private ArrayList<LineItem> items;
    public Bundle(){
       items = new ArrayList<LineItem>();
    }
    public void add(LineItem item){
        items.add(item);
    }
    public double getPrice(){
        double price  = 0;
        for(LineItem item: items)
            price += item.getPrice();
        return price;
    }
    public String toString(){
        String description = "Bundle: ";
        for(int i = 0; i<items.size();i++){
            if(i>0)
                description +=", ";
            description+= items.get(i).toString();
        }
        return description;
    }
}
