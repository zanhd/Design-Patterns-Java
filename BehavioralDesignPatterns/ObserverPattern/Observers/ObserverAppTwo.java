package Observers;

import Subject.Database;

public class ObserverAppTwo implements Observer{
    private int data;

    public ObserverAppTwo() {
        this.data = Database.getInstance().getData();
    }

    public void subscribeToDatabase() {
        Database.getInstance().subscribe(this);
        System.out.println("Application-Two Subscribe To Database: Success");
    }

    public int getData() {
        return this.data;
    }

    @Override
    public void update() {
        this.data = Database.getInstance().getData();
        System.out.println("Application Two Update : Success");
    }
}
