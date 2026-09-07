package com.devops.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreeting() {
        App app = new App();
        assertEquals("Hello from a Gradle-built Java app!", app.greeting());
    }
}
