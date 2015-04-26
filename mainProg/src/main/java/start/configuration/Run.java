package start.configuration;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.StringTokenizer;

public class Run {
    // cena konfiguracji
     public double Price=0;
    // socket
    String Socket="";
    // tablica przechowująca indexy do częsci
    // 0-procesor, 1-płyta główna, 2-ram, 3-obudowa, 4-zasilacz, 5-dysk, 6-karta graficzna, 7-akcesoria, 8-monitory, 9-oprogramowanie, 10-systemy, 11-chłodzenie, 12-karty sieciowe, 13-karty dźwiękowe, 14-napędy
    public String[] Konf= new String[]{"", "", "", "", "", "", "", "", "", "", "" ,"" ,"" ,"", "" };
    // potrzebna moc
    int Power=0;

    //funkcja czyszcząca plik konfiguracja.txt
    public void Reset() throws FileNotFoundException {
        PrintWriter zapis = new PrintWriter("konfiguracja.txt");
    }

    // funkcja konfigurująca
    public void Start() throws FileNotFoundException {
        // Definicje
        Adds adds = new Adds();
        RAM ram = new RAM();
        Case ca = new Case();
        GraphicCard gc = new GraphicCard();
        HardDrive hdd = new HardDrive();
        PowerSupply psu = new PowerSupply();
        Processor proc = new Processor();
        Motherboard moth = new Motherboard();


        FileWriter zapis;
        try {
            new FileWriter("konfiguracja.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        PrintWriter zapis2 = new PrintWriter("cena-moc.txt");


        // Procesor
        if(Objects.equals(Konf[0], "")) {
            String Pro = proc.Proc();
            StringTokenizer st0 = new StringTokenizer(Pro, ",;");
            while (st0.hasMoreTokens()) {
                Konf[0] += st0.nextToken() + ",";
                Price += Double.parseDouble(st0.nextToken());
                Socket += st0.nextToken();
                Power += Integer.parseInt(st0.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[0]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Płyta główna
        if(Objects.equals(Konf[1], "")) {
            String Moth = moth.Mb(Socket);
            StringTokenizer st1 = new StringTokenizer(Moth, ",;");
            while (st1.hasMoreTokens()) {
                Konf[1] += st1.nextToken() + ",";
                Price += Double.parseDouble(st1.nextToken());
                Power += 50;
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[1]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Ram
        if(Objects.equals(Konf[2], "")) {
            String Ram = ram.Do();
            StringTokenizer st2 = new StringTokenizer(Ram, ",;");
            while (st2.hasMoreTokens()) {
                Konf[2] += st2.nextToken() + ",";
                Price += Double.parseDouble(st2.nextToken());
                Power += 5;
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[2]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Karta graficzna
        if(Objects.equals(Konf[3], "")) {
            String Gc = gc.Gcard();
            StringTokenizer st3 = new StringTokenizer(Gc, ",;");
            while (st3.hasMoreTokens()) {
                Konf[3] += st3.nextToken() + ",";
                Price += Double.parseDouble(st3.nextToken());
                Power += Integer.parseInt(st3.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[3]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Obudowa
        if(Objects.equals(Konf[4], "")) {
            String Ca = ca.Do();
            StringTokenizer st4 = new StringTokenizer(Ca, ",;");
            while (st4.hasMoreTokens()) {
                Konf[4] += st4.nextToken() + ",";
                Price += Double.parseDouble(st4.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[4]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Dysk twardy
        if(Objects.equals(Konf[5], "")) {
            String Hdd = hdd.Hdd();
            StringTokenizer st5 = new StringTokenizer(Hdd, ",;");
            while (st5.hasMoreTokens()) {
                Konf[5] += st5.nextToken() + ",";
                Price += Double.parseDouble(st5.nextToken());
                Power += 10;
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[5]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Akcesoria
        if(Objects.equals(Konf[6], "")) {
            String Acc = adds.Acc();
            StringTokenizer st6 = new StringTokenizer(Acc, ",;");
            while (st6.hasMoreTokens()) {
                Konf[6] += st6.nextToken() + ",";
                Price += Double.parseDouble(st6.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[6]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Monitory
        if(Objects.equals(Konf[7], "")) {
            String Scr = adds.Scr();
            StringTokenizer st7 = new StringTokenizer(Scr, ",;");
            while (st7.hasMoreTokens()) {
                Konf[7] += st7.nextToken() + ",";
                Price += Double.parseDouble(st7.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[7]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Systemy
        if(Konf[8]=="") {
            String Os = adds.Os();
            StringTokenizer st8 = new StringTokenizer(Os, ",;");
            while (st8.hasMoreTokens()) {
                Konf[8] += st8.nextToken() + ",";
                Price += Double.parseDouble(st8.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[8]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Oprogramowanie
        if(Objects.equals(Konf[9], "")) {
            String Sof = adds.Sof();
            StringTokenizer st9 = new StringTokenizer(Sof, ",;");
            while (st9.hasMoreTokens()) {
                Konf[9] += st9.nextToken() + ",";
                Price += Double.parseDouble(st9.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[9]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Chłodzenie
        if(Objects.equals(Konf[10], "")) {
            String Co = adds.Co();
            StringTokenizer st10 = new StringTokenizer(Co, ",;");
            while (st10.hasMoreTokens()) {
                Konf[10] += st10.nextToken() + ",";
                Price += Double.parseDouble(st10.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[10]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        // Karty sieciowe
        if(Objects.equals(Konf[11], "")) {
            String Ni = adds.Ni();
            StringTokenizer st11 = new StringTokenizer(Ni, ",;");
            while (st11.hasMoreTokens()) {
                Konf[11] += st11.nextToken() + ",";
                Price += Double.parseDouble(st11.nextToken());
                Power += 3;
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[11]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }
        // Karty dźwiękowe
        if(Objects.equals(Konf[12], "")) {
            String Sou = adds.Sou();
            StringTokenizer st12 = new StringTokenizer(Sou, ",;");
            while (st12.hasMoreTokens()) {
                Konf[12] += st12.nextToken() + ",";
                Price += Double.parseDouble(st12.nextToken());
                Power += 20;
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[12]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        //Napęd
        if(Objects.equals(Konf[13], "")) {
            String Dr = adds.Dr();
            StringTokenizer st13 = new StringTokenizer(Dr, ",;");
            while (st13.hasMoreTokens()) {
                Konf[13] += st13.nextToken() + ",";
                Price += Double.parseDouble(st13.nextToken());
                Power += 25;
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[13]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }

        //Zasilacz
        if(Objects.equals(Konf[14], "")) {
            String Psu = psu.Psupp(Power);
            StringTokenizer st14 = new StringTokenizer(Psu, ",;");
            while (st14.hasMoreTokens()) {
                Konf[14] += st14.nextToken() + ",";
                Price += Double.parseDouble(st14.nextToken());
            }
            //---------
            try {
                zapis = new FileWriter("konfiguracja.txt", true);
                zapis.write(Konf[14]);
                zapis.write(";");
                zapis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            zapis2 = new PrintWriter("cena-moc.txt");
            zapis2.print(Price + "," + Power);
            zapis2.close();
            //---------
        }
        System.out.println("Konfiguracja: "+Konf[0]+"|"+Konf[1]+"|"+Konf[2]+"|"+Konf[3]+"|"+Konf[4]+"|"+Konf[5]+"|"+Konf[6]+"|"+Konf[7]+"|"+Konf[8]+"|"+Konf[9]+"|"+Konf[10]+"|"+Konf[11]+"|"+Konf[12]+"|"+Konf[13]+"|"+Konf[14]);
        System.out.println("Cena: "+Price);
        System.out.println("Moc: "+Power);
    }

}
