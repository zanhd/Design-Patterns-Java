import Model.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();

        System.out.println(instanceOne == instanceTwo); // Output: true
    }
}