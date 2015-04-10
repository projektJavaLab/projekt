package start.configuration;

import start.output;

import static java.lang.System.out;

public abstract class Main {
    public abstract void List();
    public abstract double Price();
    public abstract int ID();

    public static void start() {
        output.clear();
        out.println("Rozpoczynamy konfiguracje\n");
        // procesor
        // płyta główna
        // RAM
        // obudowa
        // zasilacz
        // dysk
        // karta graficzna
        // dodatki
    }
}
