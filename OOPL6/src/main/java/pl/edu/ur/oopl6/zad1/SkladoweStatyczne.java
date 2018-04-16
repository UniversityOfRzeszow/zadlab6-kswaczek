package pl.edu.ur.oopl6.zad1;

public class SkladoweStatyczne {

    public static void main(String[] args) {
        // TODO zad 3

        System.out.format("Pole koła: " + "%.3f%n", Figury.PoleKola(0.5));
        System.out.format("Obwód koła: " + "%.3f%n", Figury.ObwodKola(0.5));
        System.out.format("Pole kwadratu: " + "%.3f%n", Figury.PoleKwadratu(0.5));
        System.out.format("Obwód kwadraru: " + "%.3f%n", Figury.ObwodKwadratu(0.5));
        System.out.format("Pole prostokąta: " + "%.3f%n", Figury.PoleProstokatu(0.5, 0.5));
        System.out.format("Obwód prostokąta: " + "%.3f%n", Figury.ObwodProst(0.5, 0.5));
        System.out.format("Pole stożka: " + "%.3f%n", Figury.PoleStozka(0.5, 0.5, 0.5));
        System.out.format("Objętość stożka: " + "%.3f%n", Figury.ObjetoscStozka(0.5, 0.5, 0.5));
        System.out.format("Pole walca: " + "%.3f%n", Figury.PoleWalca(0.5, 0.5, 0.5));
        System.out.format("Objętość walca: " + "%.3f%n", Figury.ObjetoscWalca(0.5, 0.5, 0.5));

    }

}
