package org.example;

import java.time.LocalDate;

public class DefaultReservationFactory implements ReservationFactory {
    public Reservation createReservation(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        Reservation reservation = new Reservation();
        reservation.createReservation(person, vehicle, startDate, endDate);
        return reservation;
    }
}
