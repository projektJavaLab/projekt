package start.Sale;

import java.util.Scanner;

/**
 * Created by Michał on 2015-04-09.
 */
public class Delivery {
    private int year, month, deliveryNum;
    public int type;
    private double fee;
    private String deliveryCode;
    public static String []ADRES=new String [6];

    public Delivery(int year, int month, int deliveryNum) {
        this.year = year;
        this.month = month;
        this.deliveryNum = deliveryNum;
        this.fee = this.calculateFee();
        this.deliveryCode = this.getCode();
        this.getAdres();
    }

    private double calculateFee() {
        System.out.print("SPOSOBY WYSYŁKI:" + "\n" + "1. Poczta Polska" + "\n" + "2. Kurier UPC" + "\n" + "Wybierz sposob wysylki: ");
        Scanner in = new Scanner(System.in);
        this.type = in.nextInt();
        if (this.type == 1) return 16;
        if (this.type == 2) return 25;
        return 0;
    }

    private String getCode() {
        String yearStr = Integer.toString(this.year);
        String lastDigit = yearStr.substring(yearStr.length() - 1);
        return String.format(lastDigit + this.month + this.deliveryNum);
    }

    private void getAdres() {
        System.out.println("");
        System.out.print("Podaj imie: ");
        Scanner in = new Scanner(System.in);
        ADRES[0] = in.nextLine();
        System.out.print("Podaj nazwisko: ");
        in = new Scanner(System.in);
        ADRES[1] = in.nextLine();
        System.out.print("Podaj ulice i nr domu: ");
        in = new Scanner(System.in);
        ADRES[2] = in.nextLine();
        System.out.print("Podaj miejscowosc: ");
        in = new Scanner(System.in);
        ADRES[3] = in.nextLine();
        System.out.print("Podaj kod pocztowy: ");
        in = new Scanner(System.in);
        ADRES[4] = in.nextLine();
        System.out.print("Podaj telefon: ");
        in = new Scanner(System.in);
        ADRES[5] = in.nextLine();
    }

    public void writeAdres(String[] tab){
        System.out.print("\nKoszt wysylki: "+this.fee+"\nKod wysylki: "+this.deliveryCode+"\nAdres wysylki:\n");
        for (int i = 0; i < tab.length; i++) {
             {
                 System.out.print(tab[i].replace("_", " ")+" ");
                 System.out.print(" || ");
             }
        }
    }
}
