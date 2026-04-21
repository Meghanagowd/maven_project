package com.example.app;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for the App greet method.
 */
public class AppTest {

    @Test
    public void testGreet() {
        String result = App.greet("Student");
        String expected = "Hello, Student! Welcome to Maven CI/CD Demo.";
        
        assertEquals(expected, result);
    }
}
