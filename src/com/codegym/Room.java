package com.codegym;

public class Room {
    private String type;
    private String roomId;
    private double price;
    private int daysRent; // số ngày thuê
    private Person guest;

    @Override
    public String toString() {
        return String.format("Phòng %s số %s, giá: %.2f/ngày, số ngày: %d, khách thuê: %s",
                type, roomId, price, daysRent, guest
        );
    }

    public Room() {
    }

    public Room(String roomId, String type, double price, int daysRent, Person guest) {
        this.roomId = roomId;
        this.type = type;
        this.price = price;
        this.daysRent = daysRent;
        this.guest = guest;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDaysRent() {
        return daysRent;
    }

    public void setDaysRent(int daysRent) {
        this.daysRent = daysRent;
    }

    public Person getGuest() {
        return guest;
    }

    public void setGuest(Person guest) {
        this.guest = guest;
    }
}
