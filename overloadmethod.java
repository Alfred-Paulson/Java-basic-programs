public class overloadmethod {
    // overloaded methods share the same name but have different parameters method name + parameters
    static  int add(int a,int b ){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int x =add(2, 5,7);
        System.out.println(x);
        
    }
}
