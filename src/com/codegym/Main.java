package com.codegym;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HotelManager hotelManager = initHotelManager();
        int choice = -1;
        do {
            showMenu();
            System.out.printf("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("In danh sách phòng: ");
                    System.out.println(hotelManager.roomsListToString());
                    break;
                case 2:
                    System.out.println("Thêm phòng vào danh sách: ");
                    Room newRoom = hotelManager.inputRoom(scanner);
                    hotelManager.addRoom(newRoom);
                    break;
                case 3:
                    System.out.println("Xóa phòng khỏi danh sách");
                    System.out.println("Nhập số phòng muốn xóa: ");
                    String removeId = scanner.next();
                    hotelManager.removeRoomById(removeId);
                    break;
            }
        } while (choice != 0);
    }

    public static void showMenu() {
        System.out.println("---Menu quản lý khách sạn---");
        System.out.println("1. Hiển thị danh sách phòng");
        System.out.println("2. Thêm phòng vào danh sách");
        System.out.println("3. Xóa phòng khỏi danh sách");
        System.out.println("0. Thoát");
    }

    public static HotelManager initHotelManager() {
        Person person1 = new Person("Nguyễn Văn A", "14/1/1981", "1451017878");
        Person person2 = new Person("Nguyễn Văn B", "1/2/1983", "12451245102");
        Person person3 = new Person("Nguyễn Văn C", "19/11/1991", "998997997996");

        Room room1 = new Room("501", "vip", 2800000, 5, person1);
        Room room2 = new Room("511", "normal", 800000, 3, person2);
        Room room3 = new Room("402", "super vip", 6200000, 10, person3);


        HotelManager hotelManager = new HotelManager();
        hotelManager.addRoom(room1);
        hotelManager.addRoom(room2);
        hotelManager.addRoom(room3);
        return hotelManager;
    }
}
