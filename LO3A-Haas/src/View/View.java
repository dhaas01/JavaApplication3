package View;
import java.util.ArrayList;

//Display info about the 5 person objects. Gets info from Controller.
//Also gets error message from Controller.
public class View
{
    
    public View()
    {
        
    }
    
    // Display data from each object.
    //Just needs to display text data it receives from Controller.
    public void basicDisplay(String s) 
    { 
        System.out.print(s);
    }
    
    public void basicDisplay(ArrayList<String> arr)
    {
        for (int i = 0; i < arr.size(); i++) 
        { 
        System.out.print(arr.get(i));
        }
        System.out.print("\n");
    }
}
