package com.udemy.masterclass.section5;

public class NumberInWord {
  public enum Number {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9);

    private final int value;

    Number(int value) {
      this.value = value;
    }
  }

  public static void printNumberInWord(int number) {
    for (Number n : Number.values()) {
      if (number == n.value) {
        System.out.println(n);
        return;
      }
    }
    System.out.println("OTHER");
  }
}
