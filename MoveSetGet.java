// Generate the move sets to be used
// Currently set to 5 permutations from starting position

import java.lang.Math;
import java.io.*;
public class MoveSetGet
{
    public MoveSetGet() 
    {
        
    }
    
    public static char convert(int value)
    {
        char[] moveSet = {'f', 'F', 'l', 'L', 'r', 'R', 'u', 'U', 'd', 'D',
             'b', 'B'};
        return moveSet[value];
    }
    
    public static void Main()
    {
        File file = new File(""); // Enter a file location       
        try 
        {
          PrintWriter writer = new PrintWriter(file); 
          
          int i = 0; // counter for permutations
            String attempt = "";
            int copy;
            while (i < Math.pow(12, 5))
            {
                copy = i;
                attempt = "";
                while (copy != 0)
                {
                    attempt += convert(copy % 12);
                    copy /= 12;
                }
                attempt += ',';
                writer.println(attempt);
                i++;
            }
            
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong.");
        }       
    }
}
