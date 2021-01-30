package edu.wctc;

public class JanitorsCloset extends Room {

    public JanitorsCloset(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "A musty smell comes from this cluttered closet.  Surely nothing interesting could be in here...";
    }

    @Override
    public Room getAdjoiningRoom(char direction) {
        if(direction == 'e') {
            return new PrinterRoom("Printer Room");
        }
        return null;
    }

    @Override
    public String getExits() {
        return "east";
    }

    @Override
    public boolean isValidDirection(char direction) {
        if(direction == 'e') {
            return true;
        }
        return false;
    }

    @Override
    public String exit(Player player) {
        player.addToScore(1000);
        return "You search around and find an escape hatch leading to a tunnel out of this miserable place.";
    }
}
