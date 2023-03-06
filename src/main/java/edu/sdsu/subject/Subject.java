package edu.sdsu.subject;

import edu.sdsu.observer.IObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<IObserver> observerList;
    private int state;

    public Subject(){
        this.observerList = new ArrayList<>();
        this.state = 0;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        updateAll();
    }

    public void attach(IObserver observer){
        observerList.add(observer);
    }

    public void updateAll(){
        for(IObserver observer: observerList){
            observer.update();
        }
    }
}
