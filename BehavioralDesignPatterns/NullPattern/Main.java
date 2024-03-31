public class Main {
    public static void main(String[] args) {
        // Object exists
        MyObject obj1 = new RealObject();
        obj1.doSomething(); // Outputs: Doing something...

        // Object doesn't exist
        MyObject obj2 = new NullObject();
        obj2.doSomething(); // Outputs: Object is null. Doing nothing...
    }
}
