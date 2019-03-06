package com.udemy.masterclass.section4

class LeapYearTest extends GroovyTestCase {
    void testIsLeapYear() {
        assert LeapYear.isLeapYear(-1600) == false;
        assert LeapYear.isLeapYear(1600) == true;
        assert LeapYear.isLeapYear(2017) == false;
        assert LeapYear.isLeapYear(2000) == true;
    }

    void testGetDaysInMonth() {
        assert LeapYear.getDaysInMonth(1, 2020) == 31;
        assert LeapYear.getDaysInMonth(2, 2020) == 29;
        assert LeapYear.getDaysInMonth(2, 2018) == 28;
        assert LeapYear.getDaysInMonth(-1, 2020) == -1;
        assert LeapYear.getDaysInMonth(1, -2020) == -1;
    }
}
