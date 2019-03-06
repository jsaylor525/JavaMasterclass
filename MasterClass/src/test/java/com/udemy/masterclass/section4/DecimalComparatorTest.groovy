package com.udemy.masterclass.section4

class DecimalComparatorTest extends GroovyTestCase {
    void testAreEqualByThreeDecimalPlaces() {
        assert DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175) == true;
//        * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
        assert DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176) == false;
//        * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
        assert DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0) == true;
//        * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
        assert DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123) == false;
//        * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places.
        assert DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, 3.1757) == false;
        assert DecimalComparator.areEqualByThreeDecimalPlaces(3.1756, 3.1757) == true;
    }
}
