package com.after;
/** Builder design pattern - Implementation
 * Why to use ?
 * 1. When there is optional parameter in the Object initialization.
 * 2. We don’t want to create the constructor with too many parameters as it will be difficult to
 *    manage from client code and it creates confusion like ordering of arguments.
 * 3. We don’t want to pass with optional arguments to constructors as NULL.
 * We don’t want to build such a complex object using a factory pattern.
 **/

public class Main {

    public static void main(String[] args) {

	    HouseBuilder builder = new HouseBuilder();
        builder.setWindows(5);
	    builder.setDoors(4);
	    builder.setRooms(3);

        House simpleHouse = builder.build();
        System.out.println("Items added in Simple house: " + "\n"
                + "No of Windows: " + simpleHouse.getWindows() + "\n"
                + "No of Doors: " + simpleHouse.getDoors() + "\n"
                + "No of Rooms: " + simpleHouse.getRooms() + "\n"
                + "House has Garden: "+ simpleHouse.isHasGarden());

        System.out.println("****************************************************************");

        builder.setWindows(10);
        builder.setDoors(6);
        builder.setRooms(6);
        builder.setHasGarage(true);
        builder.setHasGarden(true);
        builder.setHasSwimPool(true);

        House guestHouse = builder.build();
        System.out.println("Items added in Guest house: " + "\n"
                + "No of Windows: " + guestHouse.getWindows() + "\n"
                + "No of Doors: " + guestHouse.getDoors() + "\n"
                + "No of Rooms: " + guestHouse.getRooms() + "\n"
                + "House has Garden: "+ guestHouse.isHasGarden() + "\n"
                + "House has Garage: "+ guestHouse.isHasGarage() + "\n"
                + "House has Swimming pool: "+ guestHouse.isHasSwimPool() );
    }
}
