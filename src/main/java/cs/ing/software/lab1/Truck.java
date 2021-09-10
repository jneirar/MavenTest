package cs.ing.software.lab1;

public class Truck extends Vehicle {
    public Truck(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 1.6;
    }
    @Override
    public String supplying(double fuel) {
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            return "Camion  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad";
        }
        this.quantityOfFuel = this.quantityOfFuel + (fuel * 0.95);
        return String.format("La cantidad de combustible del Camion es: %f", this.quantityOfFuel);
    }
    @Override
    public String trip(float kilometers) {
        if(this.useByKm * kilometers > this.quantityOfFuel){
            return "Camion necesita reabastecimiento de combustible";
        }
        this.quantityOfFuel = this.quantityOfFuel - this.useByKm * kilometers;
        return String.format("Camion viajo %f km y aun tiene %f de combustible", kilometers, this.quantityOfFuel);
    }
}
