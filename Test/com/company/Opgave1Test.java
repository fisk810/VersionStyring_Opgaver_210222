package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class Opgave1Test {

    @Test
    public void f() {
        Opgave1 op1 = new Opgave1();
        int res = op1.f(13);
        assertEquals(4,res);
    }

    @Test
    public void udskriv() {
        Opgave1 op1 = new Opgave1();
        boolean res = op1.udskriv(100,"0u08sudf89dhuf");
        assertTrue(res);
    }
}