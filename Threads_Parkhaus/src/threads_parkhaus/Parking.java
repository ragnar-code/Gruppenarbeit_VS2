package threads_parkhaus;

import java.util.Scanner;

public class Parking {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ParkingGarage garage = new ParkingGarage();
        System.out.println("Wirkommen in unseren Parkhaus");

        garage.parkplace = 10;
        int autos = 10;
        Car[] cars = new Car[autos];

        for(int i=0;i<autos;i++){
            cars[i] = new Car(i+1);
            cars[i].setGarage(garage);
            cars[i].start();
        }
    }
}