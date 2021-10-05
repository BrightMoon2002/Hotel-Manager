package control;


import model.Bill;
import model.Guest;
import model.Room;

import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> roomArrayList = new ArrayList<>();
    ArrayList<Guest> guestArrayList = new ArrayList<>();
    ArrayList<Bill> billArrayList = new ArrayList<>();

    public Hotel(ArrayList<Room> roomArrayList, ArrayList<Guest> guestArrayList) {
        this.roomArrayList = roomArrayList;
        this.guestArrayList = guestArrayList;
    }

    public Hotel(ArrayList<Room> roomArrayList, ArrayList<Guest> guestArrayList, ArrayList<Bill> billArrayList) {
        this.roomArrayList = roomArrayList;
        this.guestArrayList = guestArrayList;
        this.billArrayList = billArrayList;
    }

    public Hotel() {
    }

    public void addRoom(Room newRoom) {
        roomArrayList.add(newRoom);
    }
    public void removeRoom(int index) {
        roomArrayList.remove(index);
    }

    public void editRoom(int index, Room newRoom) {
        roomArrayList.set(index, newRoom);
    }

    public ArrayList<Room> getRoomArrayList() {
        return roomArrayList;
    }

    public void setRoomArrayList(ArrayList<Room> roomArrayList) {
        this.roomArrayList = roomArrayList;
    }

    public ArrayList<Guest> getGuestArrayList() {
        return guestArrayList;
    }

    public void setGuestArrayList(ArrayList<Guest> guestArrayList) {
        this.guestArrayList = guestArrayList;
    }

    public ArrayList<Bill> getBillArrayList() {
        return billArrayList;
    }

    public void setBillArrayList(ArrayList<Bill> billArrayList) {
        this.billArrayList = billArrayList;
    }

    public void addGuest(Guest newGuest) {
        guestArrayList.add(newGuest);
    }

    public void removeGuest(int index) {
        guestArrayList.remove(index);
    }

    public void editGuest(int index, Guest newGuest) {
        guestArrayList.set(index, newGuest);
    }

    public int searchGuest (String identity) {
        int index = -1;
        for (int i = 0; i < guestArrayList.size(); i++) {
            if (guestArrayList.get(i).getIdentityCard().equals(identity)) {
                index = i;
                break;
            }
        }
        return index;
    }


    public void showAllListGuest() {
        for (Guest guest : guestArrayList) {
            System.out.println(guest);
        }
    }
        public void showAllListRoom () {
            for (Room room : roomArrayList) {
                System.out.println(room);
            }
        }

        public Room searchRoomByCode(String code) {
            int index = -1;
            for (int i = 0; i < roomArrayList.size(); i++) {
                if (roomArrayList.get(i).getCode().equals(code)) {
                    index = i;
                    break;
                }
            }
            return roomArrayList.get(index);
        }
        public int searchBillByGuestIdentity(String identity) {
        int index = -1;
            for (int i = 0; i < billArrayList.size(); i++) {
                if (billArrayList.get(i).getGuest().getIdentityCard().equals((identity))){
                    index = i;
                    break;
                }
            }
            return index;
        }

}

