package start;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class output {
    static void writeStringTab(String [][]tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j].replace("_", " ")+" ");
            }
            System.out.println("");
        }
    }
    static void readStringTab(String plik, String [][]tab) throws FileNotFoundException {
        Scanner skaner = new Scanner(new BufferedReader(new FileReader(plik)));
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[i].length; j++)
                if(skaner.hasNext())
                    tab[i][j] = skaner.next();
    }
}
