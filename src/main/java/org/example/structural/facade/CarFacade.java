package org.example.structural.facade;

public class CarFacade {
    private Engine engine;
    private AirConditioning ac;
    private GPS gps;

    public CarFacade(){
        this.engine = new Engine();
        this.ac = new AirConditioning();
        this.gps = new GPS();
    }

    void startCar(){
        engine.start();
        ac.turnOn();
    }

    void navigateTo(String destination){
        gps.navigate(destination);
    }
}
