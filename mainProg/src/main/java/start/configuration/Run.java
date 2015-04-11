package start.configuration;

import java.util.StringTokenizer;

public class Run {
    // cena konfiguracji
    double Price=0;
    // tablica przechowująca indexy do częsci
    // 0-procesor, 1-płyta główna, 2-ram, 3-obudowa, 4-zasilacz, 5-dysk, 6-karta graficzna, 7-akcesoria, 8-monitory, 9-oprogramowanie, 10-systemy, 11-chłodzenie, 12-karty sieciowe, 13-karty dźwiękowe, 14-napędy
    String[] Konf= new String[]{"", "", "", "", "", "", "", "", "", "", "" ,"" ,"" ,"", "" };
    // potrzebna moc
    double Power=0;
    // funkcja konfigurująca
    public void Start() {
        // Definicje
        Adds adds = new Adds();
        // Akcesoria
        String Acc =adds.Acc();
        StringTokenizer st7 = new StringTokenizer(Acc, ",;");
        while(st7.hasMoreTokens()) {
            Konf[7]+=st7.nextToken()+",";
            Price +=Double.parseDouble(st7.nextToken());
        }
        // Monitory
        String Scr =adds.Scr();
        StringTokenizer st8 = new StringTokenizer(Scr, ",;");
        while(st8.hasMoreTokens()) {
            Konf[8]+=st8.nextToken()+",";
            Price +=Double.parseDouble(st8.nextToken());
        }
        // Oprogramowanie
        String Sof =adds.Sof();
        StringTokenizer st9 = new StringTokenizer(Sof, ",;");
        while(st9.hasMoreTokens()) {
            Konf[9]+=st9.nextToken()+",";
            Price +=Double.parseDouble(st9.nextToken());
        }
        // Systemy
        String Os =adds.Os();
        StringTokenizer st10 = new StringTokenizer(Os, ",;");
        while(st10.hasMoreTokens()) {
            Konf[10]+=st10.nextToken()+",";
            Price +=Double.parseDouble(st10.nextToken());
        }
        // Chłodzenie
        String Co =adds.Co();
        StringTokenizer st11 = new StringTokenizer(Co, ",;");
        while(st11.hasMoreTokens()) {
            Konf[11]+=st11.nextToken()+",";
            Price +=Double.parseDouble(st11.nextToken());
        }
        // Karty sieciowe
        String Ni =adds.Ni();
        StringTokenizer st12 = new StringTokenizer(Ni, ",;");
        while(st12.hasMoreTokens()) {
            Konf[12]+=st12.nextToken()+",";
            Price +=Double.parseDouble(st12.nextToken());
        }
        // Karty dźwiękowe
        String Sou =adds.Sou();
        StringTokenizer st13 = new StringTokenizer(Sou, ",;");
        while(st13.hasMoreTokens()) {
            Konf[13]+=st13.nextToken()+",";
            Price +=Double.parseDouble(st13.nextToken());
        }
        if(Konf[13]!="")
            Power+=20;
        // Napędy
        String Dr =adds.Dr();
        StringTokenizer st14 = new StringTokenizer(Dr, ",;");
        while(st14.hasMoreTokens()) {
            Konf[14]+=st14.nextToken()+",";
            Price +=Double.parseDouble(st14.nextToken());
        }
    }

}
