package it.unimi.di.vec;

import static it.unimi.di.vec.TriangleType.*;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void test1() {
        final TriangleType type = Triangle.classify(1, 2, 3);
        assertThat(type).isEqualTo(INVALID);
    }

    @Test
    public void testScalene() {
        final TriangleType type = Triangle.classify(2, 3, 4);
        assertThat(type).isEqualTo(SCALENE);
    }

    @Test
    public void testInvalid1() {
        final TriangleType type = Triangle.classify(1, 2, 4);
        assertThat(type).isEqualTo(INVALID);
    }

    @Test
    public void testInvalid2() {
        final TriangleType type = Triangle.classify(1, 4, 2);
        assertThat(type).isEqualTo(INVALID);
    }

    @Test
    public void testInvalid3() {
        final TriangleType type = Triangle.classify(4, 1, 2);
        assertThat(type).isEqualTo(INVALID);
    }

    @Test
    public void testInvalidNeg1() {
        final TriangleType type = Triangle.classify(-1, 1, 1);
        assertThat(type).isEqualTo(INVALID);
    }

    @Test
    public void testInvalidNeg2() {
        final TriangleType type = Triangle.classify(1, -1, 1);
        assertThat(type).isEqualTo(INVALID);
    }

    @Test
    public void testInvalidNeg3() {
        final TriangleType type = Triangle.classify(1, 1, -1);
        assertThat(type).isEqualTo(INVALID);
    }

    @Test
    public void testEquilateral() {
        final TriangleType type = Triangle.classify(1, 1, 1);
        assertThat(type).isEqualTo(EQUILATERAL);
    }

    @Test
    public void testIsosceles1() {
        final TriangleType type = Triangle.classify(2, 2, 3);
        assertThat(type).isEqualTo(ISOSCELES);
    }

    @Test
    public void testIsosceles2() {
        final TriangleType type = Triangle.classify(2, 3, 2);
        assertThat(type).isEqualTo(ISOSCELES);
    }

    @Test
    public void testIsosceles3() {
        final TriangleType type = Triangle.classify(3, 2, 2);
        assertThat(type).isEqualTo(ISOSCELES);
    }

    @Test
    public void testInvalid() {
        final TriangleType type = Triangle.classify(3, 1, 1);
        assertThat(type).isEqualTo(INVALID);
    }
}
