package org.example;

public class Car extends Vehicle{

    public Car(int vehicleId, String vehicleNumber, int hourlyRentalCharge) {
        super(vehicleId, vehicleNumber, hourlyRentalCharge, VehicleType.CAR);
    }
}
