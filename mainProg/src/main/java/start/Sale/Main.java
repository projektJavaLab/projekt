package start.Sale;

/**
 * Created by Michał on 2015-04-09.
 */
public class Main {
    // tablica do przechowywania zamowienia
    String[] Zamowienie=new String[4]; // 0 - cena, 1 - zniżka, 2 - sposob platnosci, 3- wysylka
    public void Start(double Price) {
        Zamowienie[0]= String.valueOf(Price);
        Delivery delivery = new Delivery(2015, 4, 1);
        delivery.writeAdres(Delivery.ADRES);
        //
    }
}
