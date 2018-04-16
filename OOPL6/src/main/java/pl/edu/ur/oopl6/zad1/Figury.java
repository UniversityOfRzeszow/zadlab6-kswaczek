package pl.edu.ur.oopl6.zad1;

public class Figury {

    /**
     * Inicjalizator statyczny
     */
    static {
        System.out.println("Biblioteka obliczająca wielkość figur geometrycznych!!!");
    }

    /**
     * Metoda statyczna obliczająca pole koła
     */
    public static double PoleKola(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    /**
     * Metoda statyczna obliczająca obwód koła
     */
    public static double ObwodKola(double r) {
        return 2 * Math.PI * r;
    }

    public static double PoleKwadratu(double a) {
        return a * a;
    }

    public static double ObwodKwadratu(double a) {
        return 4 * a;
    }

    public static double PoleProstokatu(double a, double b) {
        return a * b;
    }

    public static double ObwodProst(double a, double b) {
        return 2 * a + 2 * b;
    }

    public static double PoleStozka(double r, double l, double h) {
        l = Math.sqrt(Math.pow(h, 2) + Math.pow(r, 2));
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;

    }

    public static double ObjetoscStozka(double r, double l, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double PoleWalca(double r, double l, double h) {
        int Pp, Pb;
        Pp = (int) (Math.PI * Math.pow(r, 2));
        Pb = (int) (2 * Math.PI * r * h);
        return 2 * (Pp + Pb);
    }

    public static double ObjetoscWalca(double r, double l, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

}
