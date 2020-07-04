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

    public static void main(String[] args)
    {
        String down, answer;

        double x, y, z;

        boolean ADC = true;

        Scanner in = new Scanner(System.in);

        do
        {
        x = getValue("pierwszą");
        y = getValue("drugą");
            do
            {
            System.out.println("0. Wyjście z programu");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");

            System.out.print("Podaj opcję: ");

            down = in.nextLine();
            switch (down)
                {
                case "0":
                System.out.println("Wyszedłeś z programu!");
                ADC = false;
                break;

                case "1":
                    z = x + y;
                    System.out.println("Suma wynosi: " +z);
                    ADC = false;
                break;

                case "2":
                    z = x - y;
                    System.out.println("Różnica wynosi: " +z);
                    ADC = false;
                break;

                case "3":
                    z = x * y;
                    System.out.println("Iloczyn wynosi: " +z);
                    ADC = false;
                break;

                case "4":
                    if (y == 0)
                        System.out.println("Nie dzielimy przez zero!");
                    else {
                        z = x / y;
                        System.out.println("Iloraz wynosi: " + z);
                    }
                    ADC = false;
                break;

                default:
                    System.out.println("Nie ma takiej opcji!");
                    ADC = true;
                }
            }while (ADC);

        System.out.println("Czy chcesz dokonać obliczeń jeszcze raz?");
        System.out.println("Tak");
        System.out.println("Nie");
        System.out.print("Wybór: ");

        answer = in.nextLine();

        }while (answer.equals("Tak"));
    }
}