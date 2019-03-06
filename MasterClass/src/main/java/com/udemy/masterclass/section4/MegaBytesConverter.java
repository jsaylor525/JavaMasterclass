package com.udemy.masterclass.section4;

public class MegaBytesConverter {
  public static final int KB_PER_MB = 1024;

  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
      System.out.println("Invalid Value");
      return;
    }
    int megaBytes = kiloBytes / KB_PER_MB;
    int reminderKiloBytes = kiloBytes % KB_PER_MB;
    System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + reminderKiloBytes + " KB");
  }
}
