// Method Chaining
public class MethodChain {
    public static void A(){
        System.out.println("Inside A");
        B();
    }
    public static void B(){
        System.out.println("Inside B");
        C();
    }
    public static void C(){
        System.out.println("Inside C");
    }
    public static void main(String[] args) {
        A();
    }
}
