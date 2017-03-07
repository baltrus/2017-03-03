package uzduotis2_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/6/2017.
 */
public class Uzduotis2_5 {
    public Uzduotis2_5() {

        System.out.println("Įveskite 5 pasirinktus skaičius:");
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        int[] masyvas = new int[5];
        for (int i = 0; i<masyvas.length; i++ ){
            System.out.println("Įveskite " + (i+1) + "'ą skaičių, skaičius turi būti sveikasis.");
            System.out.println("Jūsų skaičius yra: ");
            masyvas[i]= sc.nextInt();
            }

        for (int i = 0; i < masyvas.length; i++){
            System.out.println("Įvestas skaičius " + masyvas[i]);
            suma += masyvas[i];
        }
        System.out.println("Visų skaičių suma yra: "+suma);
        }

    }
