package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:xz
 * Date:2019/11/21 14:52
 * Desc:
 */
public abstract class Observable {
    List<Observer> observers = new ArrayList<>();

    public void register(Observer observer){
        this.observers.add(observer);
    }

    public void unRegister(Observer observer){
        this.observers.remove(observer);
    }

    public void notifyAllObservers(Object object){
        for (Observer observer : observers) {
            observer.update(object);
        }
    }
}
