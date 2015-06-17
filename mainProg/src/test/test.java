import org.junit.Assert;
import start.Sale.Payment;
import start.Sale.Price;
import start.baza.danych;
import start.configuration.Adds;

import org.junit.Assert.*;
import start.configuration.Run;
import start.dynamic.*;
import start.output;

import static org.junit.Assert.*;


/**
 * Created by Michał on 2015-04-23.
 */
public class test {
    @org.junit.Test
    public void test1() throws Exception {
        assertNotNull(danych.CASE);
        assertNotNull(danych.PROCESSOR);
        assertNotNull(danych.MOTHERBOARD);
        assertNotNull(danych.RAM);
        assertNotNull(danych.ACCESSORY);
        assertNotNull(danych.HARDDRIVE);
        assertNotNull(danych.GRAPHICCARD);
        assertNotNull(danych.SOUNDCARD);
        assertNotNull(danych.POWERSUPPLY);
        assertNotNull(danych.OS);
        assertNotNull(danych.SOFTWARE);
        assertNotNull(danych.SCREEN);
        assertNotNull(danych.NIC);
        assertNotNull(danych.COOLING);
        assertNotNull(danych.DRIVE);
        assertNotNull(danych.DISC);
        System.out.println("Test pierwszy zakończony pomyślnie");
    }
    @org.junit.Test
    public void test2() throws Exception {


    }
    @org.junit.Test
    public void test3() throws Exception {
        //
    }
    @org.junit.Test
    public void test4() throws Exception {
        Run r = new Run();
        RunDyn rd = new RunDyn();
        Gaming g = new Gaming();
        Gaming g2 = new Gaming();

        assertEquals(0, r.Price, 0);
        assertEquals(0, rd.kasa2, 0);
        assertEquals(0, g.Power, 0);
        int [] temp = new int[]{1,2,3,4,5,6,7,8,9,10};
        assertArrayEquals(temp, g.HD);

        assertNull(danych.PROCESSOR[1][7]);
        assertNull(danych.HARDDRIVE[2][3]);
        assertNull(danych.GRAPHICCARD[4][4]);

        output.readStringTab("../procesory.txt", danych.PROCESSOR);
        double p = Double.parseDouble(danych.PROCESSOR[1][7]);
        assertNotNull(danych.PROCESSOR[1][7]);
        assertEquals(530, p, 0);
        assertEquals(140, Double.parseDouble(danych.PROCESSOR[4][7]), 0);

        assertNotSame(g,g2);
        System.out.println("Test czwarty zakończony pomyślnie");
    }
    @org.junit.Test
    public void test5() throws Exception {
        assertNotNull(RunDyn.Konf);
        assertNotNull(RunDyn.kasa2);
        assertNotNull(RunDyn.class);
        assertNotNull(Gaming.Price);
        assertNotNull(Additionals.Price);
        assertNotNull(HighCompany.Price);
        assertNotNull(Home.Price);
        assertNotNull(Main.class);
        assertNotNull(Office.Price);
        System.out.println("Test ostatni zakończony pomyślnie");
    }
}
