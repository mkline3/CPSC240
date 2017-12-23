/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Matt
 */
public class practice {
   public static String[] s = {"CPSC125", "CPSC405","CPSC220","CPSC106","CPSC240","CPSC326",
        "CPSC110","CPSC430","CPSC350","CPSC491"};

   
    public static ArrayList<String> Classes = new ArrayList<>(Arrays.asList(s));
    
    public static int getLength(){
        return Classes.size();
    }
    public static String getCourse(String x){
        if(Classes.contains(x) == true)
            return (x + " Is a course listed");
        else
            return (x + " Is not a course listed");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("There are " + practice.getLength() + " courses listed");
        System.out.println("Enter a course number: ");
        String x = in.nextLine();
        System.out.println(practice.getCourse(x));
    }
}
