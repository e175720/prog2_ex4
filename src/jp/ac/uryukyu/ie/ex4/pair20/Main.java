package jp.ac.uryukyu.ie.ex4.pair20;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        File inFile = new File("/Users/jaejinan/IdeaProjects/prog2_ex4/doc", "map.txt");
        Maze maze = new Maze();
        Player player = new player;
        maze.printMaze(inFile);

        int count = 0;
        String message ="";
        while(player.judge() == false) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter direction to move:");
            message = scan.nextLine();
            player.move(message);
            maze.printMaze(inFile);
            count++;
        }
    }
}
