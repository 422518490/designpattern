package com.design.observer;

import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public interface Subject {

    List<Observer> addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();
}
