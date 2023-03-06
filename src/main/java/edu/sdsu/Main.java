package edu.sdsu;

import edu.sdsu.builder.HouseBuilder;
import edu.sdsu.houseStyle.GlassHouse;
import edu.sdsu.houseStyle.WoodenHouse;
import edu.sdsu.observer.BinaryObserver;
import edu.sdsu.observer.HexObserver;
import edu.sdsu.observer.IObserver;
import edu.sdsu.singleton.Singleton;
import edu.sdsu.subject.Subject;

public class Main {
    public static void main(String[] args) {

        Subject subject = new Subject();
        System.out.println("Before");
        new BinaryObserver(subject);
        new HexObserver(subject);

        subject.setState(10);
        subject.setState(15);

        System.out.println("After");


    /**
        Singleton singleTon = Singleton.getInstance("FOO");

        Singleton singleton1 = Singleton.getInstance("BAR");

        System.out.println(singleton1.getMessage());
        System.out.println(singleTon.getMessage());
     */


    }
}