package org.example;

import java.time.LocalDate;

public interface ReservationFactory {
    Reservation createReservation(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate);
}