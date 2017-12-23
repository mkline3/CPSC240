/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class SimpleFormatter implements InvoiceFormatter{
    private double total;
    public String formatHeader(){
        total = 0;
        return "     I N V O I C E\n\n\n";
    }
    public String formatLineItem(LineItem item){
        total += item.getPrice();
        return String.format("%s: $%.2f\n", item.toString(), item.getPrice());
    }
    public String formatFooter(){
        return String.format("\n\nTOTAL Due: $%2f\n", total);
    }
}
