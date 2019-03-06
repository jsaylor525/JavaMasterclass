package com.udemy.masterclass.section12

class TheatreTest extends GroovyTestCase {
    void testReserveSeat() {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        assert theatre.getSeats().size() == 8*12;
        theatre.printSeats();
        assert theatre.reserveSeat("H11") == true;
        assert theatre.reserveSeat("H11") == false;
        assert theatre.reserveSeat("Z01") == false;
        assert theatre.reserveSeat("A42") == false;
        assert theatre.reserveSeat("A02") == true;
        theatre.printSeats();

        List<Theatre.Seat> seatListCopy = new ArrayList<>(theatre.getSeats());
        seatListCopy.reverse();
        theatre.getSeats().forEach
    }
}
