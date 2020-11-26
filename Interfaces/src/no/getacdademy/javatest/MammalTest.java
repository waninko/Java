package no.getacdademy.javatest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @org.junit.jupiter.api.Test

    void walk() {
        var cat = new Mammal("Cat");
        var actual = cat.Walk();
        var expected = "Cat walks";
        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    void eat() {
        var cat = new Mammal("Cat");
        assertEquals(cat.Eat(), "Cat eats");
    }

    @org.junit.jupiter.api.Test
    void speak() {
        var cat = new Mammal("Cat");
        assertEquals(cat.Speak(), "Cat grunts");
    }

    //test for feil
    @Test
    void somethingWrong() {
        var cat = new Mammal("Cat");
        //assertEquals(cat.Walk(), "Cat walkssssss");
        assertEquals(1, cat._name);


    }
}