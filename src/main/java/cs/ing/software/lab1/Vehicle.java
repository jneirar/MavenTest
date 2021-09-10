package cs.ing.software.lab1;

public class Vehicle {
    double quantityOfFuel = 0.0;
    double capacityOfFuel = 0;
    double useByKm = 0;

    public Vehicle(double quantityOfFuel, double capacityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
        this.capacityOfFuel = capacityOfFuel;
    }

    public double getQuantityOfFuel() {
        return quantityOfFuel;
    }

    public void setQuantityOfFuel(double quantityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
    }

    public double getCapacityOfFuel() {
        return capacityOfFuel;
    }

    public void setCapacityOfFuel(double capacityOfFuel) {
        this.capacityOfFuel = capacityOfFuel;
    }

    public double getUseByKm() {
        return useByKm;
    }

    public void setUseByKm(double useByKm) {
        this.useByKm = useByKm;
    }

    public String supplying(double fuel) {
        return Double.toString(fuel);
    }

    public String trip(float kilometers) {
        return Float.toString(kilometers);
    }

}
