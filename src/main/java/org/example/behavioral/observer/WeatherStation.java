package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    private String weather;
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather);
        }
    }

    public void setWeather(String newWeather) {
        weather = newWeather;
        notifyObservers();
    }
}

