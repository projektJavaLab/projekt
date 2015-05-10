package start.configuration;

import start.baza.danych;
import start.output;
import java.util.Scanner;


public class Motherboard extends Main {
    public void List() {
        System.out.println("ID || PRODUCENT || MODEL || CHIPSET || SOCKET || FORMAT || STAN MAG. || CENA");
    }
    public double Price(int id) {
        String p = danych.MOTHERBOARD[id][7];
        return Double.parseDouble(p);
    }
    public int ID() {
        int id=0;
        System.out.println("Podaj ID części");
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
        if(danych.MOTHERBOARD.length < id || id < 1)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            return ID();
        }
        return id-1;
    }
    public String Mb(String processor){
        String Sid="";
        List();
        output.writeStringTabSelect(danych.MOTHERBOARD, 4, processor);

        //output.writeStringTab(danych.MOTHERBOARD);
        int temp;
        temp = ID();
        while(!(danych.MOTHERBOARD[temp][4].equals(processor)))
        {
            System.out.println("Musisz wybrac tylko z podanego zbioru !!!");
            temp=ID();
        }
        Sid += temp;
        Sid += ",";
        Sid += Price(temp);
        Sid += ";";
        return Sid;
    }
}
