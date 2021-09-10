package cs.ing.software.lab1;

public class Automovil extends Vehicle {
    String msg;

    public Automovil(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 0.9;
    }
    @Override
    public String supplying(double fuel) {
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            return "Automovil no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad";
        }
        this.quantityOfFuel = this.quantityOfFuel + fuel;
        return String.format("La cantidad de combustible del Automovil es: %f", this.quantityOfFuel);
    }
    @Override
    public String trip(float kilometers) {
        if(this.useByKm * kilometers > this.quantityOfFuel){
            return "Automovil necesita reabastecimiento de combustible";
        }
        this.quantityOfFuel = this.quantityOfFuel - this.useByKm * kilometers;
        return String.format("Automovil viajo %f km y aun tiene %f de combustible", kilometers, this.quantityOfFuel);
    }

}
