package org.example;

import java.time.temporal.ChronoUnit;

public class Bill {

    private Reservation reservation;
    private double amount;
    private boolean isBillPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.isBillPaid = false;
        this.amount = computeBillAmount(reservation);
    }

    private double computeBillAmount(Reservation reservation) {
        long totalDays = ChronoUnit.DAYS.between(
                reservation.getStartDate(),
                reservation.getEndDate()
        );
        amount = totalDays * reservation.getVehicle().getDailyRentalCharge();
        return amount;
    }

    public void billPaid() {
        this.isBillPaid = true;
        System.out.println("Bill with amount " + amount + " has been paid.");
    }

    public Reservation getReservation() {
        return reservation;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isBillPaid() {
        return isBillPaid;
    }
}
