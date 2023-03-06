package edu.sdsu.observer;

import edu.sdsu.subject.Subject;

public class HexObserver implements IObserver{

    Subject subject;
    public HexObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Hex:"+Integer.toHexString(subject.getState()));
    }
}
