
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name =   " ";

        while(name.isBlank()){
            System.out.println("Enter ur name :");
            name = input.next();

        }
        System.out.println("Hello "+name);
    }
}
