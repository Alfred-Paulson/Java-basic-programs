public class stringmethods {
    public static void main(String[] args) {
        String name  = "Alfred";

        // boolean result =  name.equals("Alfred paulson");
        // System.out.println(result);

        // int result = name.length();
        // System.out.println(result);

        // // char result = name.charAt(0);
        // for (int i =0 ; i<name.length();i++){
        //     char result = name.charAt(i);
        //     System.out.println(result);
        // }
        // System.out.println(result);

        // int result = name.indexOf("r");
        // System.out.println(result);

        for (int i =0;i<name.length();i++){
            char letters = name.charAt(i);
            int indexNo = name.indexOf(letters);
            System.out.println(indexNo);
            String upper_case = name.toUpperCase();
            System.out.println(upper_case);
        }
        String upper_case = name.toUpperCase();
        System.out.println(upper_case);
        String lower_case = name.toLowerCase();
        System.out.println(lower_case);

        String replace = name.replace("r", "e");
        System.out.println(replace);

        Boolean a = true;

        boolean b =false;

        if (a==true){
            int result = 110+10;
            System.out.println(result);
        }
         if (b == false){
            int result = 10-5;
            System.out.println(result);
        }




    }
}
