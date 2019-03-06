package com.udemy.masterclass.section4

class MegaBytesConverterTest extends GroovyTestCase {
    void testPrintMegaBytesAndKiloBytes() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
