package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String statusas = "taip";
        double sk1, sk2;//kintamieji skaičiavimui
        double rez;//rezultatas
        char operacija;
        Scanner S = new Scanner(System.in);
        do {
            System.out.println("Įveskite kokia operacija darysite, galimos operacijos:+,-,*,/");
            operacija = S.next().charAt(0);
            /*
            System.out.println("Įveskite pirmą skaičių");
            sk1 = S.nextDouble();
            System.out.println("Įveskite antrą skaičių");
            sk2 = S.nextDouble();
             */
            switch (operacija) {
                case '+':
                    sk1 = pirmoskaiciausUzklausa();
                    sk2 = antroSkaiciausUzklausa();
                    System.out.println(sk1 + " + " + sk2 + " = " + sudeti(sk1, sk2));
                    break;
                case '-':
                    System.out.println(atimti());
                    break;
                case '*':
                    sk1 = pirmoskaiciausUzklausa();
                    sk2 = antroSkaiciausUzklausa();
                    dauginti(sk1, sk2);
                    break;
                case '/':
                    dalinti();
                    break;
                /*
                case '#':
                    sk1 = pirmoskaiciausUzklausa();
                    sk2 = antroSkaiciausUzklausa();
                    for (int i = 0; i < 13; i++) {
                        rez = sk1 * sk2 + (sk2 - sk1) / sk1 * (13 + i);
                        if (rez < 6) {
                            System.out.println(sk1 + " * " + sk2 + " ( " + sk2 + " - " + sk1 + ") / " + sk1 + " * " + (13 + i) + " = " + rez + " < 6");
                        } else if (rez > 6) {
                            System.out.println(sk1 + " * " + sk2 + " ( " + sk2 + " - " + sk1 + ") / " + sk1 + " * " + (13 + i) + " = " + rez + " > 6");
                        } else {
                            System.out.println(sk1 + " * " + sk2 + " ( " + sk2 + " - " + sk1 + ") / " + sk1 + " * " + (13 + i) + " = " + rez + " == 6");
                        }
                        System.out.println();
                    }
                    break;
                 */
                default:
                    System.out.println("Nežinoma operacija");
                    break;
            }
            System.out.println("Norėdami skaičiuoti toliau įveskite taip, kitu atvėju bet kokį simbolį");
            statusas = S.next();
        } while (statusas.equals("taip"));
    }

    static double sudeti(double sk1, double sk2) {
        return sk1 + sk2;
    }

    static double atimti() {
        double sk1, sk2;
        sk1 = pirmoskaiciausUzklausa();
        sk2 = antroSkaiciausUzklausa();
        System.out.print(sk1 + " - " + sk2 + " = ");
        return sk1 - sk2;
    }

    static void dauginti(double sk1, double sk2) {
        double rez;
        rez = sk1 * sk2;
        System.out.println(sk1 + " * " + sk2 + " = " + rez);
    }

    static void dalinti() {
        double sk1, sk2, rez;
        sk1 = pirmoskaiciausUzklausa();
        sk2 = antroSkaiciausUzklausa();
        if (sk2 == 0) {
            System.out.println("Dalyba iš nulio negalima");
        } else {
            rez = sk1 / sk2;
            System.out.println(sk1 + " / " + sk2 + " = " + rez);
        }
    }

    static double pirmoskaiciausUzklausa() {
        double a;
        Scanner S = new Scanner(System.in);
        System.out.println("Įveskite pirmą skaičių");
        a = S.nextDouble();
        return a;
    }

    static double antroSkaiciausUzklausa() {
        double b;
        Scanner S = new Scanner(System.in);
        System.out.println("Įveskite antrą skaičių");
        b = S.nextDouble();
        return b;
    }
}
