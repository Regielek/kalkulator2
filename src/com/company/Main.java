package com.company;

import java.util.Scanner;

public class Main
{
    public static double getValue(String v)
    {
        double x, y;
        x = y = 0;

        boolean a;
        a = true;

        Scanner X = new Scanner(System.in);

        do {
            try {
                System.out.print("Podaj " + v + " liczbę: ");
                x = Double.parseDouble
                        (
                                X.nextLine().replace(",", ".")
                        );
                a = false;
            } catch (NumberFormatException e) {
                System.out.println("To nie jest liczba! ");
                a = true;
            }
        } while (a);

        return x;
    }

    public static void main(String[] args) {
        int down;

        double x, y, z;

        x = getValue("pierwszą");
        y = getValue("drugą");

        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");

        System.out.print("Podaj opcję: ");

        Scanner in = new Scanner(System.in);
        down = in.nextInt();

        switch(down)
        {
            case 1:
                    z = x + y;
                    System.out.println("Suma wynosi: " +z);
            break;

            case 2:
                    z = x - y;
                    System.out.println("Różnica wynosi: " +z);
            break;

            case 3:
                    z = x * y;
                    System.out.println("Iloczyn wynosi: " +z);
            break;

            case 4:
                    if (y == 0)
                        System.out.println("Nie dzielimy przez zero!");
                    else {
                        z = x / y;
                        System.out.println("Iloraz wynosi: " + z);
                    }
            break;

            default:
                System.out.println("Nie ma takiej opcji!");
        }
    }
}