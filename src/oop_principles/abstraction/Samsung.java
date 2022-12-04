package oop_principles.abstraction;

public class Samsung extends Phone implements Camera, WiFi{

    public Samsung(){}

    public Samsung(int storage, String model, String color, double price) {
        super(storage, model, color, price);
    }

    @Override
    public void call() {
        System.out.println("Samsung way of call");
    }

    @Override
    public void text() {
        System.out.println("Samsung way of text");
    }

    @Override
    public void takesPhone() {
        System.out.println("Samsung way of taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Samsung way of recording videos");
    }

    @Override
    public void connect() {
        System.out.println("Samsung way of connecting wifi");
    }
}