
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Gets info from user to create names.
 * 
 * Matt Kline 
 * 1/23
 */
public class StarWarsName
{

    /**
     * Constructor for objects of class StarWarsName
     */
   static ArrayList<String> names = new ArrayList<>();
    static ArrayList<Integer> vowels = new ArrayList<>();
    public StarWarsName(int x)
    {
        Scanner in = new Scanner(System.in);
        int i;
        for( i = 0; i<x; i++){
            System.out.println("Enter person " + (i+1) + "'s First name: ");
            String f = in.nextLine();
            System.out.println("Enter person " + (i+1) + "'s Last name: ");
            String l = in.nextLine();
            
            System.out.println("what is person " + (i+1) + "'s mother's maiden name: ");
            String f2 = in.nextLine();
            System.out.println("what is person " + (i+1) + "'s birth city: ");
            String l2 = in.nextLine();
            Person P = new Person(f,l,f2,l2);
            names.add(P.getName());
            vowels.add(P.getVowels());
        }
    }
    
   public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("How many names do you want to create: ");
        int x = in.nextInt();
        StarWarsName n = new StarWarsName(x);
        int larger = vowels.get(0);
        for(int i = 0; i<vowels.size();i++){
            if(vowels.get(i)>larger)
                larger = vowels.get(i);
           
        }
        
        for(int b= 0; b<names.size(); b++){
            System.out.print("#"+(b+1)+ " ");
            if(b == vowels.indexOf(larger))
                System.out.println(names.get(b) + " The Great");
            else
                System.out.println(names.get(b));
        }
   }
    
}
