package start.dynamic;

import start.baza.danych;
import start.output;

import java.io.FileNotFoundException;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;

/**
 * Created by Michał on 2015-05-23.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //
        // 0-procesor, 1-płyta główna, 2-ram, 3-karta graficzna, 4-obudowa, 5-dysk, 6-akcesoria, 7-monitory, 8-systemy, 9-oprogramowanie, 10-chłodzenie, 11-karty sieciowe, 12-karty dźwiękowe, 13-napęd, 14-zasilacz, 15-cena, 16-moc
        String[] Konf= new String[]{"", "", "", "", "", "", "", "", "", "", "" ,"" ,"" ,"", "", "", "" };
        // tablica z dodatkami
        String[] KonfAdds= new String[]{"", "", "", "", "", "", "", "", "", "", "" ,"" ,"" ,"", "", "", "" };
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
        //HighCompany hc = new HighCompany();
        //Konf = hc.Start(4000);

        //Gaming game = new Gaming();
        //Konf = game.Start(7000);

        Office office = new Office();
        Konf = office.Start(1500);

        Additionals adds = new Additionals();
        KonfAdds = adds.Start(1500-parseDouble(Konf[15]));

        //aktualizacja konfiguracji o wybrane dodatki
        Konf[6]=KonfAdds[6];
        Konf[12]=KonfAdds[12];
        Konf[13]=KonfAdds[13];
        Konf[15]= String.valueOf(parseDouble(Konf[15])+parseDouble(KonfAdds[15]));
        Konf[16]= String.valueOf(parseDouble(Konf[16])+parseDouble(KonfAdds[16]));


        System.out.println("\n\n=============================================================");
        System.out.println("Konfiguracja: "+Konf[0]+"|"+Konf[1]+"|"+Konf[2]+"|"+Konf[3]+"|"+Konf[4]+"|"+Konf[5]+"|"+Konf[6]+"|"+Konf[7]+"|"+Konf[8]+"|"+Konf[9]+"|"+Konf[10]+"|"+Konf[11]+"|"+Konf[12]+"|"+Konf[13]+"|"+Konf[14]);
        System.out.println("Cena: "+Konf[15]);
        System.out.println("Moc: "+Konf[16]);
    }
}
