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
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_obudowy.hasNext())
                danych.obudowy[i][j] = skaner_obudowy.next();
        Scanner skaner_procesory = new Scanner(new BufferedReader(new FileReader("procesory.txt")));
        // wczytywanie procesorów
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_procesory.hasNext())
                danych.procesory[i][j] = skaner_procesory.next();
        // wczytywanie płyt głównych
        Scanner skaner_plyty_glowne = new Scanner(new BufferedReader(new FileReader("plyty_glowne.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_plyty_glowne.hasNext())
                    danych.plyty_glowne[i][j] = skaner_plyty_glowne.next();
        // wczytywanie kości RAM
        Scanner skaner_RAM = new Scanner(new BufferedReader(new FileReader("RAM.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_RAM.hasNext())
                    danych.RAM[i][j] = skaner_RAM.next();
        // wczytywanie akcesoriów
        Scanner skaner_akcesoria = new Scanner(new BufferedReader(new FileReader("akcesoria.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_akcesoria.hasNext())
                    danych.akcesoria[i][j] = skaner_akcesoria.next();
        // wczytywanie dysków
        Scanner skaner_dyski = new Scanner(new BufferedReader(new FileReader("dyski.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_dyski.hasNext())
                    danych.dyski[i][j] = skaner_dyski.next();
        // wczytywanie kart graficznych
        Scanner skaner_karty_graficzne = new Scanner(new BufferedReader(new FileReader("karty_graficzne.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_karty_graficzne.hasNext())
                    danych.karty_graficzne[i][j] = skaner_karty_graficzne.next();
        // wczytywanie kart dźwiękowych
        Scanner skaner_karty_dzwiekowe = new Scanner(new BufferedReader(new FileReader("karty_dzwiekowe.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_karty_dzwiekowe.hasNext())
                    danych.karty_dzwiekowe[i][j] = skaner_karty_dzwiekowe.next();
        // wczytywanie zasilaczy
        Scanner skaner_zasilacze = new Scanner(new BufferedReader(new FileReader("zasilacze.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_zasilacze.hasNext())
                    danych.zasilacze[i][j] = skaner_zasilacze.next();
        // wczytywanie systemów
        Scanner skaner_systemy = new Scanner(new BufferedReader(new FileReader("systemy.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_systemy.hasNext())
                    danych.systemy[i][j] = skaner_systemy.next();
        // wczytywanie oprogramowania
        Scanner skaner_oprogramowanie = new Scanner(new BufferedReader(new FileReader("oprogramowanie.txt")));
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 3; j++)
                if(skaner_oprogramowanie.hasNext())
                    danych.oprogramowanie[i][j] = skaner_oprogramowanie.next();
        wypisanie();
        //
    }
    public static void wypisanie() {
        String str = danych.procesory[1][1];
        System.out.println(str);
        String str2 = danych.obudowy[1][1];
        System.out.println(str2);
    }
}
