package kendaraan.jenis;

import kendaraan.kemampuan.Drivable;

public final class Bicycle implements Drivable {
    @Override
    public void drive() {
        System.out.println("Sepeda dikayuh di jalan.");
    }
}