package com.udemy.masterclass.section6

class CylinderTest extends GroovyTestCase {
    void testCircle() {
        Circle circle = new Circle(3.75);
        assert circle.radius == 3.75;
        assert Math.abs(circle.area - 44.178646691106465) < 0.0001;
    }

    void testCylinder() {
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        assert cylinder.radius == 5.55;
        assert cylinder.height == 7.25;
        assert Math.abs(cylinder.area - 96.76890771219959) < 0.0001;
        assert Math.abs(cylinder.volume - 701.574580913447) < 0.0001;
    }
}
