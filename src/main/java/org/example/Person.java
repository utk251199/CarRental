package org.example;

public class Person {

    private int id;
    private int drivingLicenseNumber;
    private String name;

    public Person(int id, int drivingLicenseNumber, String name) {
        this.id = id;
        this.drivingLicenseNumber = drivingLicenseNumber;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDrivingLicenseNumber() {
        return drivingLicenseNumber;
    }

    public void setDrivingLicenseNumber(int drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
