package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestForDriver {
    @Test
    void should_check_driver_age() {
        Driver driver1 = new Driver(19);
        Driver driver2 = new Driver(17);
        Police police = new Police();

        assertTrue(police.checkDriverIsAdult(driver1));
        assertFalse(police.checkDriverIsAdult(driver2));
    }

}
