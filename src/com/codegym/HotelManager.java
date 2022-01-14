package com.codegym;

import java.util.Scanner;

public class HotelManager {
    private Room[] rooms = new Room[0];

    public HotelManager() {
    }

    public int size() {
        return rooms.length;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public String roomsListToString() {
        String string = "Danh sách phòng:";
        for (int i = 0; i < this.rooms.length; i++) {
            string += "\n" + (i + 1) + ". " + this.rooms[i].toString();
        }
        return string;
    }

    public void addRoom(Room room) {
        Room[] newRooms = new Room[rooms.length + 1];
        System.arraycopy(this.rooms, 0, newRooms, 0, this.rooms.length);
        newRooms[newRooms.length - 1] = room;
        this.rooms = newRooms;
    }

    public void removeRoomById(String roomId) {
        int index = -1;
        for (int i = 0; i < this.rooms.length; i++) {
            boolean isThisRoom = this.rooms[i].getRoomId().toLowerCase().equals(roomId);
            if (isThisRoom) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không thể xóa. Không tìm thấy phòng với Id=" + roomId);
        } else {
            Room[] newRooms = new Room[rooms.length - 1];
            System.arraycopy(this.rooms, 0, newRooms, 0, index);
            System.arraycopy(this.rooms, index + 1, newRooms, index, newRooms.length - index);
            System.out.println("Đã xóa phòng: " + this.rooms[index]);
            this.rooms = newRooms;
        }


    }
    public Person inputPerson(Scanner scanner){
        System.out.println("Nhập họ tên: ");
        String name = scanner.next();
        System.out.println("Nhập ngày tháng năm sinh: ");
        String dateOfBirth = scanner.next();
        System.out.println("Nhập số CMND: ");
        String idNumber = scanner.next();
        return new Person(name, dateOfBirth, idNumber);
    }
    public Room inputRoom(Scanner scanner){
        System.out.println("Nhập số phòng: ");
        String roomId = scanner.next();
        System.out.println("Nhập loại phòng: ");
        String type = scanner.next();
        System.out.println("Nhập giá phòng: ");
        Double price = scanner.nextDouble();
        System.out.println("Nhập số ngày thuê: ");
        int daysRent = scanner.nextInt();
        Person guest = inputPerson(scanner);
        return new Room(roomId, type, price, daysRent, guest);
    }
}
