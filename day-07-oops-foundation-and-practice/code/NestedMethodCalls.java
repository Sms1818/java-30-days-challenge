// Nested Method Calls
public class NestedMethodCalls {
    public static int square(int n){
        System.out.println("Square of "+n+" is "+(n*n));
        return n*n;
    }
    public static int add(int x, int y){
        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));
        return x+y;
    }
    public static void main(String[] args) {
        add(square(5),square(6));
        
    }
}
