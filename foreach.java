
import java.util.ArrayList;

public class foreach {
    public static void main(String[] args) {
        //  for - each = good technique to loop through arrays in less steps

        // String [] names = {"alfred","ansil","devadath"};
        ArrayList <String> names = new ArrayList<String>();

        names.add("Alfred");
        names.add("Ansil");
        names.add("devadath");

        for(String i : names){
            System.out.println(i);
        }
    }
}
