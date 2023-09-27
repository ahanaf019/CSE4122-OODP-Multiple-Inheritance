// Hybrid car inherits from both electric car and fuel car


public class HybridCar implements ElectricCar, FuelCar {

    private int tankCapacity = 40;
    private int batteryCapacity = 10;
    private int currentCharge = 3;
    private int currentFuel = 8;

    private String model;

    HybridCar(String model) {
        this.model = model;
    }
    
    public void charge() {
        System.out.println("Hybrid car is charging");
    }

    public void run() {
        System.out.println("The car is running");
    }

    public void refuel() {
        System.out.println("The car is refueling. . .");
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public int getCurrentCharge() {
        return currentCharge;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }


}
