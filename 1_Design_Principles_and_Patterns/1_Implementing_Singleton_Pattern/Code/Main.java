class SingleTon {
    private static SingleTon singleTonInstance = new SingleTon();

    private SingleTon() {
        System.out.println("SingleTon Class Created.");
    }

    public static SingleTon getInstance() {
        return singleTonInstance;
    }
}
public class Main {
    public static void main(String[] args) {
        SingleTon instance1 = SingleTon.getInstance();
        SingleTon instance2 = SingleTon.getInstance();

        if(instance1 == instance2) {
            System.out.println("Both instances points to same memory.");
        }
        else {
            System.out.println("Both instance not points to same memory.");
        }
    }
}