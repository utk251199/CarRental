package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            Person person = new Person(1,23423,"ChillGuy");
            Location location = new Location("Somewhere","Blr",426647);

            List<Vehicle> vehicles = new ArrayList<>();
            Vehicle vehicle = new Car(1,"AB1234",1000);
            vehicles.add(vehicle);

            List<Store> stores = new ArrayList<>();
            stores.add(new Store(1,location,new VehicleManager(vehicles),new DefaultReservationFactory()));

            StoreManager sm = new StoreManager(stores);
            Store nearestStore = sm.findStoreByPincode(426647);

            List<Vehicle> vehicleList = nearestStore.getVehiclesInStore();

            Reservation reservation = nearestStore.createReservation(person,vehicle, LocalDate.now(),LocalDate.now().plusDays(2));

            Bill bill = new Bill(reservation);
            bill.billPaid();

            nearestStore.completeReservation(reservation);

        }
    }