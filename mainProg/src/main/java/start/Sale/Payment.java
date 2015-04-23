package start.Sale;

/**
 * Created by Michał on 2015-04-09.
 */
public class Payment {
    String[] platnosc=new String[3]; // 0 -gotowka, 1 - karta 2 - przelew
    public void wybierz_platnosc()
    {
        System.out.println("Wybierz sposób zapłaty: "+ "\n" + "1 - gotowka" + "\n" + "2- karta" + "\n" + "3 - przelew bankowy");


    }
}
