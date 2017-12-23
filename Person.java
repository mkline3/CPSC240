/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Person {
    String swName;
    public Person(String x, String x2, String y, String y2){
        String firstName = x.substring(0,3) + x2.substring(0,2);
        String lastName = y.substring(0,2) + y2.substring(0,3);
        String a = firstName.toLowerCase();
        String b = lastName.toLowerCase();
        char a1 = a.charAt(0);
        char b1 = b.charAt(0);
        String A = ""+a1;
        String B = ""+b1;
        String A1 = A.toUpperCase();
        String B1 = B.toUpperCase();
        String fn = A1 + a.substring(1);
        String ln = B1 + b.substring(1);
        swName = fn + " " + ln;
    }
    String getName(){
        return swName;
    }
    int getVowels(){
        int x = swName.length();
        int count = x;
        for(int i = 0; i<x; i++){
            if("aeiouAEIOU".indexOf(swName.charAt(i))<0){
                count--;
        
            }
        }
        
        
        return count; 
        
    }
}
