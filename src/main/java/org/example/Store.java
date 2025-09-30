package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Store {

    int storeId;
    Location location;
    VehicleManager vehicleManager;
    List<Reservation> reservations;

    Store(int storeId,Location location, VehicleManager vehicleManager){
        this.storeId = storeId;
        this.location = location;
        this.vehicleManager = vehicleManager;
        this.reservations = new ArrayList<>();
    }

    public List<Vehicle> getVehiclesInStore(){
        return vehicleManager.getVehicles();
    }

    public Reservation createReservation(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate){
        Reservation reservation = new Reservation();
        reservation.createReservation(person,vehicle,startDate,endDate);
        reservations.add(reservation);
        return reservation;
    }

    public void completeReservation(Reservation reservation){
        reservation.completeReservation(reservation);
    }
}
