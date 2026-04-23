class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}

class BillPughSingleton {
    private BillPughSingleton() {}

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

enum EnumSingleton {
    INSTANCE;

    public void showMessage() {
        System.out.println("Singleton using Enum");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {
        DoubleCheckedSingleton d1 = DoubleCheckedSingleton.getInstance();
        DoubleCheckedSingleton d2 = DoubleCheckedSingleton.getInstance();
        System.out.println(d1 == d2);

        BillPughSingleton b1 = BillPughSingleton.getInstance();
        BillPughSingleton b2 = BillPughSingleton.getInstance();
        System.out.println(b1 == b2);

        EnumSingleton e1 = EnumSingleton.INSTANCE;
        EnumSingleton e2 = EnumSingleton.INSTANCE;
        System.out.println(e1 == e2);
        e1.showMessage();
    }
}