package com.jirengu;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class DogTest {
    @Test
    public void testDog() {
        Dog dog = new Dog();
        dog.setFriendly(true);
        dog.setBig(false);
        dog.setBlack(true);

        assertTrue(dog.isFriendly());
        assertFalse(dog.isBig());
        assertTrue(dog.isBlack());

        dog.setFriendly(false);
        dog.setBig(true);
        dog.setBlack(false);

        assertFalse(dog.isFriendly());
        assertTrue(dog.isBig());
        assertFalse(dog.isBlack());
    }
}
