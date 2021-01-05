package threads_parkhaus;

public class Car extends Thread {

    private int number;
    private ParkingGarage garage;

    public void setGarage(ParkingGarage garage) {
        this.garage = garage;
    }

    public Car(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void run(){
        while(true){
            try {
                Thread.sleep((int) (Math.random() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            garage.enter(this);
            try {
                Thread.sleep((int) (Math.random() * 10000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            garage.leave(this);
        }
    }
}