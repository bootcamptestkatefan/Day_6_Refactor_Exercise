package com.tws.refactoring;

public class Police {

    public boolean checkDriverIsAdult(Driver driver) {
        return driver.getAge() >= 18;
    }

}
