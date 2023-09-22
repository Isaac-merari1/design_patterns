package org.example.creational.singleton;

public class SingletonClass {
    private SingletonClass(){}
    private static SingletonClass objectSingleton = new SingletonClass();

    public static synchronized SingletonClass getInstance(){
        return objectSingleton;
    }

}

