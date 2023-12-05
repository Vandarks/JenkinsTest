package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SquareTest {
    int targetX = 3;
    int targetY = 9;
    Square square;
    @BeforeEach
    void setUp() {
        square = new Square(targetX, targetY);
    }

    @Test
    void getX() {
        assertEquals(targetX, square.getX());
    }
    @Test
    void getY() {
        assertEquals(targetY, square.getY());
    }
    @Test
    void getArea() {
        assertEquals(targetX*targetY, square.getArea());
    }
}