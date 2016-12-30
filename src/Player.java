/*
 * File: Player.java
 * Author: Mike Pitts
 * Date: December 24, 2016
 * Purpose: Player character class for RPG Style game...
 */

import java.util.Scanner;
import java.util.Random;

public class Player {
  // player fields
  private String firstName;
  private String lastName;
  private String className;
  private String gender;
  private int level = 1;
  private int expTotal = 0;
  private int strengthLevel;
  private int energyLevel = 100;
  private int magicForce = 100;
  private int lifeForce = 100;

  public Player() { //default constructor
  }

  //Getters and Setters

  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getExpTotal() {
    return expTotal;
  }

  public void setExpTotal(int expTotal) {
    this.expTotal = expTotal;
  }

  public int getStrengthLevel() {
    return strengthLevel;
  }

  public void setStrengthLevel(int strengthLevel) {
    this.strengthLevel = strengthLevel;
  }

  public int getEnergyLevel() {
    return energyLevel;
  }

  public void setEnergyLevel(int energyLevel) {
    this.energyLevel = energyLevel;
  }

  public int getMagicForce() {
    return magicForce;
  }

  public void setMagicForce(int magicForce) {
    this.magicForce = magicForce;
  }

  public int getLifeForce() {
    return lifeForce;
  }

  public void setLifeForce(int lifeForce) {
    this.lifeForce = lifeForce;
  }

  public void chooseClass(){
    int classChoice;
    boolean choose = true;
    Scanner stdin = new Scanner(System.in);


    //loop through the class selection until we get a valid input from the user
    do {

      System.out.print("Choose your class: \n" +
          "(1) Warrior \n" +
          "(2) Rogue \n" +
          "(3) Wizard \n" +
          "(4) Ranger ");

      //handle some Exceptions caused by input mismatch, etc.
      try {

        classChoice = stdin.nextInt();

        switch (classChoice){
          case 1:
            setClassName("Warrior");
            choose = false;
            break;
          case 2:
            setClassName("Rogue");
            choose = false;
            break;
          case 3:
            setClassName("Wizard");
            choose = false;
            break;
          case 4:
            setClassName("Ranger");
            choose = false;
            break;
          default:
            System.out.println("Invalid selection. Please try again.");
            break;
        }

      } catch (Exception e) {

        System.out.println("You can't do that!");
        stdin.next(); //need this to consume last scanner input and ask for another

      }

    } while (choose);

    System.out.printf("You have chosen the way of the %s. Good luck.\n", getClassName());

  }

  public void chooseGender(){
    int genderChoice;
    boolean choose = true;
    Scanner stdin = new Scanner(System.in);


    //loop through the gender selection until we get a valid input from the user
    do {

      System.out.print("Are you male or female?\n" +
          " (1) Male\n" +
          " (2) Female ");

      //handle some Exceptions caused by input mismatch, etc.
      try {

        genderChoice = stdin.nextInt();

        switch (genderChoice){
          case 1:
            setGender("male");
            choose = false;
            break;
          case 2:
            setGender("female");
            choose = false;
            break;
          default:
            System.out.println("Invalid selection. Please try again.");
            break;
        }

      } catch (Exception e) {

        System.out.println("You can't do that!");
        stdin.next(); //need this to consume last scanner input and ask for another

      }

    } while (choose);
    System.out.printf("You are a %s. \n", getGender());

  }

  public void strLvl(){
    boolean again = true;
    Random rand = new Random();
    int strLvl;
    int choice;
    Scanner stdin = new Scanner(System.in);

    do {

      strLvl = 1 + rand.nextInt(15);
      System.out.println("Strength is: "+ strLvl + ".");
      System.out.print("Reroll strength? \n" +
          "(1) Yes \n" +
          "(2) No ");

      try {
        choice = stdin.nextInt();

        switch (choice) {
          case 1:
            System.out.println("Rerolling...");
            break;
          case 2:
            setStrengthLevel(strLvl);
            again = false;
            break;
          default:
            System.out.print("Invalid response. Try again.");
            break;
        }
      } catch (Exception e) {
        System.out.println("You can't do that!");
        stdin.next();
      }

    } while (again);

    System.out.printf("Your strength is set to %d.\n", getStrengthLevel());

  }

  public void playerCreate(){
    String fName;
    String lName;
    Scanner stdin = new Scanner(System.in);

    System.out.print("Please enter your character's first name: ");
    fName = stdin.next();
    setFirstName(fName);

    System.out.print("Please enter your character's last name: ");
    lName = stdin.next();
    setLastName(lName);

    System.out.printf("Welcome to this super fun JavaRPG game, %s %s.\n", getFirstName(), getLastName());

    chooseClass();
    chooseGender();
    strLvl();

  }

  public void getStats(){
    System.out.printf("Character Name: %s %s\n" +
        "Level: %d\n" +
        "Experience: %d\n" +
        "Strength: %d\n" +
        "Life Force: %d\n" +
        "Magic Force: %d \n" +
        "Energy Level: %d", getFirstName(), getLastName(), getLevel(), getExpTotal(), getStrengthLevel(), getLifeForce(),
        getMagicForce(), getEnergyLevel());
  }

}
