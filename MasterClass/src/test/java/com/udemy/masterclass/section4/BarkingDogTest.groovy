package com.udemy.masterclass.section4

class BarkingDogTest extends GroovyTestCase {
    void testShouldWakeUp() {
        assert BarkingDog.shouldWakeUp(true, 1) == true;
        assert BarkingDog.shouldWakeUp(false, 2) == false;
        assert BarkingDog.shouldWakeUp(true, 8) == false;
        assert BarkingDog.shouldWakeUp(true, -1) == false;
    }
}
