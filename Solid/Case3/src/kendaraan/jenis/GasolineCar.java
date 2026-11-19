package kendaraan.jenis;

import kendaraan.kemampuan.Drivable;
import kendaraan.kemampuan.EnginePowered;
import kendaraan.kemampuan.FuelPowered;

public final class GasolineCar implements Drivable, EnginePowered, FuelPowered {
    @Override
    public void drive() {
        System.out.println("Mobil bensin berjalan di jalan raya.");
    }

    @Override
    public void startEngine() {
        System.out.println("Mesin mobil bensin dinyalakan.");
    }

    @Override
    public void refuel() {
        System.out.println("Mengisi bahan bakar mobil bensin.");
    }
}