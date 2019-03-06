package com.udemy.masterclass.section12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
  private final String theatreName;
  private final int seatsPerRow;
  private List<Seat> seats = new LinkedList<>();

  public Theatre(String theatreName, int numRows, int seatsPerRow) {
    this.theatreName = theatreName;
    this.seatsPerRow = seatsPerRow;
    int lastRow = 'A' + (numRows - 1);
    double price = 12.00;

    for (char row = 'A'; row <= lastRow; row++) {
      if (row >= 'C' && row <= 'F') {
        price += 1.00;
      }
      for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
        if (seatNum >= (seatsPerRow / 4) && seatNum <= (seatsPerRow * 3 / 4)) {
          price += 1.00;
        }
        Seat seat = new Seat(row + String.format("%02d", seatNum), price);
        seats.add(seat);
      }
    }
  }

  public String getTheatreName() {
    return theatreName;
  }

  public boolean reserveSeat(String seatNumber) {
    Seat requestSeat = new Seat(seatNumber);
    int foundSeat = Collections.binarySearch(seats, requestSeat, null);
    if (foundSeat < 0) {
      System.out.println("There is no seat " + seatNumber);
      return false;
    }

    return seats.get(foundSeat).reserve();
  }

  public void printSeats() {
    char previousSeatRow = '0';
    for (int i = 0; i < this.seatsPerRow; i++) {
      System.out.print("====");
    }
    for (Seat seat : seats) {
      if (previousSeatRow == seat.getRow()) {
        System.out.print(" " + seat.getSeatNumberIfAvailable());
      } else {
        System.out.print("\n" + seat.getSeatNumberIfAvailable());
      }
      previousSeatRow = seat.getRow();
    }
    System.out.println("");
    for (int i = 0; i < this.seatsPerRow; i++) {
      System.out.print("====");
    }
    System.out.println("");
  }

  public List<Seat> getSeats() {
    return seats;
  }

  static final Comparable<>

  private class Seat implements Comparable<Seat> {
    private final String seatNumber;
    private final double price;
    private volatile boolean reserved = false;

    public Seat(String seatNumber) {
      this.seatNumber = seatNumber;
      this.price = Double.NaN;
    }

    public Seat(String seatNumber, double price) {
      this.seatNumber = seatNumber;
      this.price = price;
    }

    public boolean reserve() {
      if (!this.reserved) {
        this.reserved = true;
        System.out.println("Seat: " + this.seatNumber + " reserved");
        return true;
      } else {
        System.out.println("Sorry seat: " + this.seatNumber + " is already reserved");
        return false;
      }
    }

    public boolean cancel() {
      if (this.reserved) {
        this.reserved = false;
        System.out.println("Seat: " + this.seatNumber + " cancelled");
        return true;
      } else {
        return false;
      }
    }

    public String getSeatNumber() {
      return seatNumber;
    }

    public char getRow() {
      return seatNumber.charAt(0);
    }

    public String getSeatNumberIfAvailable() {
      if (this.reserved) {
        return "___";
      } else {
        return seatNumber;
      }
    }

    public double getPrice() {
      return price;
    }

    @Override
    public int compareTo(Seat seat) {
      return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }
  }
}
