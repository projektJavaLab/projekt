package start;

import start.baza.danych;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class start {
    public static void main(String[] args) throws FileNotFoundException {
        // wczytanie do bazy z plików listy części
        // wczytywanie obudów

        Scanner skaner_obudowy = new Scanner(new BufferedReader(new FileReader("obudowy.txt")));
        for (int i = 0; i < danych.CASE.length; i++)
            for (int j = 0; j < danych.CASE[i].length; j++)
                if(skaner_obudowy.hasNext())
                danych.CASE[i][j] = skaner_obudowy.next();
        Scanner skaner_procesory = new Scanner(new BufferedReader(new FileReader("procesory.txt")));
        // wczytywanie procesorów
        for (int i = 0; i < danych.PROCESSOR.length; i++)
            for (int j = 0; j < danych.PROCESSOR[i].length; j++)
                if(skaner_procesory.hasNext())
                danych.PROCESSOR[i][j] = skaner_procesory.next();
        // wczytywanie płyt głównych
        Scanner skaner_plyty_glowne = new Scanner(new BufferedReader(new FileReader("plyty_glowne.txt")));
        for (int i = 0; i < danych.MOTHERBOARD.length; i++)
            for (int j = 0; j < danych.MOTHERBOARD[i].length; j++)
                if(skaner_plyty_glowne.hasNext())
                    danych.MOTHERBOARD[i][j] = skaner_plyty_glowne.next();
        // wczytywanie kości RAM
        Scanner skaner_RAM = new Scanner(new BufferedReader(new FileReader("RAM.txt")));
        for (int i = 0; i < danych.RAM.length; i++)
            for (int j = 0; j < danych.RAM[i].length; j++)
                if(skaner_RAM.hasNext())
                    danych.RAM[i][j] = skaner_RAM.next();
        // wczytywanie akcesoriów
        Scanner skaner_akcesoria = new Scanner(new BufferedReader(new FileReader("akcesoria.txt")));
        for (int i = 0; i < danych.ACCESSORY.length; i++)
            for (int j = 0; j < danych.ACCESSORY[i].length; j++)
                if(skaner_akcesoria.hasNext())
                    danych.ACCESSORY[i][j] = skaner_akcesoria.next();
        // wczytywanie dysków
        Scanner skaner_dyski = new Scanner(new BufferedReader(new FileReader("dyski.txt")));
        for (int i = 0; i < danych.HARDDRIVE.length; i++)
            for (int j = 0; j < danych.HARDDRIVE[i].length; j++)
                if(skaner_dyski.hasNext())
                    danych.HARDDRIVE[i][j] = skaner_dyski.next();
        // wczytywanie kart graficznych
        Scanner skaner_karty_graficzne = new Scanner(new BufferedReader(new FileReader("karty_graficzne.txt")));
        for (int i = 0; i < danych.GRAPHICCARD.length; i++)
            for (int j = 0; j < danych.GRAPHICCARD[i].length; j++)
                if(skaner_karty_graficzne.hasNext())
                    danych.GRAPHICCARD[i][j] = skaner_karty_graficzne.next();
        // wczytywanie kart dźwiękowych
        Scanner skaner_karty_dzwiekowe = new Scanner(new BufferedReader(new FileReader("karty_dzwiekowe.txt")));
        for (int i = 0; i < danych.SOUNDCARD.length; i++)
            for (int j = 0; j < danych.SOUNDCARD[i].length; j++)
                if(skaner_karty_dzwiekowe.hasNext())
                    danych.SOUNDCARD[i][j] = skaner_karty_dzwiekowe.next();
        // wczytywanie zasilaczy
        Scanner skaner_zasilacze = new Scanner(new BufferedReader(new FileReader("zasilacze.txt")));
        for (int i = 0; i < danych.POWERSUPPLY.length; i++)
            for (int j = 0; j < danych.POWERSUPPLY[i].length; j++)
                if(skaner_zasilacze.hasNext())
                    danych.POWERSUPPLY[i][j] = skaner_zasilacze.next();
        // wczytywanie systemów
        Scanner skaner_systemy = new Scanner(new BufferedReader(new FileReader("systemy.txt")));
        for (int i = 0; i < danych.OS.length; i++)
            for (int j = 0; j < danych.OS[i].length; j++)
                if(skaner_systemy.hasNext())
                    danych.OS[i][j] = skaner_systemy.next();
        // wczytywanie oprogramowania
        Scanner skaner_oprogramowanie = new Scanner(new BufferedReader(new FileReader("oprogramowanie.txt")));
        for (int i = 0; i < danych.SOFTWARE.length; i++)
            for (int j = 0; j < danych.SOFTWARE[i].length; j++)
                if(skaner_oprogramowanie.hasNext())
                    danych.SOFTWARE[i][j] = skaner_oprogramowanie.next();
        // wczytywanie monitorów
        Scanner skaner_monitory = new Scanner(new BufferedReader(new FileReader("monitory.txt")));
        for (int i = 0; i < danych.SCREEN.length; i++)
            for (int j = 0; j < danych.SCREEN[i].length; j++)
                if(skaner_monitory.hasNext())
                    danych.SCREEN[i][j] = skaner_monitory.next();
        // wczytywanie kart sieciowych
        Scanner skaner_karty_sieciowe = new Scanner(new BufferedReader(new FileReader("karty_sieciowe.txt")));
        for (int i = 0; i < danych.NIC.length; i++)
            for (int j = 0; j < danych.NIC[i].length; j++)
                if(skaner_karty_sieciowe.hasNext())
                    danych.NIC[i][j] = skaner_karty_sieciowe.next();
        // wczytywanie chłodzenia
        Scanner skaner_chlodzenie = new Scanner(new BufferedReader(new FileReader("chlodzenie.txt")));
        for (int i = 0; i < danych.COOLING.length; i++)
            for (int j = 0; j < danych.COOLING[i].length; j++)
                if(skaner_chlodzenie.hasNext())
                    danych.COOLING[i][j] = skaner_chlodzenie.next();
        // wczytywanie napędów
        Scanner skaner_napedy = new Scanner(new BufferedReader(new FileReader("napedy.txt")));
        for (int i = 0; i < danych.DRIVE.length; i++)
            for (int j = 0; j < danych.DRIVE[i].length; j++)
                if(skaner_napedy.hasNext())
                    danych.DRIVE[i][j] = skaner_napedy.next();
        // test
        output.writeStringTab(danych.SCREEN);
        output.writeStringTab(danych.SOFTWARE);
        output.writeStringTab(danych.ACCESSORY);
        //
    }
}
