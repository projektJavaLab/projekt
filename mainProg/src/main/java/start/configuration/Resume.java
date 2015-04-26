package start.configuration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Resume {


    // wznawianie konfiguracji


    public void odczytKonf(Run run) throws FileNotFoundException {
        File plik1=new File("konfiguracja.txt");
        Scanner odczyt=new Scanner(plik1);
        while (odczyt.hasNextLine())
        {
            StringTokenizer st0 = new StringTokenizer(odczyt.nextLine(), ",");
            int i=0;
            while(st0.hasMoreTokens())
            {
                run.Konf[i]+=st0.nextToken()+",";
                i++;
            }
        }
        odczyt.close();
    }

    public void odczytCenaMoc (Run run) throws FileNotFoundException {
        File plik2=new File("cena-moc.txt");
        Scanner odczyt=new Scanner(plik2);
        while (odczyt.hasNextLine())
        {
            StringTokenizer st1 = new StringTokenizer(odczyt.nextLine(), ",");
            run.Price=Double.parseDouble(st1.nextToken());
            run.Power=Integer.parseInt(st1.nextToken());
        }
        odczyt.close();
    }
}
