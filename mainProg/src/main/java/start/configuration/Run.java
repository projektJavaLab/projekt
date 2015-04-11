package start.configuration;


public class Run {
    // cena konfiguracji
    double Price=0;
    // tablica przechowująca indexy do częsci
    String[] Konf= new String[]{"", "", "", "", "", "", "", ""};
    // potrzebna moc
    double Power=0;
    // funkcja konfigurująca
    public void Start() {
        //Dodatki
        Adds adds = new Adds();
        String add=adds.Do();
    }

}
