package org.example;

import java.time.LocalDate;

public interface ReservationFactory {
    Reservation createReservation(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate);
}

// Concrete implementation
//public class DefaultReservationFactory implements ReservationFactory {
//    @Override
//    public Reservation createReservation(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
//        Reservation reservation = new Reservation();
//        reservation.createReservation(person, vehicle, startDate, endDate);
//        return reservation;
//    }
//}