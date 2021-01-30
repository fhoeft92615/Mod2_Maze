package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Maze maze = new Maze(player);
        Scanner input = new Scanner(System.in);
        while (!maze.isFinished()) {
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println("You can exit in these directions: " + maze.getCurrentRoomExits());
            var command = input.next().charAt(0);
            var outcome = "";
            switch (command) {
                case 'n':
                case 's':
                case 'e':
                case 'w':
                case 'u':
                case 'd':
                    var playerMoved = maze.move(command);
                    if(!playerMoved) {
                        outcome = "You cannot move in that direction.";
                    }
                    break;
                case 'i':
                    outcome = maze.interactWithCurrentRoom();
                    break;
                case 'l':
                    outcome = maze.lootCurrentRoom();
                    break;
                case 'x':
                    outcome = maze.exitCurrentRoom();
                    break;
                case 'v':
                    outcome = maze.getPlayerInventory();
                    break;
            }
            System.out.println(outcome);
        }
        System.out.println("Congratulations you escaped the office after dark.");
        System.out.println("Your score: " + maze.getPlayerScore());

    }
}
