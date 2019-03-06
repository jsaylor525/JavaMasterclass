package com.udemy.masterclass.section4;

import java.util.ArrayList;

public class TeenNumberChecker {
  public static boolean hasTeen(int a, int b, int c) {
    int[] arr = {a, b, c};
    for (int i = 0; i < 3; i++) {
      if (isTeen(arr[i])) return true;
    }
    return false;
  }

  public static boolean isTeen(int a) {
    return (a >= 13 && a <= 19);
  }
}
