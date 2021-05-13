package Model;
import java.util.ArrayList;

//it uses encapsulation

//it needs an updated method, loadData( ), to load the data, now using an ArrayList to store the 5 TableMember objects
//it needs a method, ArrayList<String> getData(), which overloads String getData(int n) and returns an ArrayList of String with one big String for each TableMember object in the array
public class Model
{
    // Creates the ArrayList<FootballPlayer> attribute
    private ArrayList<TableMember> members = new ArrayList();
    
    // Calls loadData()
    public Model()
    {    
        loadData();
    }

    public void loadData()
    {
        // Creates the 5 FootballPlayer objects with a height attribute.
        members.add(new FootballPlayer("Marcus Allen", new Height(5, 2), 200, "Upper Malboro, Md.", "Dr. Henry A. Wise, Jr.", 2, "S"));
        members.add(new FootballPlayer("Kyle Alston", new Height (5, 9), 180, "Robbinsville, N.J.", "Robbinsville", 37, "CB"));
        members.add(new FootballPlayer("Troy Apke", new Height (6, 1), 220, "Mt. Lebanon, Pa.", "Mount Lebanon", 28, "S"));
        members.add(new FootballPlayer("Matthew Baney", new Height (6, 0), 225, "State College, Pa.", "State College", 35, "LB"));
        members.add(new FootballPlayer());
    }

    /*Used to pass info to Controller. Returns data about a specific TableMember
        returns the result of toString for a TableMember object (from 1 to 5)
        any other value of n should return the message "invalid input parameter"*/
    
    public String getData(int n)
    {
        switch (n)
        {
            case 1:
                 return members.get(0).toString();
            case 2:
                return members.get(1).toString();
            case 3:
                return members.get(2).toString();
            case 4:
                return members.get(3).toString();
            case 5:
                return members.get(4).toString();
            default:
                return "invalid input parameter";
        }
    }
    
    public ArrayList<String>getData() 
    { 
        ArrayList<String> arr = new ArrayList();
        arr.add(getData(1));
        arr.add(getData(2));
        arr.add(getData(3));
        arr.add(getData(4));
        arr.add(getData(5));
        return arr;
    }

    /**
     * @return the members
     */
    public ArrayList<TableMember> getMembers() {
        return members;
    }

    /**
     * @param members the members to set
     */
    public void setMembers(ArrayList<TableMember> members) {
        this.members = members;
    }

    
}
