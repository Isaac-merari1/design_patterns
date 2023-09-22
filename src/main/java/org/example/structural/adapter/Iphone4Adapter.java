package org.example.structural.adapter;

public class Iphone4Adapter implements Iphone15 {
    private Iphone4Interface iphone4;

    public Iphone4Adapter(Iphone4Interface iphone4){
        this.iphone4 = iphone4;
    }
    @Override
    public void chargePhone() {
        this.iphone4.chargeIphone4();
    }
}
