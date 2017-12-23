
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * This will read a file and then print the number of times a,b, and c appear in the file.
 * 
 * @author Matt Kline
 */


public class CountLetter
{
    // fields

    /**
     * Constructor for objects of class CountLetter
     */
    public CountLetter()
    {

    }

    /**
     * This main method runs the program
     * a will store the number of times a appears
     * b will store the number of times b appears
     * and c will store the number of times c appears
     * @param args
     */
    public static void main(String[] args)
    {
       String filename = "write_in_c.txt";
        int a=0;
        int b=0;
        int c=0;
        try {
            FileReader reader = new FileReader(filename);
            
            BufferedReader in = new BufferedReader(reader);
            String line = in.readLine();
            while(line!=null){
             String[]countA= line.split("a");
             a = a+ countA.length;
             String[]countB = line.split("b");
             b = b+ countB.length;
             String[]countC = line.split("c");
             c = c+ countC.length;
             line = in.readLine();
            }
            in.close();
            
            
        } catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" +  filename + "'");                
        }catch(IOException e){
            
        }
        System.out.println(a+","+b+","+c);
        File inputfile = new File("outputCounting.txt");
        
        try{
            FileWriter fileWriter = new FileWriter(inputfile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("There were " +a+ " a's in the file.");
            bufferedWriter.newLine();
            bufferedWriter.write("There were " +b+ " b's in the file.");
            bufferedWriter.newLine();
            bufferedWriter.write("There were " +c+ " c's in the file.");
            bufferedWriter.close();
        }catch(IOException ex){
            System.out.println("unable to write to file: " + inputfile);
        }
    } 
    }

