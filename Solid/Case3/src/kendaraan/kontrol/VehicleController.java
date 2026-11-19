package kendaraan.kontrol;

import java.util.Objects;
import kendaraan.kemampuan.Drivable;

public final class VehicleController {
    private final Drivable vehicle;

    public VehicleController(Drivable vehicle) {
        this.vehicle = Objects.requireNonNull(vehicle, "vehicle tidak boleh null");
    }

    public void operate() {
        vehicle.drive();
    }
}