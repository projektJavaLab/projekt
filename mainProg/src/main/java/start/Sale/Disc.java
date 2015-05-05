package start.Sale;

import start.baza.danych;

import java.util.Scanner;

/**
 * Created by Michał on 2015-04-09.
 */
public class Disc {
    public static double procent=1;
    public static double proc_znizki() {return procent;}
    public void Greeter()
    {
        String tn;
        System.out.println("Czy masz może kod rabatowy(tak, nie): ");
        Scanner in = new Scanner(System.in);
        tn = in.nextLine();
        if(tn.equals("tak"))
            procent=znizka();
    }

    private double znizka()
    {
        System.out.println("--Zasady systemu kodow promocyjnych--");
        System.out.println("1. Mozna wprowadzic dowolna ilosc kodow.");
        System.out.println("2. Znizki sumuja sie.");
        boolean i = true;
        String kod="";
        double znizka=1, temp;
        while(i)
        {
            System.out.println("Podaj kod rabatowy: ");
            Scanner in = new Scanner(System.in);
            kod = in.nextLine();
            temp = znajdz_kod(kod);
            if(temp!=0)
            {
                znizka*=temp;
                parse_procent(znizka);
            }
            System.out.println("Masz wiecej kodow rabatowych?(tak, nie): ");
            in = new Scanner(System.in);
            kod = in.nextLine();
            if(kod.equals("Nie"))
                i=false;
        }
        return znizka;
    }

    private double znajdz_kod(String kod)
    {
        String temp="";
        int len = danych.DISC.length, i;
        boolean poprawny=false;
        for(i=0;i<len;i++)
        {
            if(danych.DISC[i][1].equals(kod))
            {
                System.out.println("Gratulacje wpisałeś poprawny kod!");
                poprawny=true;
                break;
            }
        }
        if(!poprawny)
        {
            System.out.println("Niestety nie ma takiego kodu");
            return 0;
        }
        else
        {
            return Double.parseDouble(danych.DISC[i][2]);
        }
    }

    private void parse_procent(double procent)
    {
        double temp;
        temp=(1-procent)*100;
        System.out.println("Znizka wynosi: "+temp);
    }

}
