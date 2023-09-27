class Main {
    public static void main(String[] args) {
        
        HybridCar hybridCar = new HybridCar("Toyota Aqua");

        hybridCar.refuel();
        hybridCar.run();
        hybridCar.charge();
        int tankCapacity  = hybridCar.getTankCapacity();

        System.out.println("The tank capacity is: " + tankCapacity);
    }
}