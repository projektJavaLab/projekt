package start;

public class output {
    static void writeStringTab(String [][]tab){
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j].replace("_", " ")+" ");
            }
            System.out.println("");
        }
    }
}
