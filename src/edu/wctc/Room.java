package edu.wctc;

public abstract class Room implements Lootable, Interactable, Exit {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public abstract Room getAdjoiningRoom(char direction);

    public abstract String getExits();

    public String getName() {
        return this.name;
    }

    public abstract boolean isValidDirection(char direction);


    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    @Override
    public String exit(Player player) {
        return "You cannot exit the office after dark from this room.";
    }

    @Override
    public String ineract(Player player) {
        return "There is nothing to interact with in this room.";
    }

    @Override
    public String loot(Player player) {
        return "There is nothing to loot in this room.";
    }
}
