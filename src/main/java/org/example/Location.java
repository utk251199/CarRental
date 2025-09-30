package org.example;

public class Location {

    private String address;
    private String city;
    private int pinCode;

    public Location(String address, String city, int pinCode){
        this.address = address;
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getAddress(){
        return address;
    }

    public String getCity(){
        return city;
    }

    public int getPinCode(){
        return pinCode;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setPinCode(int pinCode){
        this.pinCode = pinCode;
    }
}
