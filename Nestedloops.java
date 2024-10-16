import java.util.Scanner;

public class Nestedloops {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        

        String symbol =  " ";

        System.out.println("Enter the amount of rows :");
        System.out.println("Enter the amount of columns :");
        System.out.println("Enter the symbol  :");
        
        int rows = input.nextInt();
        int columns = input.nextInt();
        symbol = input.next();


        for (int i =1 ; i<=rows;i++ ){
            System.out.println();
            for(int j = 1  ; j<=columns ; j++){
                System.out.print(symbol);
            }
        }
    }
}
