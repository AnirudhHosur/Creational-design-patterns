package com.after;

public class HouseBuilder implements Builder {
    private int windows;
    private int doors;
    private int rooms;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasSwimPool;

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }

    @Override
    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    public House build() {
        return new House(windows, doors, rooms, hasGarage, hasGarden, hasSwimPool);
    }
}