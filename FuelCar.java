public interface FuelCar {
    
    public static int tankCapacity = 5;
    
    public static int getTankCapacity() {
        return tankCapacity;
    }

    public void run();
    public void refuel();
}
