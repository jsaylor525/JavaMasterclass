package com.udemy.masterclass.composition;

public class Case {
  private String mode, manufacturer, powerSupply;
  private Dimensions dimensions;

  public Case(String mode, String manufacturer, String powerSupply, Dimensions dimensions) {
    this.mode = mode;
    this.manufacturer = manufacturer;
    this.powerSupply = powerSupply;
    this.dimensions = dimensions;
  }

  public void pressPowerButton() {
    System.out.println("Power button pressed");
  }

  public String getMode() {
    return mode;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public String getPowerSupply() {
    return powerSupply;
  }

  public Dimensions getDimensions() {
    return dimensions;
  }
}
