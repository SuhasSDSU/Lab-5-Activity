package edu.sdsu.observer;

import edu.sdsu.subject.Subject;

public class BinaryObserver implements IObserver{
    private Subject subject;

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary:"+Integer.toBinaryString(subject.getState()));
    }
}
