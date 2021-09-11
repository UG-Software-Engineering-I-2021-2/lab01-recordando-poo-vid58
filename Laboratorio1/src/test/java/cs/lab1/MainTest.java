package cs.lab1;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.logging.Logger;
import java.io.IOException;

import static cs.lab1.Main.ConsumoAutomovil;
import static cs.lab1.Main.ConsumoCamion;
import static cs.lab1.Main.Tanque;

public class MainTest{
    @Test()
    public void test_A01(){
        Vehiculo automovil = new Automovil(10, Tanque, ConsumoAutomovil);
        Assert.assertEquals(" Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible.", automovil.viaje(4));
    }
    @Test
    public void test_A02(){
        Vehiculo automovil = new Automovil(10, Tanque, ConsumoAutomovil);
        Assert.assertEquals(" No  se  puede  reabastecer  el  tanque,  esta  lleno", automovil.recargar(99));
    }
    @Test
    public void test_A03(){
        Vehiculo automovil = new Automovil(10, Tanque, ConsumoAutomovil);
        Assert.assertEquals(" Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible.", automovil.viaje(4));
        Assert.assertEquals(" No  se  puede  reabastecer  el  tanque,  esta  lleno", automovil.recargar(99));
    }
    @Test
    public void test_A04(){
        Vehiculo automovil = new Automovil(10, Tanque, ConsumoAutomovil);
        Assert.assertEquals(" Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible.", automovil.viaje(4));
        Assert.assertEquals(" La cantidad de combustible del vehiculo es: 10.00", automovil.recargar(3.6));
        Assert.assertEquals(" Vehiculo necesita reabastecimiento de combustible", automovil.viaje(12));
    }

    @Test
    public void test_C01(){
        Vehiculo camion = new Camion(10, Tanque, ConsumoCamion);
        Assert.assertEquals(" Vehiculo viajo 4.0 km y aun tiene 3.60 de combustible.", camion.viaje(4));
    }
    @Test
    public void test_C02(){
        Vehiculo camion = new Automovil(10, Tanque, ConsumoCamion);
        Assert.assertEquals(" Vehiculo viajo 4.0 km y aun tiene 3.60 de combustible.", camion.viaje(4));
        Assert.assertEquals(" No  se  puede  reabastecer  el  tanque,  esta  lleno", camion.recargar(99));
    }
    @Test
    public void test_C03(){
        Vehiculo camion = new Automovil(10, Tanque, ConsumoCamion);
        Assert.assertEquals(" Vehiculo viajo 4.0 km y aun tiene 3.60 de combustible.", camion.viaje(4));
        Assert.assertEquals(" La cantidad de combustible del vehiculo es: 10.00", camion.recargar(6.4));
        Assert.assertEquals(" Vehiculo necesita reabastecimiento de combustible", camion.viaje(12));
    }
    @Test
    public void test_C04(){
        Vehiculo camion = new Camion(10, Tanque, ConsumoCamion);
        Assert.assertEquals(" Vehiculo viajo 4.0 km y aun tiene 3.60 de combustible.", camion.viaje(4));
        Assert.assertEquals(" La cantidad de combustible del vehiculo es: 7.02", camion.recargar(3.6));
        Assert.assertEquals(" Vehiculo necesita reabastecimiento de combustible", camion.viaje(12));
        Assert.assertEquals(" La cantidad de combustible del vehiculo es: 26.02", camion.recargar(20));
    }

    @Test(invocationCount = 80,threadPoolSize = 80)
    public void testCamion() {
        Camion volvo = new Camion(10,Tanque,ConsumoCamion);
        Assert.assertEquals(" La cantidad de combustible del vehiculo es: 48.00", volvo.recargar(40));
    }
}