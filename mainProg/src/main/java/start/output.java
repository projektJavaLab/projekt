package start;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class output {
    public static void writeStringTab(String[][] tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j].replace("_", " ")+" ");
                if(j<tab[i].length-1 )
                    System.out.print(" || ");
            }
            System.out.println("");
        }
    }

    public static void writeStringTabSelect(int col, String val){
        String out;
        for (int i = 0; i < tab.length; i++) {
            out="";
            for (int j = 0; j < tab[i].length; j++) {
                out+=tab[i][j].replace("_", " ")+" ";
                if(j<tab[i].length-1)
                    out+=" || ";
            }
            if(tab[i][col]==val)
                System.out.println(out);
        }
    }
    static void readStringTab(String plik, String [][]tab) throws FileNotFoundException {
        Scanner skaner = new Scanner(new BufferedReader(new FileReader(plik)));
        for (int i = 0; i < tab.length; i++)
            for (int j = 0; j < tab[i].length; j++)
                if(skaner.hasNext())
                    tab[i][j] = skaner.next();
    }
    public static void clear() {
        for(int i=0; i<50; i++)
            System.out.println("");
    }
}
