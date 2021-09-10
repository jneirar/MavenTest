package cs.ing.software.lab1;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

import static cs.ing.software.lab1.Main.*;

public class MainTest {
    @Test()
    public void test01() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        Assert.assertEquals(toyota.trip(12), "Automovil necesita reabastecimiento de combustible");
    }
    @Test()
    public void test02() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        Assert.assertEquals(toyota.trip(4), "Automovil viajo 4.000000 km y aun tiene 6.400000 de combustible");
    }
    @Test()
    public void test03() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        Assert.assertEquals(toyota.trip(12), "Camion necesita reabastecimiento de combustible");
    }
    @Test()
    public void test04() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        Assert.assertEquals(toyota.trip(4), "Camion viajo 4.000000 km y aun tiene 3.600000 de combustible");
    }
    @Test()
    public void test05() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        Assert.assertEquals(toyota.supplying(12), "La cantidad de combustible del Automovil es: 22.000000");
    }
    @Test()
    public void test06() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        Assert.assertEquals(toyota.supplying(95),"Automovil no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad");
    }
    @Test()
    public void test07() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        Assert.assertEquals(toyota.supplying(12), "La cantidad de combustible del Camion es: 21.400000");
    }
    @Test()
    public void test08() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        Assert.assertEquals(toyota.supplying(95), "Camion  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad");
    }
    @Test()
    public void test09() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        Assert.assertEquals(toyota.getCapacityOfFuel(), 100.0);
    }
    @Test()
    public void test10() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        Assert.assertEquals(toyota.getUseByKm(), 0.9);
    }
    @Test()
    public void test11() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        Assert.assertEquals(toyota.getQuantityOfFuel(), 10.0);
    }
    @Test()
    public void test12() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        Assert.assertEquals(toyota.getCapacityOfFuel(), 100.0);
    }
    @Test()
    public void test13() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        Assert.assertEquals(toyota.getUseByKm(), 1.6);
    }
    @Test()
    public void test14() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        Assert.assertEquals(toyota.getQuantityOfFuel(), 10.0);
    }
    @Test()
    public void test15() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        toyota.setCapacityOfFuel(90);
        Assert.assertEquals(toyota.getCapacityOfFuel(), 90.0);
    }
    @Test()
    public void test16() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        toyota.setQuantityOfFuel(50);
        Assert.assertEquals(toyota.getQuantityOfFuel(), 50.0);
    }
    @Test()
    public void test17() {
        Vehicle toyota = new Automovil(10, tanqueCapacidad);
        toyota.setUseByKm(3);
        Assert.assertEquals(toyota.getUseByKm(), 3.0);
    }
    @Test()
    public void test18() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        toyota.setCapacityOfFuel(90);
        Assert.assertEquals(toyota.getCapacityOfFuel(), 90.0);
    }
    @Test()
    public void test19() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        toyota.setQuantityOfFuel(50);
        Assert.assertEquals(toyota.getQuantityOfFuel(), 50.0);
    }
    @Test()
    public void test20() {
        Vehicle toyota = new Truck(10, tanqueCapacidad);
        toyota.setUseByKm(3);
        Assert.assertEquals(toyota.getUseByKm(), 3.0);
    }
}
