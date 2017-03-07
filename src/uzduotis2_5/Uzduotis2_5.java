package uzduotis2_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/6/2017.
 */
public class Uzduotis2_5 {

    public int[] masyvas;

    public Uzduotis2_5() {}

    public void nuskaitymas(int ilgis) {
        Scanner sc = new Scanner(System.in);
        masyvas = new int[ilgis];
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Įveskite " + (i + 1) + "'ą skaičių, skaičius turi būti sveikasis.");
            System.out.println("Jūsų skaičius yra: ");
            masyvas[i] = sc.nextInt();
        }
    }
    public void skaiciavimas() {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("Įvestas skaičius " + masyvas[i]);
            suma += masyvas[i];
        }
        System.out.println("Visų skaičių suma yra: " + suma);
    }
}

