
import java.util.ArrayList;

public class twoDArrayList {
    public static void main(String[] args) {
        // 2D Array list  = dyanamica list of lists 
        // you can change the size of these ists during runtime

        ArrayList <ArrayList<String>> grocerycList = new ArrayList();

        ArrayList <String> bakerylist = new ArrayList<String>();
        bakerylist.add("pizza");
        bakerylist.add("burger");
        bakerylist.add("burger meal");
        bakerylist.add("frech fries");

        ArrayList <String> produce = new ArrayList<String>();

        produce.add("tomato");
        produce.add("apple");
        produce.add("orange");
        produce.add("grapes");

        ArrayList <String> drinks = new ArrayList<String>();

        drinks.add("cola");
        drinks.add("miranda");
        drinks.add("fanta");
        drinks.add("mountain dew");

        grocerycList.add(bakerylist);
        grocerycList.add(produce);
        grocerycList.add(drinks);


        System.out.println(grocerycList.get(0));



        // System.out.println(drinks);
    }
}
