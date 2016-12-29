/*
 * File: JavaRPG.java
 * Author: Mike Pitts
 * Date: December 24, 2016
 * Purpose: Just finished Intro to Programming (Java) and want to see what kind of game I can make =)
 * I will add to and modify this code as I learn more about the language.
 */
import java.util.Scanner;

public class JavaRPG {

  public static void main(String[] args) {
    String firstName;
    String lastName;
    int gender;

    Scanner nameGrabber = new Scanner(System.in);

    //set player fields to send to constructor
    System.out.print("By what name do you wish to be known? ");
    firstName = nameGrabber.next();
    System.out.println("Pleasure to meet you " + firstName + ".");
    System.out.print("What is your surname? ");
    lastName = nameGrabber.next();
    System.out.print("Lastly, what is your gender? ");
    gender = nameGrabber.nextInt();

    nameGrabber.close();

    Player myPlayer = new Player(firstName, lastName, gender);
    System.out.println("Excellent. I have you registered as " + myPlayer.getFirstName() + " " +
        myPlayer.getLastName() + ".");
    System.out.println(myPlayer.getGender() + " will be your documented gender.");
  }
}