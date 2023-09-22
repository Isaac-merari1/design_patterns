package org.example.behavioral.observer;

public class WeatherDisplay implements Observer{
    private String currentWeather;
    @Override
    public void update(String weather) {
        currentWeather = weather;
        display();
    }

    public void display() {
        System.out.println("Weather Display: Current weather is " + currentWeather);
    }
}
