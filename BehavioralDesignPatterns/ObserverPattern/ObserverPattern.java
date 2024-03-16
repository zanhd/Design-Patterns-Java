import Observers.ObserverAppOne;
import Observers.ObserverAppTwo;
import Subject.Database;

public class ObserverPattern {
    public static void main(String[] args) {
        Database db = Database.getInstance();
        ObserverAppOne oneApp = new ObserverAppOne();
        ObserverAppTwo twoApp = new ObserverAppTwo();

        //subscribeToDatabase
        oneApp.subscribeToDatabase();
        twoApp.subscribeToDatabase();

        //updating the data into database
        db.setData(10);
        System.out.println("Database data : " + db.getData());

        //data is updated into both-Apps using observer pattern
        System.out.println("oneApp data : " + oneApp.getData());
        System.out.println("twoApp data : " + twoApp.getData());
    }
}