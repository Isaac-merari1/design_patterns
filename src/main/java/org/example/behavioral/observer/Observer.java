package org.example.behavioral.observer;

/**
 * Let's take a weather monitoring system as an example. In this system, multiple weather stations (subjects) report weather conditions,
 * and multiple display screens (observers) want to be updated when the weather changes.
 */
public interface Observer {
    void update(String weather);
}


