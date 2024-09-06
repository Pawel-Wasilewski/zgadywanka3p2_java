import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wylosowana_liczba = (int) (Math.random() * 100 + 1);
        /*
            rzutowanie danych

            typy proste przechowują tylko wartość:
            - boolean
            - byte, short, int, long (wartości)
            - float, double (wartości niepełne)
            - char (znakowy)

            typy złożone - obiekty własności i metody
            - string
            - integer
            - kosc

         */
        System.out.println(wylosowana_liczba);
        /*
            wczytywanie z klawiatury
         */

        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba_docelowa = klawiatura.nextInt();
    }
}