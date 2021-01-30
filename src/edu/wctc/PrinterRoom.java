package edu.wctc;

public class PrinterRoom extends Room {

    public PrinterRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "You see a wall of office printers. A loud unearthly screech emits from them as they simultaneously turn on and begin spewing forth copies.";
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        if(direction == 's') {
            return new BreakRoom("Break Room");
        }
        if(direction == 'w') {
            return new JanitorsCloset("Janitor's Closet");
        }
        return null;
    }

    @Override
    public String getExits() {
        return "south and west";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if (direction == 's' || direction =='w') {
            return true;
        }
        return false;
    }

    @Override
    public String ineract(Player player) {
        player.addToScore(500);
        return "You pull the plug on the printers and the cacophony finally stops.  Looking at the mess on the floor you see hundreds of copies of a picture of yourself with the word 'Missing' across the top of each photo.";
    }
}
