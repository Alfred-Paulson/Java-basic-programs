public class operators {
    public static void main(String[] args) {
        
        // &&(And ) = both conditions should be true 
        // || = (or) either conditions must be true 
        // ! = (not) reverse boolean   VALUE OF conditions

        int temp = 30;

        if (temp>= 20  && temp <=30){
            System.out.println("its  a fine temperature ");
        }
        else if (temp > 30 || temp < 20){
            System.out.println("its bad");

        }
    }
}
