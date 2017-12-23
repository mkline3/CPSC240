
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class Threshold {
    public ArrayList<String> SubStrings ;
    ArrayList<String> sub1;
    ArrayList<String> sub2;
    public Threshold(int threshold, String string1, String string2){
        String s1 = string1.toLowerCase();
        String s2 = string2.toLowerCase();
        SubStrings = new ArrayList<>();
         sub1 = new ArrayList<>();
         sub2 = new ArrayList<>();
        String Sub1 = s1;
        int g = 1;
        while(threshold-1 <Sub1.length()){
            
        sub1.add(Sub1.substring(0,threshold));
        Sub1 = s1.substring(g,s1.length());
        g++;
        }
        String Sub2 = s2;
        int k = 1;
        while(threshold-1 <Sub2.length()){
            
        sub2.add(Sub2.substring(0,threshold));
        Sub2 = s2.substring(k,s2.length());
        k++;
        }
        int i = 0;
        //System.out.println(sub1.size());
        while( i<sub1.size()){
            int j = 0;
           // System.out.println(sub1.get(i));
            while( j<sub2.size()){
               // System.out.println(sub2.get(j));
                if(sub1.get(i).equals(sub2.get(j))){
                    SubStrings.add(sub1.get(i));
                }
                j++;
            }
            i++;
        }
    }

    /**
     *
     * @return
     */
      String execute(){
        if(SubStrings.isEmpty()){
            return ("There are no common substrings in the Strings you provided");
        }
        else{
            String sub ="";
            for(int i = 0; i<SubStrings.size();i++){
                if(i<1){
                    sub+= SubStrings.get(i);
                }
                else{
                    sub+=", " +SubStrings.get(i);
                }
            }
            return "The substrings shared are: " +sub;
        }
    }
    

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the size you want substrings to be: ");
        int a = in.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("Enter your first String: ");
        String b = in2.nextLine();
        
        System.out.println("Enter your second String: ");
        String c = in2.nextLine();
        
        
        
        Threshold d = new Threshold(a,b,c);
       System.out.println( d.execute());
        
    }

}