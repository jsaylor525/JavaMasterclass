package com.udemy.masterclass.section5

class NumberInWordTest extends GroovyTestCase {
    void testNumberInWord() {
        assert NumberInWord.printNumberInWord(0) == "ZERO";
        assert NumberInWord.printNumberInWord(1) == "ONE";
        assert NumberInWord.printNumberInWord(2) == "TWO";
        assert NumberInWord.printNumberInWord(9) == "NINE";
        assert NumberInWord.printNumberInWord(10) == "OTHER";
        assert NumberInWord.printNumberInWord(-5) == "OTHER";
    }
}
