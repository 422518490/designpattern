package com.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class Subject1 implements Subject {

    private List<Observer> observerList;

    public Subject1() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public List<Observer> addObserver(Observer observer) {
        observerList.add(observer);
        return observerList;
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        String message = "开车了...";
        observerList.forEach(observer -> {
            observer.update(message);
        });
    }
}
