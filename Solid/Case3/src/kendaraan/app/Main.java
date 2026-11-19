package kendaraan.app;

import kendaraan.jenis.Bicycle;
import kendaraan.jenis.ElectricCar;
import kendaraan.jenis.GasolineCar;
import kendaraan.kontrol.VehicleController;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        GasolineCar gasolineCar = new GasolineCar();
        gasolineCar.startEngine();
        gasolineCar.refuel();
        new VehicleController(gasolineCar).operate();

        ElectricCar electricCar = new ElectricCar();
        electricCar.chargeBattery();
        new VehicleController(electricCar).operate();

        Bicycle bicycle = new Bicycle();
        new VehicleController(bicycle).operate();
    }
}