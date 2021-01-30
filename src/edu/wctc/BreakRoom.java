package edu.wctc;

public class BreakRoom extends Room {

    public BreakRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "The lights flicker in this dimly lit and poorly cleaned break room.  The coffee maker slowly drips. A small voice from the fridge whispers 'Don't go through the front door.'";
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        if(direction == 'n') {
            return new PrinterRoom("Printer Room");
        }
        return null;
    }

    @Override
    public String getExits() {
        return "north";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if(direction == 'n') {
            return true;
        }
        return false;
    }

    @Override
    public String loot(Player player) {
        player.addToScore(700);
        player.addToInventory("A talking Ham Sandwich");
        return "A talking Ham Sandwich";
    }
}
