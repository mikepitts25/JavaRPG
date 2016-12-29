/*
 * File: Player.java
 * Author: Mike Pitts
 * Date: December 24, 2016
 * Purpose: Player character class for RPG Style game...
 */

public class Player {
  public Player(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  } //constructor with names

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

  public double getExpTotal() {
    return expTotal;
  }

  public void setExpTotal(double expTotal) {
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

  private String firstName;
  private String lastName;
  private int level;
  private double expTotal;
  private int strengthLevel;
  private int energyLevel;
  private int magicForce;
  private int lifeForce;

  public Player() { //default constructor
  }
}
