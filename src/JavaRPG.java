/*
 * File: JavaRPG.java
 * Author: Mike Pitts
 * Date: December 24, 2016
 * Purpose: Just finished Intro to Programming (Java) and want to see what kind of game I can make =)
 * I will add to and modify this code as I learn more about the language.
 */
import java.io.IOException;

public class JavaRPG {

  public static void main(String[] args) throws IOException {
    Player myPlayer = new Player();

    myPlayer.playerCreate();
    myPlayer.getStats();

  }
}