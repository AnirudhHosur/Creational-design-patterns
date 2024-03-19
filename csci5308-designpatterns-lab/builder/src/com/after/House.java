package com.after;

public class House {
    //required parameter
    private final int windows;
    private final int doors;
    private final int rooms;
    private final boolean hasGarage;
    private final boolean hasGarden;

    //optional parameter
    private boolean hasSwimPool;

    public House(int windows, int doors, int rooms, boolean hasGarage, boolean hasGarden, boolean hasSwimPool) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasGarden = hasGarden;
        this.hasSwimPool = hasSwimPool;
    }

    public int getWindows() {
        return this.windows;
    }

    public int getDoors() {
        return this.doors;
    }

    public int getRooms() {
        return this.rooms;
    }

    public boolean isHasGarage() {
        return this.hasGarage;
    }

    public boolean isHasGarden() {
        return this.hasGarden;
    }

    public boolean isHasSwimPool() {
        return this.hasSwimPool;
    }
}
