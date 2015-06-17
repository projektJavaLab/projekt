package start;

import start.Sale.Main;
import start.baza.danych;
import start.configuration.Resume;
import start.configuration.Run;
import start.dynamic.RunDyn;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class start {
    static double cena=0.0;
    static String proc="";
    static boolean koniec=true;
    public static boolean read() throws FileNotFoundException {
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
        return true;
    }
    public static void main(String[] args) throws FileNotFoundException {
        read();
        // start
        while(koniec)
        {
        System.out.println("Wybierz co chcesz zrobic: k - konfiguracja, p - konfiguracja pod zastosowanie, w - wznowienie konfiguracji, z - zakup, s - wyjscie");
        Scanner in = new Scanner(System.in);
        String wybor = in.nextLine();
        wybor.toLowerCase();
            if (wybor.equals("w")) {
                Run run = new Run();
                Resume resume = new Resume();
                resume.odczytKonf(run);
                resume.odczytCenaMoc(run);
                run.Start();
                run = new Run();
                run.Reset();
                run.Start();
                cena = run.Price;
                proc = run.Konf[0];
                Main main = new Main();
                main.Start(cena, proc);
            } else if(wybor.equals("p")){
                RunDyn rundyn = new RunDyn();
                rundyn.main();
                cena = Double.parseDouble(rundyn.Konf[15]);
                proc = rundyn.Konf[0];
                Main main = new Main();
                main.Start(cena, proc);
            }
            else if (wybor.equals("k")) {
                Run run = new Run();
                run.Reset();
                run.Start();
                cena = run.Price;
                proc = run.Konf[0];
                Main main = new Main();
                main.Start(cena, proc);
            } else if (wybor.equals("z")) {
                Main main = new Main();
                main.Start(cena, proc);
            } else if (wybor.equals("s")) {
                return;
            }
        }




    }
}
