package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
  
    System.out.println();
    
    Game FirstGame = new Game();
    
    FirstGame.playerOne = "Player A";
    FirstGame.playerTwo = "Player B";
  
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter " + FirstGame.playerOne + " score point: ");
    FirstGame.playerOnePoint = sc.nextInt();
  
    System.out.print("Please Enter " + FirstGame.playerTwo + " score point: ");
    FirstGame.playerTwoPoint = sc.nextInt();
  
//    HashMap<String, Integer> Point = new HashMap();
//    Point.put("LOVE", 0);
//    Point.put("FIFTEEN", 1);
//    Point.put("THIRTY", 2);
//    Point.put("FORTY", 3);
//    Point.put("OVER_FORTY", 4);
  
    // CALCULATE PLAYER A POINTS
    if(FirstGame.playerOnePoint == 0) {
      FirstGame.playerOnePoint = 0;
    } else if(FirstGame.playerOnePoint == 15) {
      FirstGame.playerOnePoint = 1;
    } else if(FirstGame.playerOnePoint == 30) {
      FirstGame.playerOnePoint = 2;
    } else if(FirstGame.playerOnePoint == 40) {
      FirstGame.playerOnePoint = 3;
    } else {
      FirstGame.playerOnePoint = 4;
    }
  
    // CALCULATE PLAYER B POINTS
    if (FirstGame.playerTwoPoint == 0) {
      FirstGame.playerTwoPoint = 0;
    } else if(FirstGame.playerTwoPoint == 15) {
      FirstGame.playerTwoPoint = 1;
    } else if(FirstGame.playerTwoPoint == 30) {
      FirstGame.playerTwoPoint = 2;
    } else if(FirstGame.playerTwoPoint == 40) {
      FirstGame.playerTwoPoint = 3;
    } else {
      FirstGame.playerTwoPoint = 4;
    }
  
    // CALCULATE POINT DIFFERENCE
      String score;
      int scoreDiff = FirstGame.playerOnePoint - FirstGame.playerTwoPoint;

      if(scoreDiff == 1) {
        score = "Player A is ahead";
        System.out.println(score);
      } else if (scoreDiff == -1) {
        score = "Player B is ahead";
        System.out.println(score);
      } else if (scoreDiff >= 2 ) {
        playerAWonPoint();
      } else {
        playerBWonPoint();
      }
  
    System.out.println(FirstGame.playerOne + " score: " + FirstGame.playerOneFinalScore + FirstGame.playerOnePoint);
    System.out.println(FirstGame.playerTwo + " score: " + FirstGame.playerTwoFinalScore + FirstGame.playerTwoPoint);
    
  }
  
  public static void playerBWonPoint() {
    System.out.println("Player B Won ");
  }
  
  public static void playerAWonPoint() {
    System.out.println("Player A Won ");
  }
  
}

class Game {
  String playerOne;
  String playerTwo;
  int playerOnePoint;
  int playerTwoPoint;
  int playerOneFinalScore;
  int playerTwoFinalScore;
  
  public Game() { }
  
}


