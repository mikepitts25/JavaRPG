/*
 * File: Player.java
 * Author: Mike Pitts
 * Date: December 24, 2016
 * Purpose: Player character class for RPG Style game...
 */

import java.util.Scanner;

public class Player {
  // player fields
  private String firstName;
  private String lastName;
  private int gender = 1;
  private int level = 1;
  private int expTotal = 0;
  private int strengthLevel = 10;
  private int energyLevel = 100;
  private int magicForce = 100;
  private int lifeForce = 100;

  public Player() { //default constructor
  }

  public Player(String firstName, String lastName, int gender) { //constructor with name fields
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
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
    int classChoice = 0;
    Scanner stdin = new Scanner(System.in);
    System.out.print("Choose your class: \n" +
        "(1) Warrior \n" +
        "(2) Rogue \n" +
        "(3) Wizard \n" +
        "(4) Archer ");

    classChoice = stdin.nextInt();
    stdin.close();

  }


}
