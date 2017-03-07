package uzduotis2_2;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

/**
 * Created by Baltramiejus Jakstys on 3/6/2017.
 */
public class Uzduotis2_2 {
    public Uzduotis2_2() {
        while (true) {
            System.out.println("Įveskite sugalvotą žodį ir aš jį atspausdinsiu, nebent parašytum žodį pabaiga, programa užsidarytų");
            Scanner sc = new Scanner(System.in);
            String zodis = sc.nextLine();
            if (!zodis.equals("pabaiga")) {
                System.out.println(zodis);
            } else {
                System.out.println("Programa baigta");
                break;
            }
        }
    }
}
