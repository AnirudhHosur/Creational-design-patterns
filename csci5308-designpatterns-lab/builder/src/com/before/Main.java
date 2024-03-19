package com.before;

public class Main {

    public static void main(String[] args) {

        House simpleHouse = new House(4, 5, 3, true);
        System.out.println("Items added in Simple house: " + "\n"
                + "No of Windows: " + simpleHouse.getWindows() + "\n"
                + "No of Doors: " + simpleHouse.getDoors() + "\n"
                + "No of Rooms: " + simpleHouse.getRooms() + "\n"
                + "House has Garden: "+ simpleHouse.isHasGarden());


        House guestHouse = new House(6, 7, 8, true, true, true);
        System.out.println("Items added in Guest house: " + "\n"
                + "No of Windows: " + guestHouse.getWindows() + "\n"
                + "No of Doors: " + guestHouse.getDoors() + "\n"
                + "No of Rooms: " + guestHouse.getRooms() + "\n"
                + "House has Garden: "+ guestHouse.isHasGarden() + "\n"
                + "House has Garage: "+ guestHouse.isHasGarage() + "\n"
                + "House has Swimming pool: "+ guestHouse.isHasSwimPool() );
    }
}
