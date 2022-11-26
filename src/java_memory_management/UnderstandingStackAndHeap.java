package java_memory_management;

import class_object.Car;
import class_object.Fruit;

public class UnderstandingStackAndHeap {
    public static void main(String[] args) {

        int age = 45;

        System.out.println(age); // 45

        Car car1 = new Car();
        car1.make = "Tesla";

        System.out.println(car1);


        Fruit apple = new Fruit();
        System.out.println(apple);

    }
}
