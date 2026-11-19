package kendaraan.jenis;

import kendaraan.kemampuan.BatteryPowered;
import kendaraan.kemampuan.Drivable;

public final class ElectricCar implements Drivable, BatteryPowered {
    @Override
    public void drive() {
        System.out.println("Mobil listrik berjalan di jalan raya.");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}