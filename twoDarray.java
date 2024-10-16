public class twoDarray {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // int rows = 2;
        // int columns = 3;
        String [][] cars = new String[2][3];
        cars [0][0] = "bmw1";
        cars [0][1] = "bmw2";
        cars [0][2] = "bmw3";
        cars [1][0] = "bmw4";
        cars [1][1] = "bmw5";
        cars [1][2] = "bmw6";

        // for(int i =0 ; i< rows;i++ ){
        //     for(int j = 0 ; j<columns ; j++){       one way
        //         System.out.print(cars[i][j]+",");
        //     }
        //     System.out.println();
        // }

        
        for(int i =0 ; i< cars.length;i++ ){ 
            for(int j = 0 ; j<cars[i].length ; j++){
                System.out.print(cars[i][j]+",");
            }
            System.out.println();
        }


    }
}
