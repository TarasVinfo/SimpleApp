package com.example.simpleapp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.simpleapp.MainActivity;

public class MainActivityTest {
    @Test
    public void test_convertCtoF() {
        float actual = MainActivity.convertCtoF(100);
        float expected = 212;
        assertEquals("Conversion from C to F failed", expected, actual, 0.001);
    }
}