package start.configuration;

import start.baza.danych;
import start.output;

import java.util.Scanner;

public class PowerSupply extends Main{
    public void List() {
        System.out.println("ID || Nazwa || Producent || MOC || STAN MAG. || CENA");
        //output.writeStringTab(danych.POWERSUPPLY);
    }
    public double Price(int id) {
        String p = danych.POWERSUPPLY[id][5];
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
        if(danych.POWERSUPPLY.length < id || id < 1)
        {
            System.out.println("Podano numer z poza zakresu, wybierz ID z podanego zbioru");
            return ID();
        }
        return id-1;
    }
    public String Psupp(double Pow) {
        String Sid="";
        Pow += 100; //rezerwa mocy
        List();
        output.writeStringTabSelectPower(danych.POWERSUPPLY, 3, Pow);
        int temp;
        temp = ID();
        while(!(Double.parseDouble(danych.POWERSUPPLY[temp][3]) >= Pow))
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
