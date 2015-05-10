package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class RAM extends Main{
    public void List() {
        System.out.println("ID || TYP || PRODUCENT || ROZMIAR || TAKTOWANIE || STAN MAGAZYNOWY || CENA");
        output.writeStringTab(danych.RAM);
    }

    public double Price(int id) {
        String p = danych.RAM[id][6];
        return Double.parseDouble(p);
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części, w celu zakończenia podaj 0");
        Scanner in = new Scanner(System.in);
        try
        {
            id=Integer.parseInt(in.next());
        }
        catch (NumberFormatException n)
        {
            System.out.println("Niepoprawne dane !!!");
            return ID();
        }
        if(danych.RAM.length < id || id < 0)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            return ID();
        }
        return id-1;
    }
    public String Do() {
        int wybor=0;
        String Sid="";
        List();
        int temp;
        while (true){
            temp = ID();
            while(temp==-1 && wybor==0)
            {
                System.out.println("Nie ominiesz tego, musisz wybrac przynajmniej jedną kostkę pamięci RAM!");
                temp=ID();
            }
            if(temp==-1) break;
            Sid += temp;
            Sid += ",";
            Sid += Price(temp);
            Sid += ";";
            wybor++;
        }
        return Sid;
    }
}
