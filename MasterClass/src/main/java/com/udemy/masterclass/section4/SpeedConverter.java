package com.udemy.masterclass.section4;

public class SpeedConverter {
  static final double MILES_PER_KILOMETER = 0.6214;
  static final double KMPH_PER_MPH = 1.609;

  // write your code here
  public static long toMilesPerHour(double kilometersPerHour) {
    if (kilometersPerHour < 0) return -1;
    double milePerHour = 0.0;
    milePerHour = kilometersPerHour / KMPH_PER_MPH;
    return (long) Math.round(milePerHour);
  }

  public static void printConversion(double kilometersPerHour) {
    // "XX km/h = YY mi/h".
    long milesPerHour = toMilesPerHour(kilometersPerHour);
    if (milesPerHour < 0) {
      System.out.println("Invalid Value");
    } else {
      System.out.println(
          kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
  }
}
