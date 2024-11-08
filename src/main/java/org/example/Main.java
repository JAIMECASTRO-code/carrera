package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehiculo car = new Car("BMW");
        Vehiculo moto = new Moto("Yamaha");

        System.out.println(car);
        System.out.println(moto);

        car.acelerar();
        System.out.println("Car velocity: " + car.getVelocity());

        moto.acelerar();
        System.out.println("Moto velocity: " + moto.getVelocity());

        car.frenar();
        System.out.println("Car velocity after braking: " + car.getVelocity());

        moto.frenar();
        System.out.println("Moto velocity after braking: " + moto.getVelocity());
    }
    }