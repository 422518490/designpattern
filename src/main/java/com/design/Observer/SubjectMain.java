package com.design.Observer;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class SubjectMain {

    public static void main(String [] args){
        Subject subject = new Subject1();
        subject.addObserver(new ObserverA());
        subject.addObserver(new ObserverB());
        Observer observerC = new ObserverC();
        subject.addObserver(observerC);
        subject.notifyObserver();

        System.out.println("********");

        subject.removeObserver(observerC);

        subject.notifyObserver();
    }
}
