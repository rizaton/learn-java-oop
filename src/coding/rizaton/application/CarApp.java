package coding.rizaton.application;

import coding.rizaton.data.Avanza;
import coding.rizaton.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}