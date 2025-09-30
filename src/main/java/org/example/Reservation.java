package org.example;

import java.time.LocalDate;

public class Reservation {

    private int reservationId;
    private Person person;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private ReservationStatus reservationStatus;

    public void createReservation(Person person, Vehicle vehicle, LocalDate startDate, LocalDate endDate) {
        this.reservationId = 10000 + (int) (Math.random() * (99999 - 10000));
        this.person = person;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.reservationStatus = ReservationStatus.SCHEDULED;
    }

    public void completeReservation(Reservation reservation){
        reservation.setReservationStatus(ReservationStatus.COMPLETED);
    }


    public int getReservationId() {
        return reservationId;
    }

    public Person getPerson() {
        return person;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public ReservationStatus getReservationStatus() {
        return reservationStatus;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
}
