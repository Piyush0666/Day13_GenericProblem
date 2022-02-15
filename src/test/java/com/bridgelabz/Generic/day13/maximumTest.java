package com.bridgelabz.Generic.day13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class maximumTest {
    @Test
    public void threeIntegerValuesShouldReturnMaximumValues() {
        Integer Int1 = 10, Int2 = 12, Int3 = 7;
        Integer intMax = Operation.testMaximum(Int1, Int2, Int3);
        assertEquals(12, intMax);
    }
    @Test
    public void threeFloatValuesShouldReturnMaximumValues() {
        Float floatValue1 = 2.7f, floatValue2 = 19.3f, floatValue3 = 7.5f;
        Float floatMax = Operation.testMaximum(floatValue1, floatValue2, floatValue3);
        assertEquals(19.3f, floatMax);
    }
    @Test
    public void threeStringValuesShouldReturnMaximumValues() {
        String xString = "Cherry", yString = "Banana", zString = "Apple";
        String stringMax = Operation.testMaximum(xString, yString, zString);
        assertEquals("Cherry", xString);
    }
}