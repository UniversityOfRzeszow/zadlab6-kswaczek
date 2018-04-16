/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl6.zad1;

/**
 *
 * @author Kasia
 */
public class Complex {

    private final double a;
    private final double b;

    public Complex(double r, double i) {
        a = r;
        b = i;

    }

    // @Override
    public String zmiana() {

        if (a == 0) {
            return b + "i";
        }

        if (b == 0) {
            return a + "";
        }

        if (b < 0) {
            return a + "-" + (-b) + "i";
        }
        return a + "+" + b + "i";
    }

    public double a() {
        return a;
    }

    public double b() {
        return b;
    }

    public double modul() { //Modul liczby zespolonej
        return Math.hypot(a, b);
    }

    public Complex plus(Complex x) {
        Complex y = this;
        double r = y.a + x.a;
        double i = y.b + x.b;
        return new Complex(r, i);
    }

    public Complex minus(Complex x) {
        Complex y = this;
        double r = y.a - x.a;
        double i = y.b - x.b;
        return new Complex(r, i);
    }

    public Complex mn(Complex x) {
        Complex y = this;
        double r = y.a * x.a - y.b * x.b;
        double i = y.a * x.b - y.b * x.a;
        return new Complex(r, i);
    }

    public Complex sprz() { //Liczba sprzężona do liczby zespolone
        return new Complex(a, -b);
    }

    public Complex sc(double alfa) {
        return new Complex(alfa * a, alfa * b);
    }

    public Complex odwrotnosc() {
        double sc = a * a + b * b;
        return new Complex(a / sc, -b / sc);
    }

    public Complex dz(Complex x) {
        Complex y = this;
        return y.mn(x.odwrotnosc());
    }

    public Complex alge() { //Liczba zespolona algebraiczna w postaci wykladniczej
        return new Complex(Math.exp(a) * Math.cos(b), Math.exp(a) * Math.sin(b));
    }

    public Complex cos() {
        return new Complex(Math.cos(a) * Math.cosh(b), -Math.sin(a) * Math.sinh(b));
    }

    public Complex sin() {
        return new Complex(Math.sin(a) * Math.cosh(b), Math.cos(a) * Math.sinh(b));
    }

    public Complex tan() { //Liczba zespolona w postaci trygonometrycznej
        return sin().dz(cos());
    }

    public static Complex plus(Complex y, Complex x) {
        double r = y.a + x.a;
        double i = y.b + x.b;
        Complex sum = new Complex(r, i);
        return sum;
    }
}
