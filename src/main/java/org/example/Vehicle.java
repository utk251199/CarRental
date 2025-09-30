package org.example;

public class Vehicle {

    private int vehicleId;
    private String vehicleNumber;
    private int kmsDriven;
    private int hourlyRentalCharge;
    private String manufacturer;
    private String model;
    private VehicleType vehicleType;

    public Vehicle(int vehicleId, String vehicleNumber, int hourlyRentalCharge, VehicleType vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.hourlyRentalCharge = hourlyRentalCharge;
        this.vehicleType = vehicleType;
    }

    // Getters and Setters
    public int getId() {
        return vehicleId;
    }

    public void setId(int id) {
        this.vehicleId = id;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getKmsDriven() {
        return kmsDriven;
    }

    public void setKmsDriven(int kmsDriven) {
        this.kmsDriven = kmsDriven;
    }

    public int getHourlyRentalCharge() {
        return hourlyRentalCharge;
    }

    public void setHourlyRentalCharge(int hourlyRentalCharge) {
        this.hourlyRentalCharge = hourlyRentalCharge;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
