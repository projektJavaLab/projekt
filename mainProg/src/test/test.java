import org.junit.Assert;
import start.Sale.Payment;
import start.Sale.Price;
import start.baza.danych;
import start.configuration.Adds;

import org.junit.Assert.*;
import start.dynamic.*;

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
        //
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
