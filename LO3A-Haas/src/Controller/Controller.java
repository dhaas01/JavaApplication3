package Controller;

import Model.Model;
import View.View;

//Retrieve data from Model using method String getData(int n)and pass it to View. 
//n=1 is the first person, n=2 is the second person, etc.
//Also tries to get data from an inexistent object (n=6) and will receive a string with an
//error message.
//Passes error message to View to be displayed.
//pass data from each Person at a time to View, which will display it
public class Controller
{
    Model model;
    View view;

    public Controller(View v, Model m)
    {
        model = m;
        view = v;

        //gets data from model and passes it to view
        view.basicDisplay(model.getMembers().get(1).getAttributeName(3)+"\n");
        view.basicDisplay(model.getMembers().get(1).getAttribute(3)+"\n");
        view.basicDisplay(model.getMembers().get(1).getAttributeNames());
        view.basicDisplay(model.getMembers().get(1).getAttributes());
        view.basicDisplay("size of names=" + model.getMembers().get(1).getAttributeNames().size()+"\n");
        view.basicDisplay("size of attributes=" + model.getMembers().get(1).getAttributes().size());
    }

}
