public interface ElectricCar {

    public static int batteryCapacity = 5;
    
    public static int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void run();
    public void charge();
}
