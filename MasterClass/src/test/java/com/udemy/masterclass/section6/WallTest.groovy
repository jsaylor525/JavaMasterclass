package com.udemy.masterclass.section6

class WallTest extends GroovyTestCase {
    void testWall() {
        Wall wall = new Wall(5, 4);
        assert wall.area == 20.0;

        wall.setHeight(-1.5);
        assert wall.getWidth() == 5.0;
        assert wall.getHeight() == 0.0;
        assert wall.area == 0.0;
    }
}
