public class HybridRaceCar implements ElectricCar, FuelCar {
    
    public void charge() {
        System.out.println("Hybrid car is charging");
    }

    public void run() {
        System.out.println("The car is running");
    }

    public void refuel() {
        System.out.println("The car is refueling. . .");
    }
}
