package pl.edu.ur.oopl6.zad2;

public class Punkt { //tworzenie publicznej klasy

    private int x; //deklaracja zmiennych
    private int y;
    private int z;

    // Pole statyczne przechowujące w pamięci ilość obiektów klasy Punkt
    // Pole jest współdzielone dla wszystkich obiektów
    private static int counter;  // tworzenie statycznej metody int
    public static Punkt last_point;

    public Punkt(int x, int y, int z) { // Przypisanie wartości
        this.x = x;
        this.y = y;
        this.z = z;
        counter++;
        last_point = this;
    }

    public static void PokazOstatniObiekt() { // tworzenie statycznej metody void
        System.out.println("Klasa Punkt o współrzędnych (x = " + last_point.x //wyswietlenie komunikatu
                + " y = " + last_point.y + "" //dzialania + komunikat
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.");
    }

    @Override
    public String toString() {
        String s = "Klasa Punkt o współrzędnych (x = " + last_point.x
                + " y = " + last_point.y + ""
                + " z = " + last_point.z + "). Istnieje już"
                + " " + last_point.counter + " obiekt tej klasy.";
        return s;
    }

}
