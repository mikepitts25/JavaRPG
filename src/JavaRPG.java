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

    Scanner nameGrabber = new Scanner(System.in);

    System.out.print("By what name do you wish to be known? ");
    firstName = nameGrabber.next();
    System.out.println("Pleasure to meet you " + firstName + ".");
    System.out.print("What is your surname? ");
    lastName = nameGrabber.next();

    nameGrabber.close();

    Player myPlayer = new Player(firstName, lastName);
    System.out.println("Excellent. I have you registered as " + myPlayer.getFirstName() + " " +
        myPlayer.getLastName() + ".");
