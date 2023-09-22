package org.example.creational.factory;

public class OSFactory {
    public OperatingSystem createOS(String value){
        if (value.equals("apple")) {
            return new IOS();
        }
        else if(value.equals("android")){
            return new Android();
        }
            return new Windows();
    }
}
