package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String statusas = "taip";
        double sk1, sk2;//kintamieji skaičiavimui
        double rez;//rezultatas
        char operacija;
        do {
            System.out.println("Įveskite kokia operacija darysite, galimos operacijos:+,-,*,/,&");
            operacija = S.next().charAt(0);
            /*
            System.out.println("Įveskite pirmą skaičių");
            sk1 = S.nextDouble();
            System.out.println("Įveskite antrą skaičių");
            sk2 = S.nextDouble();
             */
            switch (operacija) {
                case '+':
                    sk1 = pirmoSkaiciausUzklausa();
                    sk2 = antroSkaiciausUzklausa();
                    System.out.println(sk1 + " + " + sk2 + " = " + sudeti(sk1, sk2));
                    break;
                case '-':
                    System.out.println(atimti());
                    break;
                case '*':
                    sk1 = pirmoSkaiciausUzklausa();
                    sk2 = antroSkaiciausUzklausa();
                    dauginti(sk1, sk2);
                    break;
                case '/':
                    dalinti();
                    break;
                /*
                case '#':
                    sk1 = pirmoSkaiciausUzklausa();
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
                case '&':
                    sk1 = pirmoSkaiciausUzklausa();
                    sk2 = antroSkaiciausUzklausa();
                    for (int i = 0; i < 99; i++) {
                        rez = skaiciuotiFormule(sk1, sk2, i);
                        if (rez < 100) {
                            System.out.println("(" + sk2 + " + " + sk1 + ") * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + (101 + i) + " = " + rez + " < 100");
                        } else if (rez > 100) {
                            System.out.println("(" + sk2 + " + " + sk1 + ") * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + (101 + i) + " = " + rez + " > 100");
                        } else {
                            System.out.println("(" + sk2 + " + " + sk1 + ") * " + sk2 + " + (" + sk2 + " - " + sk1 + ") / " + sk1 + " * " + (101 + i) + " = " + rez + " = 100");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Nežinoma operacija");
                    break;
            }
            System.out.println("Norėdami skaičiuoti toliau įveskite taip, kitu atvėju bet kokį simbolį");
            statusas = S.next();
        } while (statusas.equals("taip"));
    }

    /**
     * Funkcija sudedanti 2 skaičių sudėtį ir gražinanti rezultatą.
     *
     * @param sk1 1 skaičius
     * @param sk2 2 skaičius
     * @return gražinamas rezultatas
     */
    static double sudeti(double sk1, double sk2) {
        return sk1 + sk2;
    }

    static void sudeti() {
        double sk1, sk2,rezultatas;
        sk1 = pirmoSkaiciausUzklausa();
        sk2 = antroSkaiciausUzklausa();
        rezultatas=sk1+sk2;
        System.out.println(sk1 + " + " + sk2 + " = " + rezultatas);
    }

    /**
     * Funkcija skaičių atėmimui, prašoma įvesti 2 skačius ir išvedamas rezultatas į ekraną.
     *
     * @return gražinamas rezultatas
     */
    static double atimti() {
        double sk1, sk2;
        sk1 = pirmoSkaiciausUzklausa();
        sk2 = antroSkaiciausUzklausa();
        System.out.print(sk1 + " - " + sk2 + " = ");
        return sk1 - sk2;
    }

    /**
     * Funkcija sudauginanti 2 skaičius ir išvedanti rezultatą į ekraną.
     *
     * @param sk1 1 skaičius
     * @param sk2 2 skaičius
     */
    static void dauginti(double sk1, double sk2) {
        double rezultatas;
        rezultatas = sk1 * sk2;
        System.out.println(sk1 + " * " + sk2 + " = " + rezultatas);
    }

    /**
     * Funkcija skirta dalybai, jei yra dalyba iš nulio rašoma kad dalyba iš nulio negalima, kitu atvėju rezultatas išvedamas į ekraną.
     */
    static void dalinti() {
        double sk1, sk2, rezultatas;
        sk1 = pirmoSkaiciausUzklausa();
        sk2 = antroSkaiciausUzklausa();
        if (sk2 == 0) {
            System.out.println("Dalyba iš nulio negalima");
        } else {
            rezultatas = sk1 / sk2;
            System.out.println(sk1 + " / " + sk2 + " = " + rezultatas);
        }
    }

    /**
     * Laboro gynimo formulė
     *
     * @param sk1 1 skaičius
     * @param sk2 2 skaičius
     * @param i   iteracija
     * @return gražinamas formulės rezultatas
     */
    static double skaiciuotiFormule(double sk1, double sk2, int i) {
        return (sk2 + sk1) * sk2 + (sk2 - sk1) / sk1 * (101 + i);
    }

    /**
     * Funkcija skirta 1 skaičiaus įvedimui kurie vėliau naudojami skaičiavimams.
     *
     * @return gražinamas įvestas skaičius
     */
    static double pirmoSkaiciausUzklausa() {
        double sk1;
        Scanner S = new Scanner(System.in);
        System.out.println("Įveskite pirmą skaičių");
        sk1 = S.nextDouble();
        return sk1;
    }

    /**
     * Funkcija skirta 2 skaičiaus įvedimui kurie vėliau naudojami skaičiavimams.
     *
     * @return gražinamas įvestas skaičius
     */
    static double antroSkaiciausUzklausa() {
        double sk2;
        Scanner S = new Scanner(System.in);
        System.out.println("Įveskite antrą skaičių");
        sk2 = S.nextDouble();
        return sk2;
    }
}