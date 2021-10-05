package model;


import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Bill {
        private LocalDate checkin;
        private LocalDate checkout;

        private Room room;
        private Guest guest;

    public Bill() {
    }

    public Bill(LocalDate checkin) {
        this.checkin = checkin;
    }

    public Bill(LocalDate checkin, LocalDate checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Bill(LocalDate checkin, LocalDate checkout, Room room, Guest guest) {
        this.checkin = checkin;
        this.checkout = checkout;
        this.room = room;
        this.guest = guest;
    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
        this.room.setStatus(false);
    }

    public LocalDate getCheckout() {
        return checkout = LocalDate.now();
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
        this.room.setStatus(true);
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public double getFee() {
        return DAYS.between(getCheckin(), getCheckout()) * room.getPrice();
    }

    @Override
    public String toString() {
        return "Bill{" +
                "checkin=" + checkin +
                ", checkout=" + checkout +
                ", room=" + room +
                ", guest=" + guest +
                '}';
    }
}

