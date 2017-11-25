package ds.adt;

import java.util.LinkedList;

public class App {

    public static void main(String args[]){

        Counter myCounter = new Counter("myCounter");

        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();

        System.out.println(myCounter.getCurrentValue());

        LinkedList myList = new LinkedList();

        myList.add(myCounter);

        System.out.println(myCounter);
    }
}
