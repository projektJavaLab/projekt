package start.Sale;

import start.configuration.Run;

/**
 * Created by Michał on 2015-04-09.
 */
public class Main {
    // tablica do przechowywania zamowienia
    public String[] Zamowienie=new String[4]; // 0 - cena, 1 - zniżka, 2 - sposob platnosci, 3- wysylka
    public void Start(double Price, String Proc) {
        if(Proc=="")
        {
            System.out.println("Najpierw musisz skonfigurować komputer");
        }
        else
        {
            Zamowienie[0] = String.valueOf(Price);
            System.out.println(Zamowienie[0]);
            Delivery delivery = new Delivery(2015, 4, 1);
            delivery.writeAdres(Delivery.ADRES);
            //
        }
    }
}
