package start.Sale;

/**
 * Created by Michał on 2015-04-09.
 */
public class Main {
    public static void Start() {
        Delivery delivery = new Delivery(2015, 4, 1);
        delivery.writeAdres(Delivery.ADRES);
    }
}
