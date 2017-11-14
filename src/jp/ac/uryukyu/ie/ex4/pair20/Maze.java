package jp.ac.uryukyu.ie.ex4.pair20;

import java.io.*;

public class Maze {
    int i=0;
    int j=0;
    int [][] informnum= new int[2][2];
    String [][] inform = new String[2][2];
    String s;
    String[] lines = new String[10];
    public char[][] SetMaze(File inFile) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(inFile));
            while ((s = in.readLine()) != null) {
                /*lines[] = new String[1];*/
                lines[i] = s;
                i++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        for (i = 0; i < 2; i++) {
            inform[i] = lines[i].split(" ");
        }
        for (i = 0; i < inform.length; i++) {
            for (int j = 0; j < inform[i].length; j++) {
                informnum[i][j] = Integer.parseInt(inform[i][j]);
            }
        }


        char[][] factor = new char[informnum[1][1]][informnum[1][0]];

        for (i = 0; i < factor.length; i++) {
            for (int j = 0; j < factor[i].length; j++) {
                factor[i][j] = lines[i+2].charAt(j);
            }
        }

        return factor;
    }

    public void printMaze(File inFile){
        char[][] factorpt = SetMaze(inFile);
        int[] location = GetLocation();
        factorpt[location[0]][location[1]] = '人';
        for (i = 0; i < factorpt.length; i++) {
            for ( j = 0; j < factorpt[i].length; j++) {
                System.out.print(factorpt[i][j]);
            }
            System.out.println();
        }
    }
}
