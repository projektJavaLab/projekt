package start.dynamic;

import start.baza.danych;
import start.output;

import java.io.FileNotFoundException;

/**
 * Created by Michał on 2015-05-23.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //
        // wczytanie do bazy z plików listy części
        // wczytywanie obudów
        output.readStringTab("obudowy.txt", danych.CASE);
        // wczytywanie procesorów
        output.readStringTab("procesory.txt", danych.PROCESSOR);
        // wczytywanie płyt głównych
        output.readStringTab("plyty_glowne.txt", danych.MOTHERBOARD);
        // wczytywanie kości RAM
        output.readStringTab("RAM.txt", danych.RAM);
        // wczytywanie akcesoriów
        output.readStringTab("akcesoria.txt", danych.ACCESSORY);
        // wczytywanie dysków
        output.readStringTab("dyski.txt", danych.HARDDRIVE);
        // wczytywanie kart graficznych
        output.readStringTab("karty_graficzne.txt", danych.GRAPHICCARD);
        // wczytywanie kart dźwiękowych
        output.readStringTab("karty_dzwiekowe.txt", danych.SOUNDCARD);
        // wczytywanie zasilaczy
        output.readStringTab("zasilacze.txt", danych.POWERSUPPLY);
        // wczytywanie systemów
        output.readStringTab("systemy.txt", danych.OS);
        // wczytywanie oprogramowania
        output.readStringTab("oprogramowanie.txt", danych.SOFTWARE);
        // wczytywanie monitorów
        output.readStringTab("monitory.txt", danych.SCREEN);
        // wczytywanie kart sieciowych
        output.readStringTab("karty_sieciowe.txt", danych.NIC);
        // wczytywanie chłodzenia
        output.readStringTab("chlodzenie.txt", danych.COOLING);
        // wczytywanie napędów
        output.readStringTab("napedy.txt", danych.DRIVE);
        // wczytywanie zniżek
        output.readStringTab("znizki.txt", danych.DISC);
        //
        HighCompany hc = new HighCompany();
        hc.Start(4000);
    }
}
