package com.udemy.masterclass.section4

class SpeedConverterTest extends GroovyTestCase {
    void testToMilesPerHour() {
        assert SpeedConverter.toMilesPerHour(1.5) == 1;
        assert SpeedConverter.toMilesPerHour(10.25) == 6;
        assert SpeedConverter.toMilesPerHour(-5.6) == -1;
        assert SpeedConverter.toMilesPerHour(25.42) == 16;
        assert SpeedConverter.toMilesPerHour(75.114) == 47;
        assert SpeedConverter.toMilesPerHour(95.75) == 60;
    }

    void testPrintConversion() {
    }
}
