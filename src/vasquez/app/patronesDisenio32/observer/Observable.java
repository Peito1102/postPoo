package vasquez.app.patronesDisenio32.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

abstract public class Observable {
    protected List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservadores() {
        notifyObservadores(null);
    }

    public void notifyObservadores(Object obj) {
        for (Observer obs: observers) {
            obs.update(this,obj);
        }
    }
}
