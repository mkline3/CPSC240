import java.io.*;
import java.util.List;
import java.util.ArrayList;
/**
 * <h1> List of Numbers </h1>
 * @author Matt Kline
 * @version 1.0
 * @since 2/1/17
*/



public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;
    /**
     * This method creates a list of numbers
     */

    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }
/**
 * This method runs to find any errors in the list.
 * @exception IndexOutOfBoundsException e this catches and out of bounds exception
 */
    public void writeList() {
        // The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = null;
        try{ System.out.println("Entering try statement");
        out = new PrintWriter(new FileWriter("OutFile.txt"));
        for (int i = 0; i < SIZE; i++)
            out.println("Value at: " + i + " = " + list.get(i));
                               
    } catch (IndexOutOfBoundsException e) {
        System.err.println("Caught IndexOutOfBoundsException: "
                           + e.getMessage());
                                 
    } catch (IOException e) {
        System.err.println("Caught IOException: " + e.getMessage());
 
        } finally {
        if (out != null) {
            System.out.println("Closing PrintWriter");
            out.close();
        } 
        else {
            System.out.println("PrintWriter not open");
        }
    }
    }
}

