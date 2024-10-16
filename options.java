
import java.util.Scanner;

public class options {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("1.option one");
        System.out.println("2.option two ");
        System.out.println("3.Exit");
        while(true){
        System.out.print("Enter a choice :");
        int choice = input.nextInt();

        switch(choice){
            case 1:
            System.out.println("Option one ");
            break;

            case 2:
            System.out.println("option two");
                break;

            case 3:
                System.out.println("Exiting ....");
                System.exit(0);
                break;

            default:
            System.out.println("error");
        }
    }
}
}
