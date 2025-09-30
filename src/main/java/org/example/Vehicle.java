package org.example;

public class Vehicle {

    private int vehicleId;
    private String vehicleNumber;
    private int kmsDriven;
    private int dailyRentalCharge;
    private String manufacturer;
    private String model;
    private VehicleType vehicleType;

    public Vehicle(int vehicleId, String vehicleNumber, int dailyRentalCharge, VehicleType vehicleType) {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.dailyRentalCharge = dailyRentalCharge;
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

    public int getDailyRentalCharge() {
        return dailyRentalCharge;
    }

    public void setDailyRentalCharge(int dailyRentalCharge) {
        this.dailyRentalCharge = dailyRentalCharge;
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
