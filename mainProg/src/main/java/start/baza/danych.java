package start.baza;

public class danych {

    public static String [][]CASE=new String [2][3];
    public static String [][]PROCESSOR=new String [20][8];
    public static String [][]MOTHERBOARD=new String [2][3];
    public static String [][]RAM=new String [10][7];
    public static String [][]ACCESSORY=new String [3][5];
    public static String [][]HARDDRIVE=new String [10][6];
    public static String [][]GRAPHICCARD=new String [10][7];
    public static String [][]SOUNDCARD=new String [2][3];
    public static String [][]POWERSUPPLY=new String [2][3];
    public static String [][]OS=new String [2][3];
    public static String [][]SOFTWARE=new String [3][5];
    public static String [][]SCREEN=new String [3][5];
    public static String [][]COOLING=new String [2][3];
    public static String [][]NIC=new String [2][3];
    public static String [][]DRIVE=new String [2][3];
}

// monitory - SCREEN
/*
ID || NAZWA || CENA || STAN MAGAZYNOWY || OPIS/KOMENTARZ
 */
// oprogramowanie - SOFTWARE
/*
ID || NAZWA || CENA || STAN MAGAZYNOWY || OPIS/KOMENTARZ
 */
// akcesoria - ACCESSORY
/*
ID || NAZWA || CENA || STAN MAGAZYNOWY || OPIS/KOMENTARZ
 */
// procesory - PROCESSOR
/*
ID || PRODUCENT || MODEL || RDZENIE || TAKTOWANIE || SOCKET || STAN MAGAZYNOWY || CENA
 */
// RAM - RAM
/*
ID || TYP || PRODUCENT || WIELKOŚĆ (GB) || TAKTOWANIE || STAN MAGAZYNOWY || CENA
 */
// dyski - HARDDRIVE
/*
ID || TYP || PRODUCENT || POJEMNOŚĆ (TB) || STAN MAGAZYNOWY || CENA
 */
// karty graficzne - GRAPHICCARD
/*
ID || PRODUCENT || GEFORCE/RADEON || MODEL || PAMIĘĆ (GB) || STAN MAGAZYNOWY || CENA
 */