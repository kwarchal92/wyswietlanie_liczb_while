package wyswietlanie_liczb_while;

import java.io.*;
public class WyswietlanieLiczb {

    public static void main(String[] args)
        throws IOException
    {
        //Program wypisuje liczby z podanego przedziału i o podanym skoku do 2 miejsc po przecinku. Przy pomocy petli while.

        double a, b, c;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {

            System.out.println("Podaj początek przedziału: (liczba)");
            a = Double.parseDouble(br.readLine());
            System.out.println("Podaj koniec przedziału: (liczba)");
            b = Double.parseDouble(br.readLine());
            System.out.println("Co która liczba ma byc wyswietlana?");
            c = Double.parseDouble(br.readLine());

            System.out.print("Liczby z podanego przedzialu to: \t");
            System.out.printf("%2.2f" + '\t', a );

            while(a<b)
            {
                a = a+c;

                if (a<b)
                {
                    System.out.printf("%2.2f" + '\t', a);
                }
                else
                {
                    System.out.print("Aby wyswietlic wiecej liczb zwieksz zakres. " + '\t' );
                }
            }

        }
        catch(NumberFormatException exception)
        {
            System.out.println("Bledne dane, wprowadz liczby");
        }
    }
}
