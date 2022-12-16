package service;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;


public class ComputerServImpTest {

    @Test
    public void generateNumb() {
        int rez = new Random().nextInt(1-0)-0;
        Assert.assertEquals(0,rez);

    }
}