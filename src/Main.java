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

        /*
            If Else itd.
        */

        /*
            int pochybienie = 0;

            if (liczba_docelowa == wylosowana_liczba) {
                System.out.println("Zgadłeś :D");
            } else {
                System.out.println("Nie zgadłeś :(");


                    Zmiana danych - wyrażenia warunkowe


                pochybienie = liczba_docelowa > wylosowana_liczba ? liczba_docelowa - wylosowana_liczba : wylosowana_liczba - liczba_docelowa;

                System.out.println("Pochybienie o: " + pochybienie);

                pochybienie = pochybienie / 10;

                switch (pochybienie) {
                    case 0:
                        System.out.println("było blisko byq");
                        break;
                    case 1:
                        System.out.println("wystarczająco");
                        break;
                    case 2:
                        System.out.println("Mogło być lepiej");
                        break;
                    default:
                        System.out.println("FF 15");
                }


                    Inny zapis switcha


                System.out.println(
                        switch (pochybienie) {
                            case 0 -> "Było blisko byq";
                            case 1 -> "Wystarczająco";
                            case 2 -> "Mogło być lepiej";
                            default -> "FF 15";
                        }
                );
            }
        */

        /*
            Pętla For
        */

        /*
            for (int i = 0; i < 10; i++) {
                System.out.println("podaj liczbę");
                liczba_docelowa = klawiatura.nextInt();
                if (liczba_docelowa == wylosowana_liczba) {
                    System.out.println("zgadłeś :D");
                    break;
                }
            }
        */
        /*
            Pętla While
        */

        do {
            System.out.println("Podaj liczbę");
            liczba_docelowa = klawiatura.nextInt();
            if (liczba_docelowa > wylosowana_liczba) {
                System.out.println("Wpisano za dużo");
            } else if (liczba_docelowa < wylosowana_liczba){
                System.out.println("Wpisano za mało");
            }
        } while (liczba_docelowa != wylosowana_liczba);
        System.out.println("Wygrana");
    }
}