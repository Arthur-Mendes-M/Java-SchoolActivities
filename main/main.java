package main;
import Car.*;

class Main {
  public static void main(String args[]) { 
    String model = "Civic";
    int maxVelocity = 250;
    
    Car newCar = new Car(model, maxVelocity);
    System.out.println("-------------INICIOU O SISTEMA-------------");
    System.out.println("Model: " + newCar.model);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("Maximum velocity: " + newCar.maxVelocity + "km/h");

    System.out.println("-------------------------------------");

    newCar.speedUp(100);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------------------------------");
    newCar.speedUp(50);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------------------------------");
    newCar.breakCar(15);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------------------------------");    
    newCar.breakCar(300);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------------------------------");
    newCar.speedUp(120);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------------------------------");
    newCar.speedUp(150);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------------------------------");
    newCar.speedUp(200);
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------------------------------");
    newCar.turnOff();
    System.out.println("Current velocity: " + newCar.currentVelocity + "km/h");
    System.out.println("-------------FINALIZOU O SISTEMA-------------");
  } 
}