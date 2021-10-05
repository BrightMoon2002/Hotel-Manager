package view;

import control.Hotel;
import model.Bill;
import model.Guest;
import model.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Manager Hotel, Author is Nguyễn Hoàng Duy - C0821H1");

        ArrayList<Guest> guestArrayList = new ArrayList<>();
        ArrayList<Bill> billArrayList = new ArrayList<>();
        ArrayList<Room> roomArrayList = new ArrayList<>();

        Hotel hotelHD = new Hotel(roomArrayList, guestArrayList, billArrayList);
        menuManager(hotelHD);

    }

    public static void menuManager(Hotel hotel) {



        while(true) {
            System.out.println("Menu:");
            System.out.println("1. Add new Guest");
            System.out.println("2. Creat new Room");
            System.out.println("3. Remove Guest");
            System.out.println("4. Remove Room");
            System.out.println("5. Edit the Guest");
            System.out.println("6. Calculator Bill");
            System.out.println("o. Exit");
            System.out.println("Enter the your choice:");
            Scanner inputChoice = new Scanner(System.in);
            int choice = inputChoice.nextInt();
            switch (choice) {
                case 1:
                    Bill bill = new Bill();
                    Guest guest = creatNewGuest();
                    bill.setGuest(guest);
                    System.out.println("Enter the code");
                    System.out.println("Enter the code room:");
                    Scanner inputRoom = new Scanner(System.in);
                    String codeRoom = inputRoom.nextLine();
                    Room room = hotel.searchRoomByCode(codeRoom);
                    bill.setRoom(room);
                    System.out.println("Enter day checkin:");
                    Scanner inputCheckin = new Scanner(System.in);
                    System.out.println("Enter the year:");
                    int year = inputCheckin.nextInt();
                    System.out.println("Enter the month:");
                    int month = inputCheckin.nextInt();
                    System.out.println("Enter the day:");
                    int day = inputCheckin.nextInt();
                    LocalDate checkin  = LocalDate.of(year, month, day);
                    bill.setCheckin(checkin);
                    hotel.showAllListGuest();
                    hotel.addGuest(guest);
                    hotel.getBillArrayList().add(bill);
                    break;
                case 2:
                    Room newRoom = creatNewRoom();
                    hotel.addRoom(newRoom);
                    hotel.showAllListRoom();
                    break;
                case 3:
                    Scanner inputIndex = new Scanner(System.in);
                    int index = inputIndex.nextInt();
                    hotel.removeGuest(index);
                    hotel.showAllListGuest();
                    break;
                case 4:
                    Scanner inputIndexRoom = new Scanner(System.in);
                    System.out.println("Enter the index of room");
                    int indexRoom = inputIndexRoom.nextInt();
                    hotel.removeRoom(indexRoom);
                    break;
                case 5:
                    Scanner inputIndexGuest = new Scanner(System.in);
                    System.out.println("Enter the index Guest:");
                    int indexGuest = inputIndexGuest.nextInt();
                    Guest newGuest = creatNewGuest();
                    hotel.getGuestArrayList().set(indexGuest, newGuest);
                case 6:
                    System.out.println("Enter the identity:");
                    Scanner inputIdentity = new Scanner(System.in);
                    String identity = inputIdentity.nextLine();
                    double fee = hotel.getBillArrayList().get(hotel.searchBillByGuestIdentity(identity)).getFee();
                    System.out.println(fee);
                    break;

            }
        }

    }

    private static Room creatNewRoom() {
        System.out.println("Enter the code of room:");
        Scanner inputCode = new Scanner(System.in);
        String code = inputCode.nextLine();
        System.out.println("Enter the price of room");
        Scanner inputPrice = new Scanner(System.in);
        double price = inputPrice.nextDouble();
        System.out.println("Enter the kind of room");
        Scanner inputKind = new Scanner(System.in);
        String kind = inputKind.nextLine();
        Room newRoom = new Room(code, price, kind);
        return newRoom;
    }

    private static Guest creatNewGuest() {
        System.out.println("Enter the Guest's name:");
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        System.out.println("Enter the Guest's identity:");
        Scanner inputIdentity = new Scanner(System.in);
        String identity = inputIdentity.nextLine();
        System.out.println("Enter the Day of Birth:");
        Scanner inputDOB = new Scanner(System.in);
        String DayOB = inputDOB.nextLine();
        Guest guest = new Guest(name, identity, DayOB);

        return guest;
    }
}
