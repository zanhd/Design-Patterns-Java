package Observers;

import Subject.Database;

public class ObserverAppOne implements Observer{
    private int data;

    public ObserverAppOne() {
        this.data = Database.getInstance().getData();
    }

    public void subscribeToDatabase() {
        Database.getInstance().subscribe(this);
        System.out.println("Application-One Subscribe to Database: Success");
    }

    public int getData() {
        return this.data;
    }

    @Override
    public void update() {
        this.data = Database.getInstance().getData();
        System.out.println("Application One Update : Success");
    }
}
