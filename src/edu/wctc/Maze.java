package edu.wctc;

public class Maze {
    //the fields
    public Room currentRoom;
    public Player player;
    public boolean isFinished = false;

    //constructor
    public Maze(Player player) {
        this.player = player;
        this.currentRoom = new PrinterRoom("Printer Room");
    }

    public String exitCurrentRoom() {
        if(this.currentRoom.exit(this.player) != "You cannot exit the office after dark from this room.") {
            this.isFinished = true;
        }
        return this.currentRoom.exit(this.player);
    }

    public String interactWithCurrentRoom() {
        return this.currentRoom.ineract(this.player);
    }

    public String lootCurrentRoom() {
        return this.currentRoom.loot(this.player);
    }

    public boolean move(char direction) {
        if(this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
    }

    public int getPlayerScore() {
        return this.player.getScore();
    }

    public String getPlayerInventory() {
        return this.player.getInventory();
    }

    public String getCurrentRoomDescription() {
        return this.currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        return this.currentRoom.getExits();
    }

    public boolean isFinished() {
        return this.isFinished;
    }
}
