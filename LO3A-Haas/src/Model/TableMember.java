package Model;
import java.util.ArrayList;

//Creates the skeleton of the methods that FootballPlayer will need to implement
public interface TableMember
{
    public String getAttribute(int n);
    public ArrayList<String> getAttributes();
    public String getAttributeName(int n);
    public ArrayList<String> getAttributeNames();
}
