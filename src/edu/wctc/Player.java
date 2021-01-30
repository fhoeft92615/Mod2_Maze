package edu.wctc;

import java.util.List;

public class Player {
    private int score = 0;
    private List<String> inventory;

    public void addToInventory(String item) {
        this.inventory.add(item);
    }

    public void addToScore(int points) {
        this.score += points;
    }

    public String getInventory() {
        if(this.inventory.size() == 0) {
            return "Inventory is empty";
        } else {
            var inventoryStr = String.join(", ", this.inventory);
            return "Inventory contains: " + inventoryStr;
        }
    }

    public int getScore() {
        return this.score;
    }
}
