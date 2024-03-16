package Subject;

import Observers.Observer;

import java.util.LinkedList;
import java.util.List;

public class Database {
    private int data;
    private List<Observer> observers;
    private static Database database;

    private Database() {
        this.data = 0;
        observers = new LinkedList<Observer>();
    }

    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }
        return database;
    }

    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    public int getData() {
        return this.data;
    }

    public void notifyAllObservers() {
        for(Observer observer : this.observers) {
            observer.update();
        }
    }

    public void setData(int data) {
        this.data = data;
        notifyAllObservers();
    }
}
