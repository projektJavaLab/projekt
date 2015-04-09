package start;

import start.baza.danych;
import start.configuration.Main;

import java.io.FileNotFoundException;

public class start {
    public static void main(String[] args) throws FileNotFoundException {
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
        // testowanie

        output.writeStringTab(danych.SCREEN);
        System.out.println("");
        output.writeStringTab(danych.SOFTWARE);
        System.out.println("");
        output.writeStringTab(danych.ACCESSORY);
        System.out.println("");
        output.writeStringTab(danych.RAM);
        System.out.println("");
        output.writeStringTab(danych.PROCESSOR);
        System.out.println("");
        output.writeStringTab(danych.HARDDRIVE);
        System.out.println("");
        output.writeStringTab(danych.GRAPHICCARD);
        System.out.println("");
        output.writeStringTab(danych.DRIVE);
        System.out.println("");
        output.writeStringTab(danych.MOTHERBOARD);
        System.out.println("");
        output.writeStringTab(danych.OS);
        System.out.println("");
        output.writeStringTab(danych.POWERSUPPLY);
        System.out.println("");
        output.writeStringTab(danych.CASE);
        System.out.println("");
        output.writeStringTab(danych.NIC);
        System.out.println("");
        output.writeStringTab(danych.COOLING);
        System.out.println("");
        output.writeStringTab(danych.SOUNDCARD);
        System.out.println("");

        // TU BĘDZIE JAKIEŚ MENU (switch ?)
        // zaczynamy konfiguracje
        Main.start();
        // sprzedaż
        // wznowienie konfiguracji

    }
}
