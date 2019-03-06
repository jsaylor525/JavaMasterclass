package com.udemy.masterclass.section4;

import java.math.BigDecimal;
import java.math.MathContext;

public class DecimalComparator {
  public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
    a *= 1e3;
    b *= 1e3;
    double ra = a % 1;
    double rb = b % 1;
    a -= ra;
    b -= rb;
    return (a == b);
  }
}
