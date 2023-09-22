package org.example.behavioral.observer;

/**
 * The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects. In this pattern, when one object (the subject) changes its state,
 * all its dependents (observers) are notified and updated automatically. It is often used to implement distributed event handling systems,
 * in which an object needs to notify its observers about changes without making assumptions about who or what those observers are.
 *
 * Intent:
 *
 * Define a one-to-many dependency between objects so that when one object changes state, all its dependents (observers) are notified and updated automatically.
 * Encapsulate the core component (subject) from its observers, allowing for flexible and loosely coupled designs.
 *
 *           Subject
 *            /     \
 *     ConcreteSubject  ConcreteObserver1
 *                     /     |     \
 *           ConcreteObserver2  ConcreteObserver3
 */


public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setWeather("Sunny");
        weatherStation.setWeather("Rainy");
    }
}


/**
 * In this example, the WeatherStation acts as the subject that maintains weather information. Multiple WeatherDisplay objects are observers
 * that want to be updated when the weather changes. The observers register themselves with the subject and are notified whenever the subject's state (weather) changes.
 * This allows the weather monitoring system to maintain a loose coupling between the subject and its observers.
 */