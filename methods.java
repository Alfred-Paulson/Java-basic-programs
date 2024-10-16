public class methods {

    static void hello(String name){
        System.out.println("My name is "+name);
    }

    private static  int add(int x,int y ){
        int z = x+y;
        return z;
    }
    public static void main(String[] args) {
        // String name = "Alfred";
        hello("alfred");

        int v = add(12, 15);
        System.out.println(v);
    }
}
