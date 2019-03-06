package com.udemy.masterclass.section4;

public class LeapYear {
  private enum Step {
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE
  }

  public static boolean isLeapYear(int year) {
    if (year <= 9999 && year >= 1) {

      Step step = Step.ONE;

      while (true) {
        switch (step) {
          case ONE:
            if (year % 4 == 0) {
              step = Step.TWO;
            } else {
              step = Step.FIVE;
            }
            break;
          case TWO:
            if (year % 100 == 0) {
              step = Step.THREE;
            } else {
              step = Step.FOUR;
            }
            break;
          case THREE:
            if (year % 400 == 0) {
              step = Step.FOUR;
            } else {
              step = Step.FIVE;
            }
            break;
          case FOUR:
            return true;
          default:
            return false;
        }
      }
    }
    return false;
  }

  public enum Months {
    JANUARY(1, 31),
    FEBUARY(2, 28),
    MARCH(3, 31),
    APRIL(4, 30),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUGUST(8, 31),
    SEPTEMBER(9, 30),
    OCTOBER(10, 31),
    NOVEMBER(11, 30),
    DECEMBER(12, 31);

    private int value;
    private int days;

    Months(int value, int days) {
      this.value = value;
      this.days = days;
    }

    public int getDays(int year) {
      if (this.value == FEBUARY.value && isLeapYear(year)) return this.days + 1;
      else return days;
    }
  }

  public static int getDaysInMonth(int month, int year) {
    if (month < 1 || month > 12) return -1;
    if (year < 1 || year > 9999) return -1;
    for (Months m : Months.values()) {
      if (month == m.value) {
        return m.getDays(year);
      }
    }
    return -1;
  }
}
