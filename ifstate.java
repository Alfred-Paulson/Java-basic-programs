
import java.util.Scanner;

public class ifstate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        if (age >= 18){
            System.out.println("you are  an a adult");
        }
        else if (age >= 15){
            System.out.println("You are okay");
        }
        else{
            System.out.println("you  are  not  an adult");
        }
        input.close();
    }   
}
