package oop_principles.abstraction;

public interface Camera {

    String color = "Black";

    void takesPhone();
    void recordVideo();

    default void method1(){
        System.out.println("This is a default method");
    }


}
