package start.baza;

public class danych {

    public static String [][]CASE=new String [9][9];
    public static String [][]PROCESSOR=new String [20][9];
    public static String [][]MOTHERBOARD=new String [10][8];
    public static String [][]RAM=new String [10][7];
    public static String [][]ACCESSORY=new String [10][5];
    public static String [][]HARDDRIVE=new String [10][6];
    public static String [][]GRAPHICCARD=new String [10][8];
    public static String [][]SOUNDCARD=new String [6][8];
    public static String [][]POWERSUPPLY=new String [10][6];
    public static String [][]OS=new String [8][7];
    public static String [][]SOFTWARE=new String [10][5];
    public static String [][]SCREEN=new String [10][5];
    public static String [][]COOLING=new String [14][7];
    public static String [][]NIC=new String [7][7];
    public static String [][]DRIVE=new String [4][8];
}

// monitory - SCREEN
/*
ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ
 */
// oprogramowanie - SOFTWARE
/*
ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ
 */
// akcesoria - ACCESSORY
/*
ID || NAZWA || CENA || STAN MAGAZYNOWY || RODZAJ
 */
// procesory - PROCESSOR
/*
ID || PRODUCENT || MODEL || RDZENIE || TAKTOWANIE || SOCKET || STAN MAGAZYNOWY || CENA || MOC
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
ID || PRODUCENT || GEFORCE/RADEON || MODEL || PAMIĘĆ (GB) || POBÓR MOCY || STAN MAGAZYNOWY || CENA
 */
// obudowy - CASE
/*
ID || PRODUCENT || MODEL || PORTY525" || PORTY35" || MAX WYS. CHŁODZENIA || STAN MAG. || CENA
*/
// chłodzenie - COOLING
/*
ID || PRODUCENT || MODEL || RODZAJ || ROZMIAR || STAN MAG. || CENA
 */
//karty sieciowe - NIC
/*
ID || PRODUCENT || MODEL || RODZAJ || PREDKOSC || STAN MAG. || CENA
 */
// karty dźwiękowe - SOUNDCARD
/*
ID || PRODUCENT || MODEL || SNR || WYJSCIE OPTYCZNE || WZMACNIACZ SLUCHAWKOWY || STAN MAG. || CENA
 */
